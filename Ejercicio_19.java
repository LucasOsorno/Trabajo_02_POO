// Clase principal

import java.util.Scanner;

public class Ejercicio_19{

    public static void main(String[] args) {

        double altura, perimetro, area;
        
        //Creamos la clase de lo que entrara el usuario
        Scanner my0bj = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado del triangulo:");

        double lado = my0bj.nextDouble();

        // Calculamos el perimetro, la altura y el area
        altura = Operaciones.altura(lado);
        perimetro = Operaciones.perimetro(lado);
        area = Operaciones.area(lado);
 

        // Imprimimos los resultados
        String resultado_1 = String.format("Lado: %.2f" , lado);
        System.out.println(resultado_1);

        String resultado_2 = String.format("Perimetro: %.2f", perimetro);
        System.out.println(resultado_2);

        String resultado_3 = String.format("Altura: %.2f", altura);
        System.out.println(resultado_3);

        String resultado_4 = String.format("Area: %.2f", area);
        System.out.println(resultado_4);
     }


}

//Clase que contiene los metodos de calculo

class Operaciones{

    //Calculo del perimetro
    public static double perimetro(double lado) {
        return lado * 3;
    }

    //Calculo de la altura
    public static double altura(double lado){
        return lado * (Math.sqrt(3) / 2);
    }

    //Calculo del area
    public static double area(double lado){
        return (Math.pow(lado,2)) * (Math.sqrt(3) / 4);
    }


}