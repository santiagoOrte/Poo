package exercise;
public class Persona {
    
    private String name;
    private String document;
    private String city;

    //constructor sin parametros
    public Persona(){}
    
    //constructor parametrizado
    public Persona (String name, String document, String city){
        this.name=name;
        this.document=document;
        this.city=city;
    }
    
    //get
    public String getName() {
        return name;
    }
    public String getDocument() {
        return document;
    }
    public String getCity() {
        return city;
    }
    
    //set
    public void setName(String name) {
        this.name = name;
    }
    public void setDocument(String document) {
        this.document = document;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    
}
