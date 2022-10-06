/*Escriba un programa que realice la conversión de dólares a pesos colombianos.
Para ello, pedirá al usuario que introduzca los dólares a convertir y mostrará
por consola la equivalencia en pesos de dicha cantidad,
sabiendo que 1 dólar = 3500 pesos.
 */
package pkg0006.ejercicio_conversion_de_moneda;

import java.util.Scanner;

public class Ejercicio_Conversion_de_moneda {

    public static double conversion (double dolares){
        double pesos = dolares * 3500;
        return pesos;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el valor en dolares a convertir");
        double entrada = Double.parseDouble(sc.nextLine());
        double total = conversion(entrada);
        System.out.println("El valor ingresado es " + entrada +" dolares, eso equivale a "+ total + " pesos");
    }
    
}
