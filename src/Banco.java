public class Banco {
    public int cedula;
    public String nombre;
    public Banco(int cedula, String nombre){
        this.cedula=cedula;
        this.nombre=nombre;
    }
    public void Registro_Usuario(){
        System.out.printf("Datos Personales\nNombre: %s\nCédula: %d\n",nombre,cedula);
    }
    public void R_cuenta_bancaria() {
        System.out.println("Cuenta registrada con éxito");
    }
    public static void main(String[] args){
        Banco persona1 = new Banco(1754489761,"Lenin");
        persona1.Registro_Usuario();
        persona1.R_cuenta_bancaria();
    }
}
