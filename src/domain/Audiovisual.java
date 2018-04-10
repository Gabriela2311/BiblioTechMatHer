
package domain;


public class Audiovisual {
    
    private String type;
    private String brand; 
    private String model; 
    private boolean availability;
    private String serie; 
    private String year;
    private String cod;

    public Audiovisual() {
    }

    public Audiovisual(String type, String brand, String model, boolean availability, String serie, String year, String code) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.availability = availability;
        this.serie = serie;
        this.year = year;
        this.cod = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }


    @Override
    public String toString() {
        return "Audiovisual{" + "type=" + type + ", brand=" + brand + ", model=" + model + ", availability=" + availability + ", serie=" + serie + ", year=" + year + ", code=" + cod + '}';
    }
    
    public int sizeInBytes(){
        return (this.getType().length()*2+2)+(this.getBrand().length()*2+2)+(this.getModel().length()*2+2)+1+(this.getSerie().length()*2+2)+(this.getYear().length()*2+2)+(this.getCod().length()*2+2);
    }
}
