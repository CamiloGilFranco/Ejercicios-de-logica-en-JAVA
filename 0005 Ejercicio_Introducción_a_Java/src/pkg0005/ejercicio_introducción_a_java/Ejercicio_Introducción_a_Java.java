/*Escriba un programa que pida al usuario que introduzca su nombre y su edad,
y muestre con dichos datos, un mensaje de bienvenida.*/

package pkg0005.ejercicio_introducción_a_java;

import java.util.Scanner;

public class Ejercicio_Introducción_a_Java {   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escriba su nombre");
        String nombre = sc.nextLine();
        System.out.println("Escriba su edad");
        int edad = Integer.parseInt(sc.nextLine());
        
        System.out.println("Hola " + nombre + " tu edad es " + edad);
        System.out.println("Bienvenido a Java");
    }
    
}
