public class Profesor extends Persona{
    public static int codigoEmpleado;
    public static String materiaAsignada;
    public Profesor(String nombre, int edad, int DNI, int codigoEmpleado, String materiaAsignada){
        super(nombre, edad, DNI);
        this.codigoEmpleado=codigoEmpleado;
        this.materiaAsignada=materiaAsignada;
    }
    public static void mostrarInformacion(){
        //super.mostrarInformacion();
        System.out.printf("Código Empleado: %d\nMateria Asignada: %s\n",codigoEmpleado,materiaAsignada);
    }
}

