package pkg0008.ejercicio1_guia2;
import java.util.Scanner;

/*Dada una coordenada (𝑥,𝑦) que representa un punto en el plano cartesiano,
construya un algoritmo que permita determinar a qué cuadrante pertenece
dicho punto.
*/
public class Ejercicio1_Guia2 {

    public static int analisis (double x, double y){
        int variableControl = 0;
        
        if (x > 0 && y > 0){
            variableControl = 1;
        }else if (x < 0 && y > 0){
            variableControl = 2;
        }else if (x < 0 && y < 0){
            variableControl = 3;
        }else if (x > 0 && y < 0){
            variableControl = 4;
        }
        return variableControl;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite el componente en x de la coordenada");
        double X = Double.parseDouble(sc.nextLine());
        System.out.println("Digite el valor en y de la coordenada");
        double Y = Double.parseDouble(sc.nextLine());
        
        int resultado = analisis(X, Y);
        
        if (resultado == 0){
            System.out.println("La coordenada no se encuentra en ningun cuadrante");
        }else{
            System.out.println("La coordenada dada se encuentra en el cuadrante #" + resultado);
        }
        }    
}
