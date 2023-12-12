public class Administrativo extends Persona{
    public int codigoEmpleado;
    public String departamento;
    public Administrativo(String nombre, int edad, int DNI, int codigoEmpleado, String departamento){
        super(nombre, edad, DNI);
        this.codigoEmpleado=codigoEmpleado;
        this.departamento=departamento;
    }
    public void mostrarInformacion(){
        //super.mostrarInformacion();
        System.out.printf("Matricula: %d\nCarrera: %s\n",codigoEmpleado,departamento);
    }
}
