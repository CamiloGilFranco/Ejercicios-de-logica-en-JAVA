/*leer tres números enteros e imprimir el mayor
*/
package pkg0009.ejercicio2_guia2;

import java.util.Scanner;

public class Ejercicio2_Guia2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite el primer numero");
        double num1 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite el segundo numero");
        double num2 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite el segundo numero");
        double num3 = Double.parseDouble(sc.nextLine());
        
        if (num1 > num2 && num1 > num3){
            System.out.println("El numero mayor es " + num1);
        }else if (num2 > num1 && num2 > num3){
            System.out.println("El numero mayor es " + num2);
        }else{
            System.out.println("El numero mayor es " + num3);
        }
        
        
    }
    
}
