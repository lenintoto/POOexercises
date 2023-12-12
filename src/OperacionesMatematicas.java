public class OperacionesMatematicas {
    public int a;
    public int b;
    public int c;
    public double d;
    public double e;


    public void sumar(int a,int b){
        int suma1;
        suma1=a+b;
        System.out.printf("La suma de %d + %d es igual a %d\n",a,b,suma1);
    }
    public void sumar(int a, int b, int c){
        int suma;
        suma =a+b+c+5;
        System.out.printf("La suma de %d+%d+%d+5 es igual a %d\n",a,b,c,suma);
    }
    public void sumar(double d, double e){
        double suma2;
        suma2=d+e+2;
        System.out.printf("La suma de %f+%f+2 es igual a %f\n",d,e,suma2);
    }
    public static void main(String[] args){

        OperacionesMatematicas suma1 = new OperacionesMatematicas();
        OperacionesMatematicas suma2 = new OperacionesMatematicas();
        OperacionesMatematicas suma3 = new OperacionesMatematicas();
        suma1.sumar(2,2);
        suma2.sumar(2,2,2);
        suma3.sumar(2.515,2.515);


    }
}
