package Tarea_2;

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {

        //definimos las variables a usar (descuento y valor final de compra)

        double porcentaje_descuento , valor_final;
 
        //Ingresamos el valor de la compra

        Scanner valorCompra_input = new Scanner(System.in);
        System.out.println("Ingrese el valor de su compra: ");
        double valorCompra = valorCompra_input.nextDouble();

         //Ingresamos el color de la bolita

        Scanner color_input = new Scanner(System.in);
        System.out.println("Ingrese el COLOR de su bolita: ");
        String color = color_input.nextLine();

        // Evaluamos el color de la bolita para indicar qué tipo de descuento obtiene el cliente

        if (color.equals("BLANCA")){
            porcentaje_descuento = 0;
        } else if (color.equals("VERDE")) {
            porcentaje_descuento = 0.1;
        } else if (color.equals("AMARILLA")){
            porcentaje_descuento = 0.25;
        } else if (color.equals("AZUL")){
            porcentaje_descuento =  0.50;
        } else if (color.equals("ROJA")) {
            porcentaje_descuento = 1;
        } else {
            System.out.println("Error: color de bolita no válido. Debe ser BLANCA, VERDE, AMARILLA, AZUL o ROJA."); /* Este es un mensaje cuando se indica un color diferente, o un error de typo (debe ser en mayusculas) */
            return;
        }

        // Se realiza el cálculo del valor final en función del color de la bolita y por ende de su decuento 

        valor_final = valorCompra - valorCompra*porcentaje_descuento;

        System.out.println("El valor a pagar por su compra es de " + valor_final);
}

}
