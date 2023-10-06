package sistema.de.veiculos;
import java.util.LinkedList;
import veiculos.Veiculo;

public class Sevice {
    LinkedList <Veiculo> veiculos = new LinkedList<>();
    public Sevice() {
    }

    public LinkedList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public  void guardar(Veiculo veiculo) {
        veiculos.add(veiculo);
    }
    
    public void listar() {
        for(Veiculo a:veiculos){
            a.mostrarInformacion();
        }
    }

}
