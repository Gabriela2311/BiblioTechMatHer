
package domain;

import java.io.Serializable;

public class BookLoans extends Book implements Serializable {

    //atributos
    private String id;
    private String dateDeparture;
    private String dateDelivery;
    private String author;
    private String titles;
    private boolean available;

    //constructores
    public BookLoans() {
    }

    public BookLoans(String id, String dateDeparture, String dateDelivery, String author, String titles, boolean available, String title, String year, String editorial, String autor, String format, boolean availability, String cod) {
        super(title, year, editorial, autor, format, availability, cod);
        this.id = id;
        this.dateDeparture = dateDeparture;
        this.dateDelivery = dateDelivery;
        this.author = author;
        this.titles = titles;
        this.available = available;
    }


    public String getId() {
        return id;
    }

   

    public void setId(String id) {
        this.id = id;
    }



    public String getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(String dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public String getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(String dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
     public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "BookLoans{" + "id=" + id + ", dateDeparture=" + dateDeparture + ", dateDelivery=" + dateDelivery + ", author=" + author + ", titles=" + titles + ", available=" + available + '}';
    }
    


    
}
