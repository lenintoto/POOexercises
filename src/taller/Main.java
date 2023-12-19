package taller;

public class Main extends Persona {

    public static void main(String[] args){
        Main p1 = new Main();
        p1.nombre="pepe";
        p1.setNumTarjeta(45217889);
        System.out.printf("Hola %s!, tu numero de tarjeta es: %d",p1.nombre,p1.getNumTarjeta());
    }
}

