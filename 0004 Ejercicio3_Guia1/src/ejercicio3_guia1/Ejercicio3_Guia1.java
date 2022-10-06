/*Construya un programa que permita calcular la distancia entre dos puntos
conociendo sus coordenadas cartesianas*/

package ejercicio3_guia1;

import java.util.Scanner;

public class Ejercicio3_Guia1 {
    
    public static double distanciaEntrePuntos(double x1, double y1, double x2, double y2){
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)));
        return distancia;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite la ubicacion del punto x1");
        double X1 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite la ubicacion del punto y1");
        double Y1 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite la ubicacion del punto x2");
        double X2 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite la ubicacion del punto y2");
        double Y2 = Double.parseDouble(sc.nextLine());
        
        double resultado = distanciaEntrePuntos(X1, Y1, X2, Y2);
        
        System.out.println("La distancia entre los puntos es " + resultado);
    }
    
}
