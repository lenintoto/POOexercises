public class Practica121nov {
    public String marca;
    public String tipoMotor;
    public String transmision;
    public int velocidades;
    public Practica121nov(String _marca, String _tipoMotor, String _transmision, int _velocidades){
        marca=_marca;
        tipoMotor=_tipoMotor;
        transmision=_transmision;
        velocidades=_velocidades;
    }
    public void arranca(){
        System.out.printf("El auto %s esta arrancando en %d velocidad.", marca, velocidades);
     }
    public void retrocede(){
        System.out.printf("El auto %s esta retrocediendo.",marca);
     }
    public static void main(String[] args){
        Practica121nov carro1 = new Practica121nov("Mazda MX-3", "Motor V6", "Manual", 6 );
        Practica121nov carro2 = new Practica121nov("Ford Explorer", "Motor V8", "Automático", 6);
        Practica121nov carro3 = new Practica121nov("Chevrolet Silverado", "Motor V8", "Automático", 6);
        System.out.printf("Los datos del carro 1 son:\nMarca: %s \nTipo de Motor: %s \nTransmisión: %s\n Velocidades: %d\n",carro1.marca,carro1.tipoMotor,carro1.transmision, carro1.velocidades);
        System.out.printf("Los datos del carro 2 son:\nMarca: %s \nTipo de Motor: %s \nTransmisión: %s\n Velocidades: %d\n",carro2.marca,carro2.tipoMotor,carro2.transmision, carro2.velocidades);
        System.out.printf("Los datos del carro 3 son:\nMarca: %s \nTipo de Motor: %s \nTransmisión: %s\n Velocidades: %d\n",carro3.marca,carro3.tipoMotor,carro3.transmision, carro3.velocidades);
        carro1.arranca();
        carro2.retrocede();
    }
}
