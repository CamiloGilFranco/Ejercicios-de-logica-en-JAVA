/*Escriba un programa que calcule áreas de triángulos. Para ello pedirá
al usuario que introduzca la base y la altura y realizará el cálculo necesario
para calcular el área, sabiendo que: Área = (base x altura) / 2
 */
package pkg0007.ejercicio_calculos_aritmeticos;

import java.util.Scanner;

public class Ejercicio_Calculos_Aritmeticos {

public static double area(double base, double altura){
    double areaTriangulo = base * altura /2;
    return areaTriangulo;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la altura del triangulo");
        double ALTURA = Double.parseDouble(sc.nextLine());
        System.out.println("Digite la base del triangulo");
        double BASE = Double.parseDouble(sc.nextLine());
        
        double total = area(ALTURA, BASE);
        System.out.println("El area del triangulo es " + total);
    }
    
}
