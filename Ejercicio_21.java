// Clase principal

import java.util.Scanner;

public class Ejercicio_21{

    public static void main(String[] args){

        double perimetro, semiperimetro, area;
        
        //Leemos le lado A
        Scanner scanner_1 = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado A del triangulo:");
   
        double A = scanner_1.nextDouble();

        //Leemos el aldo B
        Scanner scanner_2 = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado B del triangulo:");
   
        double B = scanner_2.nextDouble();

        //Leemos el lado C
        Scanner scanner_3 = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado C del triangulo:");
   
        double C = scanner_3.nextDouble();


        //Realizamos las operaciones
        perimetro = Calculos.perimetro(A,B,C);
        semiperimetro = Calculos.semiperimetro(A,B,C);
        area = Calculos.area(semiperimetro,A,B,C);

        //Mostramos los resultados

        String resultado_2 = String.format("Perimetro: %.2f", perimetro);
        System.out.println(resultado_2);

        String resultado_3 = String.format("Semiperimetro: %.2f", semiperimetro);
        System.out.println(resultado_3);

        String resultado_4 = String.format("Area: %.2f", area);
        System.out.println(resultado_4);


    }
    

}

//Creamos la clase donde haremos los calculos

class Calculos{
    
    //Calculo del perimetro
    public static double perimetro(double A, double B,double C){
        return A + B + C;
    }

    //Calculo del semiperimetro
    public static double semiperimetro(double A, double B,double C){
        return (A+B+C) /2 ;
    
    }

    //Calculo del area
    public static double area(double semiperimetro, double A, double B,double C){
        return Math.sqrt(semiperimetro *(semiperimetro-A)*(semiperimetro-B)*(semiperimetro-C));
    }
}