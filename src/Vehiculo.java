public class Vehiculo {
    public void acelerar() {
        System.out.println("Acelerando de manera genérica: ");
    }
}
class Coche extends Vehiculo{
    @Override
    public void acelerar(){
        System.out.println("El coche va a 60 km/h");
    }
}
class Bicicleta extends Vehiculo{
    @Override
    public void acelerar(){
        System.out.println("La bicicleta va a 10 km/h");
    }
}
class Avion extends Vehiculo{
    @Override
    public void acelerar(){
        System.out.println("El avión va a 180 km/h");
    }
}
