/*Escriba un programa de cargue una cadena por teclado. Mostrar a continuación
por pantalla cuantos espacios en blanco se ingresaron.
 */
package pkg0022.ejercicio_cadenas1;

import java.util.Scanner;

public class Ejercicio_Cadenas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una frase");
        
        String fraseOriginal = sc.nextLine();
        String fraseDividida[] = fraseOriginal.split("");
        int contador = 0;
        
        for (int i = 0; i < fraseDividida.length ; i++) {
            if (fraseDividida[i].equals(" ")) {
                contador++;
            }
        }
        
        System.out.println("La cantidad de espacios en la frase que ingreso es " + contador);
    }
    
}
