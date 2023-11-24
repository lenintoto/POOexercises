public class Estudiantes {
    //Atributos
        public String nombre;
        public int edad;
    public Estudiantes(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void saludar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    public static void main(String[] args){
        Estudiantes estudiante1 = new Estudiantes("Alexis",23);
        Estudiantes estudiante2 = new Estudiantes("Alex", 20);
        estudiante1.saludar();
        estudiante2.saludar();
    }

}