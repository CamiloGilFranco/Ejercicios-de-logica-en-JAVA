/*Construya un programa que permita leer dos números enteros e imprima
el resultado de sumar ambos números*/

package ejercicio1_guia1;

import java.util.Scanner;

public class Ejercicio1_Guia1 {
    public static double suma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double primerNumero = Double.parseDouble(sc.nextLine());
        double segundoNumero = Double.parseDouble(sc.nextLine());
        double total = suma(primerNumero, segundoNumero);
        System.out.println("El resultado de la suma es " + total);
    }
    
}
