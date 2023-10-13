package veiculos;

public class Motocicleta extends Veiculo{
     
    double cilindrado;
    
    //cnstructor
    public Motocicleta(String marca, String modelo, String propietario, String placa, int año, double cilindrado) {
        super(marca, modelo, propietario, placa, año);
        this.cilindrado=cilindrado;
        type="motocicleta";
    }
    
    //getters
    public double getCilindrado() {
        return cilindrado;
    }
    public String getType() {
        return type;
    }
    //setter
    public void setCilindrado(double cilindrado) {
        this.cilindrado = cilindrado;
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
                + "|| Cilindraje:" + cilindrado
                + "|| años de circulacion:" + calcularAñosCirculacion());
    } 

}


