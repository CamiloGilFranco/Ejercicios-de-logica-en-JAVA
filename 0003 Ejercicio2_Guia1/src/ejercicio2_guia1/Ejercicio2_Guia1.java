/*Construya un programa que permita convertir una distancia en kilómetros
a su equivalente en metros y centímetros*/

package ejercicio2_guia1;

import java.util.Scanner;

public class Ejercicio2_Guia1 {
    public static double[] conversionDistancia (double distancia){
        double distanciaMetros = distancia * 1000;
        double distanciaCentimetros = distanciaMetros * 100;
        double[] resultados = new double[2];
        resultados[0] = distanciaMetros;
        resultados[1] = distanciaCentimetros;
        return resultados;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilometros = Double.parseDouble(sc.nextLine());
        double[] listaResultados = conversionDistancia(kilometros);
        System.out.println(kilometros + " kilometros es igual a " + listaResultados[0] + " metros");
        System.out.println(kilometros + " kilometros es igual a " + listaResultados[1] + " centimetros");
               
    }
    
}
