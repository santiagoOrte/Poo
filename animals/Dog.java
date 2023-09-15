package animals;
class Dog extends Animal{

    public String raza;
    
    
    
    public Dog(String name, String yearsOld, String tipoAlimentacion, String raza) {
        super(name,yearsOld,tipoAlimentacion);
        this.raza=raza;
    }
    
    @Override
    public void animalSound(){
        System.out.println("raza" +raza);
        System.out.println("nombre" +name);
        System.out.println("edad" +yearsOld);
        System.out.println("tipo de alimentacionm " +tipoAlimrntacion);
        System.out.println("guau");
    }
     
 
    
}
