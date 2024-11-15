package Tarea_2;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
 
        //Ingresamos el valor de A

        Scanner A_input = new Scanner(System.in);
        System.out.println("Ingrese el valor de A:");
        int A_value = A_input.nextInt();

         //Ingresamos el valor de B

         Scanner B_input = new Scanner(System.in);
         System.out.println("Ingrese el valor de B:");
         int B_value = B_input.nextInt();

         // Realicemos los condicionales para comparar el valor de B con el A (mayor, igual o menor)

         if (A_value > B_value) {
             System.out.println("A es mayor que B");
         } else if (A_value == B_value) {
            System.out.println("A es igual que B");
         } else {
            System.out.println("A es menor a B");
         }

}


}
