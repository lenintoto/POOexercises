public class Principal {
    public static void main(String[] args) {
        Estudiante estu1 = new Estudiante("Juan", 21, 1968547203, 202356789, "Software");
        Profesor profe1 = new Profesor("Pepe", 36, 1685974863, 201524872, "Cálculo");
        Administrativo admin1 = new Administrativo("Trek", 49, 1596384720, 201698745, "Fisica");

        System.out.println("Información del Estudiante:");
        estu1.mostrarInformacion();
        System.out.println("\nInformación del Profesor:");
        profe1.mostrarInformacion();
        System.out.println("\nInformación del Administrativo:");
        admin1.mostrarInformacion();

    }
}
