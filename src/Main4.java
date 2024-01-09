import java.util.Scanner;
public class Main4 {

    public static void main(String[] args){
        /*Scanner numero1 = new Scanner(System.in);
        double total;
        try {
            System.out.println("Hola!!");
            System.out.println("Ingresa un número: ");
            double num1 = numero1.nextDouble();

            System.out.println("Ingresa otro número");
            double num2 = numero1.nextDouble();
            total = num1 * num2;

            System.out.printf("El total de la multiplicacion es %.2f\n", total);
        } catch (Exception e) {
            System.out.println("Error!!! Ingrese un número válido");
        }*/
        int[] vector ={1,5,6,9};

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]+", ");
        }

        int suma = vector[3]+56;
        System.out.println("este valor es de la posición 4 y su suma es: "+ suma);

        Scanner numeros = new Scanner(System.in);
        System.out.println("Ingresa un número para el tamaño  del arreglo: ");
        int num1 = numeros.nextInt();
        int number[];
        //number = new int[size];

        //for(int i=0; i<size;i++){}


    }
}

