/*git init
* git status
* git add Deportes.java
* git commit -m ""*/
import java.util.Scanner;
public class Deportes {
    protected String nombre;
    protected int edad;
    public Deportes(String nombre, int edad){
        this.edad=edad;
        this.nombre=nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void mayoriaEdad(){

    }
}
class Verificacion extends Deportes{
    public Verificacion(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void mayoriaEdad(){
        if (edad < 18){
            System.out.println("El jugador/deportista no puede participar en la disciplina");
        }else{
            System.out.println("El jugador está apto para la disciplina");
        }
    }
}
class Registro extends Deportes{
    protected int sancion;
    protected int exam;
    public Registro(String nombre, int edad, int sancion,int exam){
        super(nombre,edad);
        this.sancion=sancion;
        this.exam=exam;
    }
    public void setSancion(int sancion){
        this.sancion=sancion;
    }
    public void setExam(int exam){
        this.exam=exam;
    }
    public int getSancion(){
        return sancion;
    }
    public int getExam(){
        return exam;
    }
    public void sanciones(){
        if (sancion == 'S'){
            System.out.println("El jugador no puede participar ya que tiene sanciones recientes");
        }else if (sancion == 'N'){
            System.out.println("El jugador esta apto para participar");
        }
    }
    public void examenes(){
        if (exam == 'S'){
            System.out.println("El jugador esta apto para participar");
        }else if (exam == 'N'){
            System.out.println("El jugador no puede participar ya que no se ha realizado los examenes medicos");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        try{
            System.out.println("Ingrese su edad: ");
            int edad = sc.nextInt();
            System.out.println("Cuantas sanciones recientes ha tenido el jugador?: ");
            int sanc= sc.nextInt();
            System.out.println("Cuantos examenes medicos se realizó el jugador en el mes de diciembre?: ");
            int exam= sc.nextInt();
            if (edad >= 18 && sanc==0 && exam>=1){
                System.out.println("El jugador está apto para la disciplina");
            }else if(edad < 18 && sanc>=1 && exam==0){
                System.out.println("El jugador/deportista no puede participar en la disciplina");
            }
        }catch(Exception e){
            System.out.println("Los valores digitados no son los esperados");
        }

    }
}

