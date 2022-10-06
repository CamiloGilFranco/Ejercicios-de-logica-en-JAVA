/*Construya un programa que a partir de un arreglo de N números determine
qué porcentaje de los números son cero, qué porcentajes son positivos
y qué porcentajes son negativos
 */
package pkg0015.ejercicio2_guia3;

import java.util.Scanner;

public class Ejercicio2_Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite cuantos numeros seran ingresados");
        int cantidad = Integer.parseInt(sc.nextLine());
        System.out.println("Digite" + cantidad + " numeros seguidos de la tecla Intro");
        int arreglo[] = new int [cantidad];
        int pares = 0;
        int impares =0;
        int ceros = 0;
        
        for (int i = 0; i < cantidad ; i++) {
            arreglo[i] = Integer.parseInt(sc.nextLine());
            
            if (arreglo[i] == 0) {
                ceros++;
            }else if (arreglo[i] % 2 == 0){
                pares++;
            }else if (arreglo[i] % 2 != 0) {
                impares++;
            }
        }
        
        System.out.println("El procentaje de numeros que son 0 es " + ceros * 100 / cantidad + "%");
        System.out.println("El procentaje de numeros que son pares es " + pares * 100 / cantidad + "%");
        System.out.println("El procentaje de numeros que son impares es " + impares * 100 / cantidad + "%");
    }
    
}
