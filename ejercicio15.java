package Tarea_2;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {

        // Definimos un scanner
        Scanner input = new Scanner(System.in);

        // Ingreso de peso de la esfera 1
        System.out.println("Ingrese el peso de la esfera 1: ");
        double pesoEsfera1 = input.nextDouble();

        // Ingreso de peso de la esfera 2
        System.out.println("Ingrese el peso de la esfera 2: ");
        double pesoEsfera2 = input.nextDouble();
    
        // Ingreso de peso de la esfera 3
        System.out.println("Ingrese el peso de la esfera 3: ");
        double pesoEsfera3 = input.nextDouble();

        // Ingreso de peso de la esfera 4
        System.out.println("Ingrese el peso de la esfera 4: ");
        double pesoEsfera4 = input.nextDouble();

        // Evaluar las diferentes alternativas
        if (pesoEsfera1 == pesoEsfera2 && pesoEsfera1 == pesoEsfera3 && pesoEsfera4 == pesoEsfera1) {
            System.out.println("Todas las esferas son iguales"); /* Caso cuando las 4 esferas son iguales */
        } else if (pesoEsfera1 == pesoEsfera2 && pesoEsfera1 == pesoEsfera3) {
            if (pesoEsfera4 > pesoEsfera1) {
                System.out.println("La esfera 4 es la diferente y es la de mayor peso");
            } else {
                System.out.println("La esfera 4 es la diferente y es la de menor peso");
            }
        } else if (pesoEsfera1 == pesoEsfera2 && pesoEsfera1 == pesoEsfera4) {
            if (pesoEsfera3 > pesoEsfera1) {
                System.out.println("La esfera 3 es la diferente y es la de mayor peso");
            } else {
                System.out.println("La esfera 3 es la diferente y es la de menor peso");
            }
        } else if (pesoEsfera1 == pesoEsfera3 && pesoEsfera1 == pesoEsfera4) {
            if (pesoEsfera2 > pesoEsfera1) {
                System.out.println("La esfera 2 es la diferente y es la de mayor peso");
            } else {
                System.out.println("La esfera 2 es la diferente y es la de menor peso");
            }
        } else if (pesoEsfera3 == pesoEsfera2 && pesoEsfera3 == pesoEsfera4) {
            if (pesoEsfera1 > pesoEsfera2) {
                System.out.println("La esfera 1 es la diferente y es la de mayor peso");
            } else {
                System.out.println("La esfera 1 es la diferente y es la de menor peso");
            }
        } else {
            System.out.println("No hay una única esfera diferente o los pesos son incorrectos."); /* Mensaje por incorrecto input */
        }
    }
}