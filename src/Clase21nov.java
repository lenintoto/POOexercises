public class Clase21nov {
    //metodos: son las acciones que hace el objeto
    private int cedula;
    public String nombre;
    public int edad;
    public Clase21nov(int cedula, String nombre, int edad){
        this.cedula=cedula;
        this.nombre=nombre;
        this.edad=edad;
    }


    public int getCedula() {
        return cedula;
    }

    /*Otra forma de inicializar el metodo constructor
        public Persona (String _nombre, int _edad) {
            nombre = _nombre;
            edad = _edad;
        }
        Aqui no es necesario el uso del this ya que los parametros son declarados con otro nombre
        */
    public void saludar(){
        System.out.println("Un saludo "+nombre);
    }
    public static void main(String[] args){
        Clase21nov persona1 = new Clase21nov(1564489465, "Lenin", 20);//este metodo constructor va dentro del main
        Clase21nov persona2 = new Clase21nov(1746597813, "Dilan", 20);//este metodo constructor va dentro del main
        Clase21nov persona3 = new Clase21nov(1714465465, "Alexis", 20);//este metodo constructor va dentro del main
        System.out.printf("%s, con N° de cedula: %d, tiene %d años",persona1.nombre,persona1.getCedula(),persona1.edad);
        System.out.println("\nNombre: "+persona1.nombre+ "\nCédula: "+persona1.cedula+"\nEdad: "+persona1.edad);
        persona1.saludar();
        persona2.saludar();
        persona3.saludar();
    }
}
