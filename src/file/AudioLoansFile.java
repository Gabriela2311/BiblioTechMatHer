package file;

import domain.AudioLoans;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AudioLoansFile {

    //Insertar en el archivo 
    public void insertLoansAudio(AudioLoans insertAudio){
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    
    try{
        fos = new FileOutputStream("./LoansAudio.dat",true);
        oos = new ObjectOutputStream(fos);
        oos.writeObject(insertAudio);
    
    }catch(FileNotFoundException fnfe){
        
    }catch(IOException ioe){
        
    }finally{
        try{
            if(fos!=null)
                fos.close();
            if(oos!=null)
                oos.close();
        }catch(IOException ioe){
            System.err.println("Problem ioe");
            
        }
    }
    
    }//fin insertLoansAudio
    
    public ArrayList<AudioLoans> getListAudio(){
       
        ArrayList<AudioLoans> arrayList = new ArrayList<>();
        
        try{
            
            FileInputStream fis = new FileInputStream("./LoansAudio.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            AudioLoans audioTemp;
            audioTemp= (AudioLoans) ois.readObject();
            
            while(audioTemp!=null){
                arrayList.add(audioTemp);
                ois = new ObjectInputStream(fis);
                audioTemp= (AudioLoans) ois.readObject();
            }
            
        }catch(ClassNotFoundException cnfe){
            
        }catch(IOException ioe){
            return arrayList;
        }
        return null;
    }//fin getListAudio
    

    public void delete(ArrayList<AudioLoans> array,String ID){
        
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    
    try{
        fos = new FileOutputStream("./LoansAudio.dat");
        oos = new ObjectOutputStream(fos);
        ArrayList<AudioLoans> newArray= new ArrayList<>();
        
        for (int i = 0; i < array.size(); i++) {
            if(!array.get(i).getId().equalsIgnoreCase(ID)){
                newArray.add(array.get(i));
            
            }  
        }
        for (int i = 0; i < newArray.size(); i++) {
            oos.writeObject(newArray.get(i));
            
        }
        
        
    }catch(FileNotFoundException fnfe){
        
    }catch(IOException ioe){
        
    }finally{
        try{
            if(fos!=null)
                fos.close();
            if(oos!=null)
                oos.close();
        }catch(IOException ioe){
            System.err.println("Problem ioe");
            
        }
    }
        
    }
}
