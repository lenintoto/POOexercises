public class ComidaTipica {
    public String nombre;
    private String ingPrin;

    public String getIngPrin() {
        return ingPrin;
    }
    public void setIngPrin(){
        this.ingPrin=ingPrin;
    }
    public ComidaTipica(String nombre, String ingPrin){
        this.nombre=nombre;
    }
    public void plato() {
        System.out.printf("El plato: %s, tiene como ingrediente principal: %s", nombre, ingPrin);
    }
}
class Costa extends ComidaTipica{
    public double precio;

    public Costa(String nombre, String ingPrin) {
        super(nombre, ingPrin);
    }

}

