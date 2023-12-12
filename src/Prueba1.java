public class Prueba1 {
    private String nombre;
    private String apellido;
    public int edad;
    public String getNombre() {
        return nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Prueba1(String nombre, String apellido, int edad){
        nombre="Juan";
        apellido="González";
        edad=24;
    }
    public static void main(String[] args){
        Prueba1 persona = new Prueba1("Juan","Gonzalez",14);
        System.out.printf("Hola %s %s, tu edad es: %d",persona.nombre,persona.apellido,persona.edad);
    }
}
