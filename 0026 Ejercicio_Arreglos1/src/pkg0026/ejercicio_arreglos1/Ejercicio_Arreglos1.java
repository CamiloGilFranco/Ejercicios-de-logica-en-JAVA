/*Escriba un programa que cree e inicialice un Array de 10 elementos enteros
con valores aleatorios entre 1 y 10. A continuación debe imprimir el contenido
del Array y la suma de todos sus elementos.
 */
package pkg0026.ejercicio_arreglos1;

public class Ejercicio_Arreglos1 {

    public static void main(String[] args) {
        int arreglo[] = new int[10];
        int cuenta = 0;
        int contador = 0;
        double random = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            random = Math.random() * 10;
            arreglo[i] = (int)random;
            System.out.println("El valor asignado a la posicion " + contador + " es: " + arreglo[i]);
            cuenta = cuenta + arreglo[i];
            contador++;
        }
        
        System.out.println("La suma de todos los valores es: " + cuenta);
    }
    
}
