public class Esferas {

    public static String pesoEsferas(double pesoA,double pesoB,double pesoC){
        if (pesoA<pesoB && pesoB<pesoC){
            return "C";
        }else if (pesoA<pesoB && pesoB>pesoC){
            return "B";
        }else{
            return "A";
        }
    }  
}

import java.util.Scanner;
public class Ejercicio24 {

    public static void main(String[] args) {
        double pesoA, pesoB, pesoC;
        String pesada;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A: ");
        pesoA = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera B: ");
        pesoB = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera C: ");
        pesoC = entrada.nextDouble();
        pesada = Esferas.pesoEsferas(pesoA, pesoB, pesoC);
        System.out.println("La esfera mas pesada es "+pesada);   
    }   
}
