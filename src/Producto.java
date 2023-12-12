public class Producto{
    public String nombre;
    public double precio;
    public int cantidad;
    public Producto(){
        this.nombre="Vacío";
    }
    public Producto(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }
    public Producto(String nombre,double precio, int cantidad){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
    }
    public void imprimir1(){
        System.out.printf("El precio del producto %s es $%f\n",nombre,precio);
    }
    public void imprimir2(){
        System.out.printf("El precio del producto %s es $%f por %d lata/s\n",nombre,precio,cantidad);
    }
    public void imprimir2(String nombre,double precio,int cantidad){
        System.out.printf("El precio del producto %s es $%f por %d lata/s\n",nombre,precio,cantidad);
    }
    public static void main(String[] args){
        Producto nuevo1 = new Producto("Coca-Cola",1.35);
        Producto nuevo2 = new Producto("Coca-Cola",4.05,3);
        nuevo1.imprimir1();
        nuevo2.imprimir2("RedBull",2.50,1);
        nuevo2.imprimir2();
    }
}
