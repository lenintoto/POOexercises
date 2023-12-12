public class Estudiante extends Persona{
    public static int matricula;
    public static String carrera;
    public Estudiante(String nombre, int edad, int DNI, int matricula, String carrera){
        super(nombre, edad, DNI);
        this.matricula=matricula;
        this.carrera=carrera;
    }
    public void mostrarInformacion(){
        //super.mostrarInformacion();
        System.out.printf("Matricula: %d\nCarrera: %s\n",matricula,carrera);
    }
}
