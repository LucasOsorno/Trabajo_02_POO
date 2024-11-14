// Clase principal

import java.util.Scanner;

public class Ejercicio_10{

    public static void main(String[] args){

        //Definicion variables 

        double incremento, valor_inicial;


        //Leemos el numero de inscripcion
        Scanner scanner_1 = new Scanner(System.in);

        System.out.println("Ingrese el numero de inscripcion del estudiante:");
   
        String numero_incripcion = scanner_1.nextLine();

        //Leemos el nombre
        Scanner scanner_2 = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:");
   
        String nombre = scanner_2.nextLine();

        //Leemos el patrimonio
        Scanner scanner_3 = new Scanner(System.in);

        System.out.println("Ingrese el valor del patrimonio:");
   
        double patrimonio = scanner_3.nextDouble();

         //Leemos el estrato social
         Scanner scanner_4 = new Scanner(System.in);

         System.out.println("Ingrese el estrato social:");
    
         double estrato = scanner_4.nextDouble();

         incremento = 30; //porcentaje
         valor_inicial = 50000;


        //Realizamos la operacion

        double valor_a_pagar = Matricula.valor_matricula(estrato, incremento, patrimonio , valor_inicial);

        System.out.println("El estudiante con numero de inscripcion" + " " + numero_incripcion + " " + "y nombre" + " " + nombre + " " + "debe pagar $" + valor_a_pagar);


    }
}


//Creamos la clase de los calculos

class Matricula{
    
    public static double valor_matricula(double estrato, double incremento, double patrimonio, double valor_inicial_matricula){
        double total;
        
        if (estrato > 3 && patrimonio > 2e6){
             total = valor_inicial_matricula + (patrimonio * (incremento / 100));
        } else{

            total = valor_inicial_matricula;
        }

        return total;
    }
}