class Animal {
    public void hacerSonido() {
        System.out.println("Haciendo sonido genérico");
    }
}
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau, guau");
    }
}
class Gato extends Animal{
    @Override //permite trasla dar informacion de la clase padre a la clase hija
    public void hacerSonido(){
        System.out.println("Miau, Miau");
    }
}