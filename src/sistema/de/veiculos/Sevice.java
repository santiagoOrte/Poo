package sistema.de.veiculos;
import java.util.LinkedList;
import veiculos.Veiculo;

public class Service {
    //arreglos
    LinkedList <Veiculo> veiculos = new LinkedList<>(); 
    LinkedList <Veiculo> motocicletas = new LinkedList<>();
    LinkedList <Veiculo> automoviles = new LinkedList<>();
    
    //constructor
    public Service() {
    }
    
    //get para el arreglo de veiculos
    public LinkedList<Veiculo> getVeiculos() {
        return veiculos;
    }

    //METODOS
    
    //guarda objetos en el arreglo validando placa
    public  void guardar(Veiculo veiculo) {
        boolean flag = true;
        //se comprueva que no este repetida la placa
        for(Veiculo a : veiculos){
            if (veiculo.getPlaca() == a.getPlaca()){
                flag = false;
                break;
            }
        }
        //si no se repite la placa se guarda el objeto
        if (flag == true) {
            veiculos.add(veiculo);
        }else {
            System.out.println("Veiculo no GUARDADO, placa repetida");
        }
    }
    
    //lista objetos del arreglo veiculos
    public void listar() {
        for(Veiculo a:veiculos){
            a.mostrarInformacion();
        }
        System.out.println("");
    }
    
    //separa el arreglo en otros dos para motos y autos
    public void separar (){
        for(Veiculo a: veiculos){
            if (a.getType() == "automovil") {
                automoviles.add(a);
            }else{
                motocicletas.add(a);
            }
        }
    }
    
    //lista el arreglo de motos
    public void listarMotos() {
        System.out.println("\nMOTOCICLETAS");
        for(Veiculo a:motocicletas){
            a.mostrarInformacion();
        }
    }
    
    //lista el arreglo de autos
    public void listarAutos() {
        System.out.println("\nAUTOMOVILES");
        for(Veiculo a:automoviles){
            a.mostrarInformacion();
        }
    }
    
    // busca un objeto del arreglo de veiculos con el nombre
    public void buscarNombre (String nombre){
        boolean flag = false;
        System.out.println("\nBuscando veiculo por nombre");
        for (Veiculo a: veiculos){
            if (a.getPropietario() == nombre) {
                a.mostrarInformacion();
                flag = true;
                break;
            }
        }
        if (flag==false) {
            System.out.println("NO ENCONTRADO");
        }
    }
    
    // busca un objeto del arreglo de veiculos con la placa
    public void buscarPlaca (String placa){
        boolean flag = false;
        System.out.println("\nBuscando veiculo por placa");
        for (Veiculo a: veiculos){
            if (a.getPlaca() == placa) {
                a.mostrarInformacion();
                flag=true;
                break;
            }
        }
        if (flag==false) {
            System.out.println("NO ENCONTRADO");
        }
    }
}
