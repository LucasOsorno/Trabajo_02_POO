//Definicion clase principal

import java.util.Scanner;

public class Ejercicio_12{

    public static void main(String[] args){

        //Leemos el nombre del trabajador

        Scanner scanner_1 = new Scanner(System.in);

        System.out.println("Ingrese el nombre del trabajador:");
   
        String nombre = scanner_1.nextLine();

        //Leemos las horas trabajadas

        Scanner scanner_2 = new Scanner(System.in);

        System.out.println("Ingrese el numero de horas trabajadas:");
   
        double horas_trabajadas = scanner_2.nextDouble();

        //Leemos el valor de la hora de trabajo

        Scanner scanner_3 = new Scanner(System.in);

        System.out.println("Ingrese el valor de la hora de trabajo:");
   
        double valor_hora_trabajo = scanner_3.nextDouble();

        //Realizamos el calculo

        double salario_total = Salario.devengado(horas_trabajadas, valor_hora_trabajo);

        System.out.println("El trabajador" + " " + nombre + " " + "devengo: $" + salario_total);


    }
}

//Definimos la clase donde estaran las operaciones y condiciones

class Salario{

    public static double devengado(double horas_trabajadas, double valor_hora_trabajo){

        double horas_extra, horas_triples, valor_sin_extras, valor_hr_extra, valor_hr_triples, total_1, total_2;

        if (horas_trabajadas > 40){

            horas_extra = (horas_trabajadas - 40);

            valor_hr_extra = (horas_extra * valor_hora_trabajo * 2);

            total_1 = valor_hr_extra + (40 * valor_hora_trabajo);
            
            
            if (horas_extra > 8){

                horas_triples = (horas_extra - 8);

                valor_hr_triples = (horas_triples * valor_hora_trabajo * 3);

                total_2 = valor_hr_triples + (8*2*valor_hora_trabajo) + (40*valor_hora_trabajo);

                return total_2;
            } else{

                return total_1;
            }

        } else{
                
            valor_sin_extras = horas_trabajadas * valor_hora_trabajo;

            return valor_sin_extras;
        }
    }
}