/*Escriba un programa que valide contraseñas. Una contraseña será válida cuando
tenga entre 10 y 20 caracteres y contenga alguno de los 3 siguientes
caracteres: *,-,_. En caso de que la contraseña no sea válida, mostrar
mensaje de error.
 */
package pkg0023.ejercicio_cadenas_2;

import java.util.Scanner;

public class Ejercicio_Cadenas_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite su contraseña");
        
        String contrasenaFull = sc.nextLine();
        String contrasenaDividida[] = contrasenaFull.split("");
        
        
        
        if (contrasenaDividida.length >= 10 && contrasenaDividida.length <= 20) {
            if (contrasenaFull.contains("*") || contrasenaFull.contains("-") || contrasenaFull.contains("_")) {
                System.out.println("Contraseña aceptada");
            }else{
                System.out.println("Contraseña invalida");
            }
        }else{
            System.out.println("Contraseña invalida");
        }
    }
    
}
