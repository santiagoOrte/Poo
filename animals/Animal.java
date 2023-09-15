package animals;

abstract class Animal {

    //private String especie;
    public String name;
    public String yearsOld;
    public String tipoAlimrntacion;

    public Animal(String name, String yearsOld, String tipoAlimrntacion) {
        this.name = name;
        this.yearsOld = yearsOld;
        this.tipoAlimrntacion = tipoAlimrntacion;
    }

    
    
    public abstract void animalSound();

}
