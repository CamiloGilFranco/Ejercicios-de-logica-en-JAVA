/*Leer dos números enteros y determinar si la diferencia entre ambos
es un divisor exacto de alguno de los dos números
 */
package pkg0010.ejercicio3_guia2;

import java.util.Scanner;

public class Ejercicio3_Guia2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite el primer numero");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Digite el segundo numero");
        int num2 = Integer.parseInt(sc.nextLine());
        double diferencia = 0;
        
        if (num1 > num2){
            diferencia = num1 - num2;
            
            if (num1 % diferencia == 0){
                System.out.println("La diferencia entre los dos numeros es " + diferencia);
                System.out.println(diferencia + " es divisor del primer numero");
            }else if(num2 % diferencia == 0){
                System.out.println("La diferencia entre los dos numeros es " + diferencia);
                System.out.println(diferencia + " es divisor del segundo numero");
            }else{
                System.out.println("La diferencia entre los dos numeros es " + diferencia);
                System.out.println(diferencia + " no es divisor de ninguno de los dos numeros");
            }
        }else if (num2 > num1){
            diferencia = num2 - num1;
            
            if (num2 % diferencia == 0) {
                System.out.println("La diferencia entre los dos numeros es " + diferencia);
                System.out.println(diferencia + " es divisor del segundo numero");
            }else if (num1 % diferencia == 0){
                System.out.println("La diferencia entre los dos numeros es " + diferencia);
                System.out.println(diferencia + " es divisor del primer numero");
            }else{
                System.out.println("La diferencia entre los dos numeros es " + diferencia);
                System.out.println(diferencia + " no es divisor de ninguno de los dos numeros");
            }
        }else{
            System.out.println("La diferencia entre los dos numeros es " + diferencia);
            System.out.println(diferencia + " no es divisor de ninguno de los dos numeros");
        }
        
    }
    
}
