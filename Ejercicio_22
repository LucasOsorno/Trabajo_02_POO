public class Empleado {
    String nombre;
    double salario_h;
    double horas;
  
    public static double salario(double salario_h , double horas){
        return (salario_h * horas);
    }    
    
}

import java.util.Scanner;
public class Ejercicio22A2 {
    public static void main(String[] args) {
        double salario_h, horas, salario;
        String nombre;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = entrada.next();
        System.out.println("Ingrese el salario por hora: ");
        salario_h = entrada.nextDouble();
        System.out.println("Ingrese las horas trabajadas en el mes: ");
        horas = entrada.nextDouble();
        salario = Empleado.salario(salario_h, horas);
        if (salario>450000){
            System.out.println("El salario mensual de "+ nombre +" es $"+ salario );
        }else{
            System.out.println("El empleado se llama " + nombre);
        }   
    }
    
}
