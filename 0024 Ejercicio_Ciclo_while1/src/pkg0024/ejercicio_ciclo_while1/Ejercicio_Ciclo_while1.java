/*Escriba un programa que lea números constantemente mientras no se introduzca
un 0. El programa debe mostrar cuantos de los números introducidos son pares
y cuantos impares.
 */
package pkg0024.ejercicio_ciclo_while1;

import java.util.Scanner;

public class Ejercicio_Ciclo_while1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double entrada = Double.parseDouble(sc.nextLine());;
    int pares = 0;
    int impares = 0;
    
    while (entrada != 0.0){
        
        if (entrada % 2 == 0.0) {
            pares++;
        }else{
            impares++;
        }
        
        entrada = Double.parseDouble(sc.nextLine());
    }
    
    System.out.println("La cantidad de pares digitados fue " + pares);
    System.out.println("La cantidad de impares digitados fue " + impares);
    }
    
}
