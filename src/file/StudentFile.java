package file;

import domain.Book;
import domain.Student;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentFile extends Student{
    
    //atributos 
    public RandomAccessFile randomAccessFile;
    private int studentQuantity; //cantidad de registros que tiene mi archivo
    private int regSize; //el tamaño en bytes de mis registrod(tamaño maximo lo define el programador)
    private String FilePath; //ruta del archivo

    //Constructor 
    public StudentFile(File file) throws IOException {

        //guardar la ruta del archivo 
        this.FilePath = file.getPath();

        //tamaño máximo de cada registro en el archivo
        this.regSize = 500;

        //una validación básica de file 
        if (file.exists() && !file.isFile()) {

            throw new IOException(file.getName() + " is an invalid file");
        } else {
            //crear una nueva instancia de RAF 
            randomAccessFile = new RandomAccessFile(file, "rw");

            //necesitamos indicar cuantos registros tiene el archivo 
            this.studentQuantity = (int) Math.ceil((double) randomAccessFile.length() / (double) this.regSize);
        }

    }//end method 

    //metodo para insertar un estudiante en una posición específica 
    public boolean insertStudent(int position, Student studentToInsert) throws IOException {

        //validación de posición 
        if (position >= 0 && position <= this.studentQuantity) {

            //verificar que el tamaño sea el adecuado 
            if (studentToInsert.sizeInBytes() > this.regSize) {
                System.err.println("101 - record size is too large");
                return false;
            } else {
                //escribir en el archivo
                randomAccessFile.seek(position * this.regSize);
                randomAccessFile.writeUTF(studentToInsert.getName());
                randomAccessFile.writeUTF(studentToInsert.getYearOfIncome());
                randomAccessFile.writeUTF(studentToInsert.getLastName());
                randomAccessFile.writeUTF(studentToInsert.getCareer());
                randomAccessFile.writeUTF(studentToInsert.getId());
                return true;
            }
        } else {
            System.err.println("102 - position is out of bounds");
        }

        return true;
    }// end method 

    //método para insertar al final del archivo 
    public boolean addEndStudent(Student student) throws IOException {

        boolean success = insertStudent(this.studentQuantity, student);

        if (success) {

            ++this.studentQuantity;
        }

        return success;
    }

    //obtener un estudiante en una posicion especifica  
    public Student getStudent(int position) throws IOException {
    
        //validar posición 
        if (position >= 0 && position <= this.studentQuantity) {
            try {
                //brazo en la posicion adecuada
                randomAccessFile.seek(position * this.regSize);
                //leemos los datos
                Student studTemp = new Student();
                studTemp.setName(randomAccessFile.readUTF());
                studTemp.setLastName(randomAccessFile.readUTF());
                studTemp.setYearOfIncome(randomAccessFile.readUTF());
                studTemp.setCareer(randomAccessFile.readUTF());
                studTemp.setId(randomAccessFile.readUTF());

            if (studTemp.getId().equals("removed")) {
                return null;
            } else {
                return studTemp;
            }
            } catch (IOException ioe) {
                System.err.println("Error in getBookByPosition");
            }//end try-catch            
        } else {
            System.err.println("103 - position is out of bounds");
            return null;
        }
        return null;
    }// end method

    //metodo para retornar todos los vehiculos 
    public List<Student> getStudentList() throws IOException {
        
        //crear una instancia de ArrayList 
         List<Student> studentsList = new ArrayList<>();
         
        //recorrer el arreglo para insertar la lista 
        for (int i = 0; i < this.studentQuantity; i++) {
            Student studentTemp = this.getStudent(i);

            //insertar el vehiculo en la lista 
            if (studentTemp != null) {
                studentsList.add(studentTemp);
            }

        }
        return studentsList;
    }//end method 

    //busca el estudiate por el carnet
    public boolean searchStudent(String id)throws IOException{
            
        Student studentTemp;
            
        for (int i = 0; i < this.studentQuantity; i++) {
            
            studentTemp = this.getStudent(i);
            
            if(studentTemp.getId().equalsIgnoreCase(id)){
                return true;
            }
            
            }// Fin del for
        
        return false;
        
    }// fin del metodo 
    
    //metodo para retornar el carnet
    public String generateID(String career, String year) {

        String carne = "";

        if (career.equalsIgnoreCase("Agronomía")) {
            carne = "A" + year.charAt(year.length() - 1)+(String.format("%03d", studentQuantity));
        } else if (career.equalsIgnoreCase("Educación")) {
            carne = "E" + year.charAt(year.length() - 1)+(String.format("%03d", studentQuantity));
        } else {
            carne = "I" + year.charAt(year.length() - 1)+(String.format("%03d", studentQuantity));
        }
     return carne;
    }// fin del metodo
    
}// fin de la clase 
