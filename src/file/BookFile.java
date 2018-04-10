package file;

import domain.Book;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookFile extends Book {
    
    //atributos 
    public RandomAccessFile RAFbook;
    private int bookQuantity;
    private int bookReg;
    private String FilePath;
    
    ArrayList<Book> arrayListOfBooks = new ArrayList<>();
    
    //constructor 
    public BookFile(){
        try {
            this.FilePath = "Book.dat";
            File file = new File(FilePath);
            start(file);
        } catch (IOException IOE) {
            Logger.getLogger(BookFile.class.getName()).log(Level.SEVERE, null, IOE);
        }
    }//Initialize the file
    
    private void start(File file) throws IOException{
        
        this.FilePath = file.getPath();
        this.bookReg = 190;
        
        if(file.exists() && !file.isFile()){
        throw new IOException(file.getName()+"is an invalid file");
            
        }else{
            RAFbook = new RandomAccessFile(file, "rw");
            this.bookQuantity = (int)Math.ceil((double)RAFbook.length() / (double)bookReg);
        }//end if-else 
    }//end method start 
    
    //return the size of the file 
    public int sizeFile(){
        return this.bookReg;
    }//end method sizeFile
    
    //method to insert a book in a specific position 
    public boolean insertBook(int position, Book bookToInsert) throws IOException{
        
        if(position>=0 && position<=this.bookQuantity){
            
            if(bookToInsert.sizeInBytes()>this.bookReg){
                System.err.println("101- record size is too large");
                return false; 
            }else{
                RAFbook.seek(position*this.bookReg);
                RAFbook.writeUTF(bookToInsert.getTitle());
                RAFbook.writeUTF(bookToInsert.getYear());
                RAFbook.writeUTF(bookToInsert.getEditorial());
                RAFbook.writeUTF(bookToInsert.getAutor());
                RAFbook.writeUTF(bookToInsert.getFormat());
                RAFbook.writeBoolean(bookToInsert.isAvailability());
                RAFbook.writeUTF(bookToInsert.getISBN());
                return true;
            }
        }else{
            System.err.println("102-position is out of bounds");
        }
        return true;
    }//end method insertBook
    
    //method to insert to the end of the file
    public boolean addEndBook(Book book) throws IOException{
        
        boolean success = insertBook(this.bookQuantity, book);
        
        if(success){
            ++this.bookQuantity;
        }
        return success;
    }//end method addEndBook
    
    //method to get a book by position 
    public Book getBookByPosition(int position){
        
        if(position>=0 && position<=bookQuantity){
            try {
                this.RAFbook.seek(position*bookReg);
                Book book = new Book(); 
                book.setTitle(this.RAFbook.readUTF());
                book.setYear(this.RAFbook.readUTF());
                book.setEditorial(this.RAFbook.readUTF());
                book.setAutor(this.RAFbook.readUTF());
                book.setFormat(this.RAFbook.readUTF());
                book.setAvailability(this.RAFbook.readBoolean());
                book.setISBN(this.RAFbook.readUTF());
                
                if (book.getTitle().equalsIgnoreCase("book removed")){
                  return null; 
                }else{
                    return book;
                }//end if-else
            } catch (IOException ioe) {
                System.err.println("Error in getBookByPosition");
            }//end try-catch
        }
        return null;
    }//end getBookByPosition
    
    //Take the records to the file and put them in a list
    public List<Book> getAllBooks(){
        List<Book> books = new ArrayList<>();
        
        for (int i = 0; i < bookQuantity; i++) {
            Book bookTemp = getBookByPosition(i);
            
            if(bookTemp !=null){
                books.add(bookTemp);
            }//end if
        }//end for
        return books;
    }//end method getAllBooks
    
    public boolean availabilityBook(String cod, String title) throws IOException{
        
        Book bookTemp;
        
        for (int i = 0; i < this.bookQuantity; i++) {
            bookTemp = this.getBookByPosition(i);
            if (bookTemp.isAvailability() == true) {
                if(bookTemp.getISBN().equalsIgnoreCase(cod) && bookTemp.getTitle().equalsIgnoreCase(title)){
                    bookTemp.setAvailability(false);
            
                    return this.insertBook(i, bookTemp);
                }// fin del if
                
            }// fin del if

        }//end for
        
        return false;
        
    }// end method 
    
        public boolean availabilityISfalse(String cod, String title) throws IOException{
        
        Book bookTemp;
        
        for (int i = 0; i < this.bookQuantity; i++) {
            bookTemp = this.getBookByPosition(i);
            if (bookTemp.isAvailability() == false) {
                if(bookTemp.getISBN().equalsIgnoreCase(cod) && bookTemp.getTitle().equalsIgnoreCase(title)){
                    bookTemp.setAvailability(true);
            
                    return this.insertBook(i, bookTemp);
                }// fin del if
                
            }// fin del if

        }//end for
        
        return false;
        
    }// end method 
    
    //busca el libro por el codigo y retorna un boolean 
    public boolean searchCod(String cod){
            
            Book bookTemp;
            
            for (int i = 0; i < this.bookQuantity; i++) {
                
                bookTemp = this.getBookByPosition(i);
                
                if(cod.equalsIgnoreCase(bookTemp.getISBN())){
                    return true;
                }// fin del if 
                
            }// fin del for 
            
        return false;
        
        }// fin del metodo 
    
    //busca el libro por el codigo y retorna el titulo
    public String searchCode(String code){
            
        Book bookTemp;
            
        for (int i = 0; i < this.bookQuantity; i++) {
            bookTemp = this.getBookByPosition(i);
                
            if(code.equalsIgnoreCase(bookTemp.getISBN())){
                return  bookTemp.getTitle();
            } 
                 
        }
        return "";
        }
    
    //busca el libro por el titulo y retorna un boolean  
    public boolean searchTitl(String title){
            
        Book bookTemp;
            
        for (int i = 0; i < this.bookQuantity; i++) {
            bookTemp = this.getBookByPosition(i);
                
            if(title.equalsIgnoreCase(bookTemp.getTitle())){
                return true;
            }// Fin del else 

            }// Fin del for
        
        return false;
        
    }// fin del metodo searchTitl 
    
    //busca el libro por el titulo  y retorna el code  
    public String searchTitle(String title){
            
        Book bookTemp;
        
        for (int i = 0; i < this.bookQuantity; i++) {
            bookTemp = this.getBookByPosition(i);
                
            if(title.equalsIgnoreCase(bookTemp.getTitle())){
                return bookTemp.getISBN();
            }
            }// Fin del for
        return "";
    }// fin del metodo searchTitl 
        
    //metodo para retornar el carnet
    public String generateCod() {

        String id = "ISBN-" + (String.format("%03d", bookQuantity));
        
        return id;
    }
}
