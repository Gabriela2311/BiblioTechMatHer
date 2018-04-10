package file;

import domain.Audiovisual;
import domain.Book;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AudiovisualFile {
    
    //atributos 
    public RandomAccessFile RAFaudiovisual;
    private int AudioQuantity; //cantidad de registros 
    private int AudioReg; //el tamaño en bytes
    private String FilePath; //ruta del archivo
    
    ArrayList<Audiovisual> arrayListOfAudiovisuals = new ArrayList<>();
    
    //Constructor 
    public AudiovisualFile() {
        try {
            this.FilePath = "Audiovisual.dat";
            File file = new File(FilePath);
            start(file);
        } catch (IOException IOE) {
            Logger.getLogger(AudiovisualFile.class.getName()).log(Level.SEVERE, null, IOE);
        }

    } //initialize the file
    private void start (File file) throws IOException{
        this.FilePath = file.getPath();
        this.AudioReg = 190;
        
        if(file.exists() && !file.isFile()){
         throw new IOException(file.getName() + "is an invalid file");
        } else{
            RAFaudiovisual = new RandomAccessFile(file, "rw");
            this.AudioQuantity = (int)Math.ceil((double)RAFaudiovisual.length() / (double) AudioReg);
        }
    }//end method start 
    
    //return the size of the file
    public int sizeFile(){
        return this.AudioReg;
    }//end method sizeFile
    
    //method to insert an Audiovisual in a specific position
    public boolean insertAudiovisual(int position, Audiovisual audToInsert) throws IOException{
        
        if(position>=0 && position<=this.AudioQuantity){
            
            if(audToInsert.sizeInBytes()>this.AudioReg){
                System.err.println("101 - record size is too large");
                return false;
            }else{
                RAFaudiovisual.seek(position*this.AudioReg);
                RAFaudiovisual.writeUTF(audToInsert.getType());
                RAFaudiovisual.writeUTF(audToInsert.getBrand());
                RAFaudiovisual.writeUTF(audToInsert.getModel());
                RAFaudiovisual.writeBoolean(audToInsert.isAvailability());
                RAFaudiovisual.writeUTF(audToInsert.getSerie());
                RAFaudiovisual.writeUTF(audToInsert.getYear());
                RAFaudiovisual.writeUTF(audToInsert.getCod());
                return true; 
            }
        }else{
            System.err.println("102-position is out of bounds");
        }
    return true;
    }//end method insertAudiovisual
    
    //method to insert to the end of the file
    public boolean addEndAud(Audiovisual audiovisual) throws IOException{
        
        boolean success = insertAudiovisual(this.AudioQuantity, audiovisual);
        
        if(success){
            ++this.AudioQuantity;
        }
    return success;
    }//end method addEndAud
    
    //method to get an audiovisual by position
    public Audiovisual getAudByPosition(int position){
        
        if(position>=0 && position<= AudioQuantity){
            try {
                this.RAFaudiovisual.seek(position*AudioReg);
                Audiovisual audiovisual = new Audiovisual();
                audiovisual.setType(this.RAFaudiovisual.readUTF());
                audiovisual.setBrand(this.RAFaudiovisual.readUTF());
                audiovisual.setModel(this.RAFaudiovisual.readUTF());
                audiovisual.setAvailability(this.RAFaudiovisual.readBoolean());
                audiovisual.setSerie(this.RAFaudiovisual.readUTF());
                audiovisual.setYear(this.RAFaudiovisual.readUTF());
                audiovisual.setCod(this.RAFaudiovisual.readUTF());
                
                if(audiovisual.getBrand().equalsIgnoreCase("audiovisual removed")){
                    return null;
                }else{
                    return audiovisual;
                }//end if-else
            } catch (IOException ioe) {
                System.err.println("Error in getAudByPosition");
            }//end try-catch
        }
    return null;
    }//end getAudByPosition
    
    //Take the records to the file and put them in a list
    public List<Audiovisual> getAllAudiovisuals(){
        List<Audiovisual> audiovisuals = new ArrayList<Audiovisual>();
        
        for (int i = 0; i < AudioQuantity; i++) {
            Audiovisual audTemp = getAudByPosition(i);
            
            if(audTemp !=null){
                audiovisuals.add(audTemp);
            }//end if
        }//end for
    return audiovisuals;
    }//end method getAllAudiovisuals
    
    public boolean availabilityAudio(String code, String brand, String device) throws IOException{
        
        Audiovisual audioTemp;
        
        for (int i = 0; i < this.AudioQuantity; i++) {
            audioTemp = this.getAudByPosition(i);
            if (audioTemp.isAvailability() == true) {
                if(audioTemp.getCod().equalsIgnoreCase(code) && audioTemp.getBrand().equalsIgnoreCase(brand) &&  audioTemp.getType().equalsIgnoreCase(device)){
                    audioTemp.setAvailability(false);
            
                    return this.insertAudiovisual(i, audioTemp);
                }// fin del if
                
            }// fin del if

        }//end for
        
        return false;
        
    }// end method 
    
            public boolean availabilityISfalse(String cod, String brand) throws IOException{
        
        Audiovisual audioTemp;
        
        for (int i = 0; i < this.AudioQuantity; i++) {
            audioTemp = this.getAudByPosition(i);
            if (audioTemp.isAvailability() == false) {
                if(audioTemp.getCod().equalsIgnoreCase(cod) && audioTemp.getBrand().equalsIgnoreCase(brand)){
                    audioTemp.setAvailability(true);
            
                    return this.insertAudiovisual(i, audioTemp);
                }// fin del if
                
            }// fin del if

        }//end for
        
        return false;
        
    }// end method 
    
    //busca el audiovisual por el codigo y retorna un boolean 
    public boolean searchCod(String code){
            
            Audiovisual audioTemp;
            
            for (int i = 0; i < this.AudioQuantity; i++) {
                
                audioTemp = this.getAudByPosition(i);
                
                if(code.equalsIgnoreCase(audioTemp.getCod())){
                    return true;
                }// fin del if 
                
            }// fin del for 
            
        return false;
        
        }// fin del metodo 
    
    //busca el audiovisual por el codigo y retorna la marca
    public String searchCode(String code){
            
        Audiovisual audioTemp;
            
        for (int i = 0; i < this.AudioQuantity; i++) {
            audioTemp = this.getAudByPosition(i);
                
            if(code.equalsIgnoreCase(audioTemp.getCod())){
                return  audioTemp.getBrand();
            } 
                 
        }
        return "";
        }
    
    //busca el audiovisual por la marca y retorna un boolean  
    public boolean searchBra(String brand){
            
        Audiovisual audioTemp;
            
        for (int i = 0; i < this.AudioQuantity; i++) {
            audioTemp = this.getAudByPosition(i);
                
            if(brand.equalsIgnoreCase(audioTemp.getBrand())){
                return true;
            }// Fin del else 

            }// Fin del for
        
        return false;
        
    }// fin del metodo searchBra 
    
    //busca el audiovisual por la marca  y retorna el code  
    public String searchBrand(String brand){
            
        Audiovisual audioTemp;
            
        for (int i = 0; i < this.AudioQuantity; i++) {
            audioTemp = this.getAudByPosition(i);
                
            if(brand.equalsIgnoreCase(audioTemp.getBrand())){
                return audioTemp.getCod();
            }
            }// Fin del for
        return "";
    }// fin del metodo searchBra 
    
        public String generateCod() {

       return "" + (String.format("%05d", AudioQuantity));
        
    
    }
    
}
