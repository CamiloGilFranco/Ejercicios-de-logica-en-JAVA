/*Leer un número y calcular su factorial.
 */
package pkg0014.ejercicio1_guia3;

import java.util.Scanner;

public class Ejercicio1_Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero");
        int numero = Integer.parseInt(sc.nextLine());
        int factorial = numero;
        
        for (int i = numero - 1; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial del numero " + numero + " es " + factorial);
    }
    
}
