package veiculos;

public class Veiculo {
    String marca, modelo, propietario, placa;
    int año;
    String type;

    //constructor
    public Veiculo(String marca, String modelo, String propietario, String placa, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
        this.placa = placa;
        this.año = año;
    }
    
    //getters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getPropietario() {
        return propietario;
    }
    public String getPlaca() {
        return placa;
    }
    public int getAño() {
        return año;
    }
    public String getType() {
        return type;
    }
    
    //setter
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setAño(int año) {
        this.año = año;
    }
    
    //metodo
    public void mostrarInformacion () {}
    
}

