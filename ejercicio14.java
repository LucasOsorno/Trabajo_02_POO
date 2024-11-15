package Tarea_2;

import java.util.Scanner;


public class ejercicio14 {

public static void main(String[] args) {

    double salario_vend_dpto1, salario_vend_dpto2, salario_vend_dpto3;
    double total_ventas, porcentaje_totalVentas;
    double porcentaje = 0.33;

     //Definimos un scanner

     Scanner input = new Scanner(System.in);

     // Importe de ventas departamento 1

     System.out.println("Ingrese el importe de ventas del departamento 1: ");
     double ventas_dpto1 = input.nextDouble();

     // Importe de ventas departamento 2

     System.out.println("Ingrese el importe de ventas del departamento 2: ");
     double ventas_dpto2 = input.nextDouble();

    // Importe de ventas departamento 2

    System.out.println("Ingrese el importe de ventas del departamento 3: ");
    double ventas_dpto3 = input.nextDouble();

    // Salario de los vendedores

    System.out.println("Ingrese el salario de los vendedores");
    double salarioVendedores = input.nextDouble();

    // Suma de las ventas por departamentos y su 33%

    total_ventas = ventas_dpto1 + ventas_dpto2 + ventas_dpto3;
    porcentaje_totalVentas = total_ventas * porcentaje;

    // Evaluar si se le realiza un aumento al salario de los vendedores 

    if ( ventas_dpto1 > porcentaje_totalVentas ){
        salario_vend_dpto1 = salarioVendedores + salarioVendedores*0.2;
    } else{
        salario_vend_dpto1 = salarioVendedores;
    }
    
    if ( ventas_dpto2 > porcentaje_totalVentas ){
        salario_vend_dpto2 = salarioVendedores + salarioVendedores*0.2;
    } else{
        salario_vend_dpto2 = salarioVendedores;
    }

    if ( ventas_dpto3 > porcentaje_totalVentas ){
        salario_vend_dpto3 = salarioVendedores + salarioVendedores*0.2;
    } else{
        salario_vend_dpto3 = salarioVendedores;
    }

    System.out.println("El salario de los vendedores de los departamentos 1 es: " + salario_vend_dpto1 );
    System.out.println("El salario de los vendedores de los departamentos 2 es: " + salario_vend_dpto2 );
    System.out.println("El salario de los vendedores de los departamentos 3 es: " + salario_vend_dpto3 );

}

}
