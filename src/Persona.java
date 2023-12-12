public class Persona {
    public String nombre;
    public int edad;
    public int DNI;

    public Persona(String nombre, int edad, int DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }
    public static void mostrarInformacion(String nombre,int edad, int DNI){
        System.out.printf("Nombre: %s\nEdad: %d\nDNI: %d", nombre,edad,DNI);
    }
}
