
package file;

import domain.BookLoans;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class BookLoansFile {
    
    //Insertar en el archivo 
    public void insertLoansBook(BookLoans insertBook){
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    
    try{
        fos = new FileOutputStream("./LoansBook.dat",true);
        oos = new ObjectOutputStream(fos);
        oos.writeObject(insertBook);
    
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
    
    }//fin insertLoansBook
    
    public ArrayList<BookLoans> getListBook(){
       
        ArrayList<BookLoans> myArrayList = new ArrayList<>();
        
        try{
            
            FileInputStream fis = new FileInputStream("./LoansBook.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            BookLoans BookTemp;
            BookTemp= (BookLoans) ois.readObject();
            
            while(BookTemp!=null){
                myArrayList.add(BookTemp);
                ois = new ObjectInputStream(fis);
                BookTemp= (BookLoans) ois.readObject();
            }
            
        }catch(ClassNotFoundException cnfe){
            
        }catch(IOException ioe){
            return myArrayList;
        }
        return null;
    }
    

    public void delete(ArrayList<BookLoans> arrayList, String id){
        
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    
    try{
        fos = new FileOutputStream("./LoansBook.dat");
        oos = new ObjectOutputStream(fos);
        ArrayList<BookLoans> newArray= new ArrayList<>();
        
        for (int i = 0; i < arrayList.size(); i++) {
            if(!arrayList.get(i).getId().equalsIgnoreCase(id)){
                newArray.add(arrayList.get(i));
            
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
            System.out.println("Problem ioe");
            
        }
    }
        
    }
    
}
