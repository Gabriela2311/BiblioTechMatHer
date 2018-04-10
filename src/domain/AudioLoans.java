
package domain;

import java.io.Serializable;


public class AudioLoans extends Audiovisual implements Serializable{
    
    //atributos
    private String id;
    private String devices;
    private String dateDeparture;
    private String dateDelivery;
    private boolean penalty;
    private String brands;
    
    
    // Constructores

    public AudioLoans() {
    }

    public AudioLoans(String id, String devices, String dateDeparture, String dateDelivery, boolean penalty, String brands) {
        this.id = id;
        this.devices = devices;
        this.dateDeparture = dateDeparture;
        this.dateDelivery = dateDelivery;
        this.penalty = penalty;
        this.brands = brands;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDevices() {
        return devices;
    }

    public void setDevices(String devices) {
        this.devices = devices;
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

    public boolean getPenalty() {
        return penalty;
    }

    public void setPenalty(boolean penalty) {
        this.penalty = penalty;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    @Override
    public String toString() {
        return "AudioLoans{" + "id=" + id + ", devices=" + devices + ", dateDeparture=" + dateDeparture + ", dateDelivery=" + dateDelivery + ", penalty=" + penalty + ", brands=" + brands + '}';
    }
    
    
    
}
