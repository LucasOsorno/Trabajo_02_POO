public class Ecuacion {

    public static double solucion1 (double A,double B,double C){
        return (-B + Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / (2 * A);
    }
    public static double solucion2 (double A,double B,double C){
        return (-B - Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / (2 * A);
    }
    public static double Determinante(double A,double B,double C){
        return Math.pow(B,2) - 4*A*C;
    }
}

import java.util.Scanner;
public class Ejercicio23 {

    public static void main(String[] args) {
        double parametroA, parametroB, parametroC;
        double determinante;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        parametroA = entrada.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        parametroB = entrada.nextDouble();
        System.out.println("Ingrese el valor de C: ");
        parametroC = entrada.nextDouble();
        determinante = Ecuacion.Determinante(parametroA, parametroB, parametroC);
        if (determinante>0 || determinante==0){
            System.out.println("La solucion 1 es: "+Ecuacion.solucion1(parametroA, parametroB, parametroC));
            System.out.println("La solucion 2 es: "+Ecuacion.solucion2(parametroA, parametroB, parametroC));
        }else{
            System.out.println("La ecuacion no tiene soluciones reales");
        }  
    }   
}
