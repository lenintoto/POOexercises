//pagina 123 set y get
//pagina 430 herencia de privados
import java.util.Scanner;
public abstract class Carta {
    private String nombre;
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public Carta(String nombre){
        this.nombre=nombre;
    }
    public abstract void jugar();
    public void mostrarDescripcion();
}
class CartaNumerica extends Carta{
    private int numero;
    public void setNumero(int numero){
        this.numero=numero;
    }
    public int getNumero(){
        return numero;
    }
    public CartaNumerica(String nombre,int numero){
        super(nombre);
        setNombre(nombre);
        this.numero=numero;
    }
    @Override
    public void jugar() {
        double numeroDup = (double) numero;
        double resultado = numeroDup * 2;
        System.out.printf("El resultado del cálculo es: %.2f\n", resultado);
    }


}
class CartaEspecial extends Carta{
    public CartaEspecial(String nombre){
        super(nombre);
        setNombre(nombre);
    }

    @Override
    public void jugar() {

    }

    @Override
    public void mostrarDescripcion() {

    }

    public void activarEfectoEspecial(){
        try{
        }catch(Exception e){
            System.out.println("Algo salió mal");
        }
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        CartaNumerica cartanum = new CartaNumerica("A",10);
        cartanum.jugar();
        cartanum.mostrarDescripcion();
    }
}
