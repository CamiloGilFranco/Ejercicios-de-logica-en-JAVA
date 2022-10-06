/*Construya un programa que solicite al usuario n números enteros positivos
los almacene en un arreglo e imprima, el promedio y la desviación estándar
del arreglo de números
 */
package pkg0019.ejercicio1_guia4;

import java.util.Scanner;

public class Ejercicio1_Guia4 {

    public static double promedio(double lista[]){
        double cuenta = 0;
        double promedio = 0;
        for (int i = 0; i < lista.length; i++) {
            cuenta = cuenta + lista[i];
        }
        promedio = cuenta / lista.length;
        return promedio;
    }
    
    public static double desviacionEstandar(double lista[]){
        double cuenta = 0;
        double desviacion = 0;
        double promedio = promedio(lista);
        
        for (int i = 0; i < lista.length; i++) {
            cuenta = cuenta + Math.pow(lista[i] - promedio, 2);
        }
        desviacion = Math.sqrt(cuenta / (lista.length - 1));
        return desviacion;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite cuantos numeros desea operar");
        int cantidadDatos = Integer.parseInt(sc.nextLine());
        double arreglo[] = new double[cantidadDatos];
        for (int i = 0; i < cantidadDatos; i++) {
            System.out.println("Digite un numero entero positivo");
            arreglo[i] = Double.parseDouble(sc.nextLine());
        }
        double promedio = promedio(arreglo);
        double desviacion = desviacionEstandar(arreglo);
        
        System.out.println("El promedio de los valores ingresados es " + promedio);
        System.out.println("La desviacion estandar de los datos ingresados es " + desviacion);
    }
    
}
