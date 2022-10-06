/*Escriba un programa que pregunte por el precio de un producto y el número
de unidades que se desea comprar. A partir de esos datos, es necesario calcular
el precio final, sabiendo que se aplica un descuento según los siguientes
condicionantes: Si el costo de la compra es menor de 100, el cliente no tiene
derecho a descuento. Si el costo de la compra sobrepasa 200, el descuento
será del 15%. En cualquier otro caso, el descuento será del 10%.
 */
package pkg0013.ejercicio_condicionales3;

import java.util.Scanner;

public class Ejercicio_Condicionales3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double precio = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese la cantidad de productos");
        int cantidad = Integer.parseInt(sc.nextLine());
        
        double valori = cantidad * precio;
        double valorf = 0;
        int descuento = 0;
        
        if (valori > 200) {
            valorf = valori * 0.85;
            descuento = 15;
        }else if (valori <=200 && valori > 100) {
            valorf = valori * 0.9;
            descuento = 10;
        }else{
            valorf = valori;
        }
        
        System.out.println("El valor de la compra sin descuento es " + valori);
        System.out.println("El valor de la compra con descuento es " + valorf);
        System.out.println("El descuento aplicado es de " + descuento + "%");
        
    }
    
}
