package sistema.de.veiculos;
import veiculos.Automivil;
import veiculos.Motocicleta;
import veiculos.Veiculo;

public class SistemaDeVeiculos {

    
    
    public static void main(String[] args) {
        //se crean los obejetos
        Sevice sc = new Sevice();
        Veiculo veiculo1= new Motocicleta("Honda", "2000", "jasinto", "111111", 2001, 150.0);
        Veiculo veiculo2= new Motocicleta("Honda", "2000", "josefo", "222222", 2002, 150.0);
        Veiculo veiculo3= new Motocicleta("Honda", "2000", "casimiro", "333333", 2003, 200.0);
        Veiculo veiculo4= new Motocicleta("Honda", "2000", "Martenzia", "444444", 2004, 700.0);
        Veiculo veiculo5= new Motocicleta("Honda", "2000", "jasinto segundo", "555555", 2005, 180.0);    
        
        Veiculo veiculo6= new Automivil("Renol", "2007", "Nicol", "666666", 2007, 4);
        Veiculo veiculo7= new Automivil("Renol", "2007", "Nicol", "7777777", 2008, 6);
        Veiculo veiculo8= new Automivil("Renol", "2007", "Nicol", "888888", 2009, 4);
        Veiculo veiculo9= new Automivil("Renol", "2007", "Nicol", "999999", 2010, 6);
        Veiculo veiculo10= new Automivil("Renol", "2007", "Nicol", "101010", 2011, 2);
       
        //se llena el arreglo de 5 motos y 5 automiviles
        
        sc.guardar(veiculo1);
        sc.guardar(veiculo2);
        sc.guardar(veiculo3);
        sc.guardar(veiculo4);
        sc.guardar(veiculo5);
        sc.guardar(veiculo6);
        sc.guardar(veiculo7);
        sc.guardar(veiculo8);
        sc.guardar(veiculo9);
        sc.guardar(veiculo10);
        
        sc.listar();
        sc.veiculos.get(5).setPropietario("josejose");
        sc.listar();
     
}

        
        
 
