/*Escriba un programa que solicite al usuario que introduzca el número
de alumnos de una clase. A continuación, haciendo uso de un bucle, pedir
la altura de cada uno de los alumnos. El programa debe mostrar: Número de
alumnos con altura mayor a 1,80. Número de alumnos con altura menor a 1,80.
El promedio de alturas de la clase.
 */
package pkg0018.ejercicio_ciclo_for2;

import java.util.Scanner;

public class Ejercicio_Ciclo_for2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el numero de estudiantes");
        int numeroEstudiantes = Integer.parseInt(sc.nextLine());
        double alturaEstudiantes = 0.0;        
        double conteo = 0;
        int estudiantesBajos = 0;
        int estudiantesAltos = 0;
        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.println("Digite la altura del estudiante" + (i+1));
            alturaEstudiantes = Double.parseDouble(sc.nextLine());
            if (alturaEstudiantes >= 1.8) {
                estudiantesAltos++;
            }else{
                estudiantesBajos++;
            }
        }
        System.out.println("En el salon hay " + estudiantesAltos + " estudiantes altos y " + estudiantesBajos + " estudiantes bajos");
    }
    
}
