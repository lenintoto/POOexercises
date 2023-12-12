public class Jugador {
    private String nombre;
    private String apellido;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Jugador(String nombre,String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
    public static void main(String[] args){
        Jugador jugador1=new Jugador("Fernando","de la Cruz");
        System.out.printf("Nombre anterior: %s %s\n",jugador1.nombre,jugador1.apellido);
        jugador1.setNombre("Fabian");
        jugador1.setApellido(" Ordoñez");
        System.out.print(jugador1.nombre);
        System.out.print(jugador1.apellido);

    }
}
