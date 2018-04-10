package domain;

public class Student {
    
    private String name; 
    private String lastName; 
    private String id;
    private String yearOfIncome; 
    private String career; 

    public Student() {
        this.name = "";
        this.lastName = "";
        this.id = "";
        this.yearOfIncome = "";
        this.career = "";
    }

    public Student(String name, String lastName, String id, String yearOfIncome, String career) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.yearOfIncome = yearOfIncome;
        this.career = career;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYearOfIncome() {
        return yearOfIncome;
    }

    public void setYearOfIncome(String yearOfIncome) {
        this.yearOfIncome = yearOfIncome;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", lastName=" + lastName + ", carne=" + id + ", yearOfIncome=" + yearOfIncome + ", career=" + career + '}';
    }
       public int sizeInBytes(){
        return (this.getName().length()*2)+(this.getLastName().length()*2)+(this.getId().length()*2)+(this.getCareer().length()*2)+(this.getYearOfIncome().length()*2+2);
    }
}
