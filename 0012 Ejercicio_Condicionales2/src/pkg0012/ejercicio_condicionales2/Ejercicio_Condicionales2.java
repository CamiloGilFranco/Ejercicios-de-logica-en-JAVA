/*Escriba un programa que lea una nota numérica y devuelva la calificación
a la que corresponde, sabiendo que:

0 <= nota < 3: Deficiente
3 <= nota < 5: Insuficiente
5 <= nota < 6: Suficiente
6 <= nota < 7: Bien
7 <= nota < 9: Excelente
9 <= nota <=10: Sobresaliente
*/
package pkg0012.ejercicio_condicionales2;

import java.util.Scanner;

public class Ejercicio_Condicionales2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = Double.parseDouble(sc.nextLine());
        
        if (nota < 0) {
            System.out.println("Ha ingresado un dato invalido");
        }else if (nota < 3) {
            System.out.println("Deficiente");            
        }else if (nota < 5) {
            System.out.println("Insuficiente");
        }else if (nota < 6) {
            System.out.println("Suficiente");
        }else if (nota < 7) {
            System.out.println("Bien");
        }else if (nota < 9) {
            System.out.println("Excelente");
        }else if (nota <= 10) {
            System.out.println("Sobresaliente");
        }else{
            System.out.println("Ha ingresado un dato invalido");
        }
    }
    
}
