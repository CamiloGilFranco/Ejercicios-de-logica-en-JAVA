/*Escribe un programa que pida al usuario un número y muestre por pantalla
si es negativo y múltiplo de 3 o si no lo es.
*/
package pkg0011.ejercicio_condicionales1;

import java.util.Scanner;

public class Ejercicio_Condicionales1 {
    
    public static void divisor(int numero){
        if (numero % 3 ==0) {
            System.out.println("El numero " + numero + " es multiplo de 3");
        }else{
            System.out.println("El numero " + numero + " no es multiplo de 3");
        }
    }
    
    public static void signo(int numero2){
        if (numero2 > 0){
            System.out.println("El numero " + numero2 +" es positivo");
        }else if (numero2 < 0) {
            System.out.println("El numero " + numero2 +" es negativo");
        }else{
            System.out.println("El numero " + numero2 + "no tiene signo");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite un numero entero");
        int entrada = Integer.parseInt(sc.nextLine());
        divisor(entrada);
        signo(entrada);
        
    }
    
}
