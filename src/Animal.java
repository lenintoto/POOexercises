class Animal {
    public void hacerSonido() {
        System.out.println("Haciendo sonido genérico");
    }
}
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Gua, gua");
    }
}
