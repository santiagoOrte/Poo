package pkg080923;
import exercise.Persona;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int limitObjet=2;
        Persona[] arrayPerson = new Persona[limitObjet];
        Scanner scan = new Scanner(System.in);
        
        
        for (int i = 0; i < limitObjet; i++) {
            System.out.println("ingrese los valores de la persona correspondientes a: -nombe -documento -ciudad");
            arrayPerson[i] = new Persona(scan.nextLine(), scan.nextLine(),scan.nextLine());  
        }
         for (int i = 0; i < limitObjet; i++) {
             System.out.println("NOMBRE:" + arrayPerson[i].getName());
             System.out.println("DOCUMENTO:" + arrayPerson[i].getDocument());
             System.out.println("CIUDAD:" + arrayPerson[i].getCity());
             System.out.println("-----------------------");
         }
    }  
}
