// Clase principal

import java.util.Scanner;

public class Ejercicio_18 {

    public static void main(String[] args) {

        
        double valor_hora_trabajada = 90000; // Valor por hora trabajada
        double porcentaje_retencion = 10; // Retención en porcentaje
        double salario_bruto, salario_neto;

        //Creamos la clase de lo que entrara el usuario
        Scanner my0bj = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado:");

        String nombre_empleado = my0bj.nextLine();

        //Creamos la clase de lo que entrara el usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el codigo del empleado:");

        int codigo_empleado = scanner.nextInt();
        
        //Creamos la clase de lo que entrara el usuario
        Scanner scanner_1 = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas al mes:");
    
        double horas_trabajadas_mes = scanner_1.nextDouble();



        // Calculamos salario y retención usando la clase Empleado
        salario_bruto = Empleado.calcularSalarioBruto(horas_trabajadas_mes, valor_hora_trabajada);
        salario_neto = Empleado.calcularSalarioNeto(salario_bruto, porcentaje_retencion);

        // Asignamos valores a los datos del empleado
        codigo_empleado = 1001310471;
        nombre_empleado = "Laura Ruiz";

        // Imprimimos los resultados
        System.out.println("Código: " + codigo_empleado);
        System.out.println("Nombre: " + nombre_empleado);
        System.out.println("Salario bruto: " + salario_bruto);
        System.out.println("Salario neto: " + salario_neto);
    }
}

// Clase Empleado que contiene los métodos de cálculo
class Empleado {

    // Método para calcular el salario bruto
    public static double calcularSalarioBruto(double horasTrabajadas, double valorHora) {
        return horasTrabajadas * valorHora;
    }

    // Método para calcular el salario neto
    public static double calcularSalarioNeto(double salarioBruto, double porcentajeRetencion) {
        double retencion = salarioBruto * (porcentajeRetencion / 100);
        return salarioBruto - retencion;
    }
}
