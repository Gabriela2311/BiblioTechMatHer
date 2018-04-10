package domain;

import java.util.logging.Logger;

public class Book {

    private String title;
    private String year;
    private String editorial;
    private String autor;
    private String format;
    private boolean availability;
    private String ISBN;
    


    public Book() {
    }

    public Book(String title, String year, String editorial, String autor, String format, boolean availability, String cod) {
        this.title = title;
        this.year = year;
        this.editorial = editorial;
        this.autor = autor;
        this.format = format;
        this.availability = availability;
        this.ISBN = cod;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    
        public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", year=" + year + ", editorial=" + editorial + ", autor=" + autor +  ", Format=" + format + ", availability=" + availability + ", cod=" + (String.format("%05d", ISBN)) + '}';
    }

    public int sizeInBytes(){
        return (this.getTitle().length()*2+2)+(this.getYear().length()*2+2)+(this.getEditorial().length()*2+2)+(this.getAutor().length()*2+2)+(this.getFormat().length()*2+2)+1+(this.getISBN().length()*2+2);
    }
    
}
