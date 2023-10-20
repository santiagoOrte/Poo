package veiculo;

public class Coche {
    private Motor motor;  // Composición: un coche tiene un motor

    public Coche() {
        this.motor = new Motor();  // Crear un motor al instanciar un coche
    }

    public void arrancar() {
        motor.encender();
        System.out.println("Coche arrancado");
    }

    public void apagar() {
        motor.apagar();
        System.out.println("Coche apagado");
    }
}
