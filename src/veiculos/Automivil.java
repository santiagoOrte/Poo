package veiculos;

public class Automovil extends Veiculo {
    int numPuertas;
    
    //constructor
    public Automovil(String marca, String modelo, String propietario, String placa, int año, int numPuertas) {
        super(marca, modelo, propietario, placa, año);
        this.numPuertas=numPuertas;
        type="automovil";
    }
    
    //getters
    public int getNumPuertas() {
        return numPuertas;
    }
    public String getType() {
        return type;
    }
    //setter
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    
    //metodos   
    public int calcularAñosCirculacion (){
        int añosc;
        return añosc=2023-año;
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println(""
                + "|| Marca:"+ marca 
                + "|| Modelo:"+ modelo 
                + "|| Propietario:"+ propietario 
                + "|| Placa:" + placa 
                + "|| Año de fabricacion:" + año 
                + "|| Numero de puertas:" + numPuertas
                + "|| años de circulacion:" + calcularAñosCirculacion());
    }     
}
