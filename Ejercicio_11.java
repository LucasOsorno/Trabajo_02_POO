//Definicion clase principal

import java.util.Scanner;

public class Ejercicio_11{

    public static void main(String[] args){

        //Leemos los numeros de entrada

        //Leemos  A
        Scanner scanner_1 = new Scanner(System.in);

        System.out.println("Ingrese el valor A:");
   
        double A = scanner_1.nextDouble();

        //Leemos  B
        Scanner scanner_2 = new Scanner(System.in);

        System.out.println("Ingrese el valor B :");
   
        double B = scanner_2.nextDouble();

        //Leemos  C
        Scanner scanner_3 = new Scanner(System.in);

        System.out.println("Ingrese el valor C:");
   
        double C = scanner_3.nextDouble();

        //Uso de la clase 

        double resultado = Numero_mayor.mayor(A,B,C);

        System.out.println("El numero mayor es:" + " " + resultado);

    }
}

//Definimos la clase donde definimos que numero es mayor

class Numero_mayor{

    public static double mayor(double a, double b, double c){

        if (a > b && a > c){
            return a;
        }

        if (b > a && b > c){
            return b;
        }

        if (c > a && c > b){
            return c;

        } else{

            return a;

        }
    }

}