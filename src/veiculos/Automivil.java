package veiculos;
public class Automivil extends Veiculo{
    int numPuertas;

    public Automivil(String marca, String modelo, String propietario, String placa, int año, int numPuertas) {
        super(marca, modelo, propietario, placa, año);
        this.numPuertas=numPuertas;
    }
    
    public int getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    
    public int calcularAñosCirculacion (){
        int añosc;
        return añosc=2023-año;
    }
 
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("INFORMACION\n"
                + "Marca:"+ marca 
                + "Modelo:"+ modelo 
                + "Propietario:"+ propietario 
                + "Placa:" + placa 
                + "Año de fabricacion:" + año 
                + "Numero de puertas:" + numPuertas
                + "años de circulacion:" + calcularAñosCirculacion());
    }     
}
        

