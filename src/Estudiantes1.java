public class Estudiantes1 {
    private String nombre;
    private int edad;

    public Estudiantes1(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    //metodo getter y setter
    public String getNombre() {
        return nombre;
    }

    /*public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/

    /*public int getEdad() {
        return edad;
    }*/

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public static void main(String[] args){
        Estudiantes1 estudiante21 = new Estudiantes1("Lenin",16);
    }
}