/*Construya un programa que, dado un número, diga si es o no un número
de Armstrong Un número de n dígitos es un número de Armstrong si la suma
de las potencias n ésimas de los dígitos que lo componen es igual al mismo
número Ejemplo 1634 es un número de Armstrong.
 */
package pkg0016.ejercicio3_guia3;

import java.util.Scanner;

public class Ejercicio3_Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero");
        
        String entrada = sc.nextLine();
        String numero[] = entrada.split("");
        int numeroEscrito = Integer.parseInt(entrada);
        
        int digitos = numero.length;
        int valores[] = new int[digitos];
        double total = 0;
        double operacion = 0;
        
        for (int i = 0; i < digitos; i++) {
            valores[i] = Integer.parseInt(numero[i]); 
            operacion = Math.pow(valores[i], digitos);
            total = total + operacion;
        }
        
        if (numeroEscrito == total) {
            System.out.println("El numero " + numeroEscrito + " es un numero de armstrong");
        }else{
            System.out.println("El numero " + numeroEscrito + " no es un numero de armstrong");
        }
        
        
        }
    
}
