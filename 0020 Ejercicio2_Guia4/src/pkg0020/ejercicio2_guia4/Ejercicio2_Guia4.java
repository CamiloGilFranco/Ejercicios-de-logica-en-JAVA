/*Construya un programa que solicite una cadena de texto al usuario e imprima
la cantidad de vocales
 */
package pkg0020.ejercicio2_guia4;

import java.util.Scanner;

public class Ejercicio2_Guia4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una frace cualquiera");
        
        String frase = sc.nextLine();
        frase = frase.toUpperCase();
        String letras[] = frase.split("");
        int conteo = 0;
        
        for (String i : letras) {
            if (i.equals("A") || i.equals("E") || i.equals("I") || i.equals("O") || i.equals("U")){
                conteo++;
            }
        }
        System.out.println("Su frase tiene " + conteo + " vocales");
    }
    
}
