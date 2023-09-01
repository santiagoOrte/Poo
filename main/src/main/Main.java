package main;
import poo.unicauca.edu.co.e1;

public class Main {

    public static void main(String[] args) {
        
        e1 call = new e1();
        
        int result = call.Sum(2, 5);
        System.out.println(result);
        
        System.out.println("first name: "+ call.getFirstName());
        System.out.println("last name: "+ call.getLastName());
        
    }
    
}
