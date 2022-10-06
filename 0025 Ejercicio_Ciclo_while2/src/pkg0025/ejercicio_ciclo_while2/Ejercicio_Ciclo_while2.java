/*Escriba un programa que lea notas comprendidas entre 0 y 10 hasta que se
introduzca una nota no válida. El programa debe mostrar la nota válida más
alta y la más baja.
 */
package pkg0025.ejercicio_ciclo_while2;

import java.util.Scanner;

public class Ejercicio_Ciclo_while2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite una nota comprendida entre 0 y 10");
        double nota = Double.parseDouble(sc.nextLine());
        double notaMayor = 0;
        double notaMenor = 1111111;
        
        while (nota >= 0 && nota <= 10){
            if (nota > notaMayor) {
                notaMayor = nota;
            }
            if (nota < notaMenor){
                notaMenor = nota;
            }
            
            nota =Double.parseDouble(sc.nextLine());
        }
        
        System.out.println("La nota ingresada no es valida");
        System.out.println("La nota mas alta ingresada es " + notaMayor);
        System.out.println("La nota mas baja ingresada es " + notaMenor);
    }
    
}
