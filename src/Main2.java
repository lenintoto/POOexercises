public class Main2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Perro perro = new Perro();
        Gato gato = new Gato();
        animal.hacerSonido(); // Imprime "Haciendo sonido genérico"
        perro.hacerSonido(); // Imprime "Gua, gua"
        gato.hacerSonido();
    }
}

