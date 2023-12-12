public class Futbol {
    public int dorsal;
    public String nombre;

    public Futbol(String nombre, int dorsal){
        this.nombre=nombre;
        this.dorsal=dorsal;
    }
    public static void correr(){
        System.out.println("Recorrido 200 metros");
    }
    public static void main(String[] args){
        correr();
    }
}
