/*
Capitulo 3.-

Ejercicio 5.- Cuando la gasolina es de $ 100 por barril, el precio del consumidor 
en la bomba oscila entre $ 3.50 y $ 4.00 por galón. Crea una clase llamada 
GasPrices. Su método main () contiene una variable entera llamada pricePerBarrel
a la que se le asignará un valor ingresado por un usuario en el teclado. 
Crea un método para pasar pricePerBarrel. El método muestra el rango de precios 
posibles por galón. Por ejemplo, si el gas es de $ 120 por barril, entonces el 
precio en la bomba debería estar entre $ 4.20 y $ 4.80. 
 */
package Capitulo3PE;

import java.util.Scanner;

public class GasPrices {
    //Metodo que calcula el rango de precios
    public static void rangoPrecios(int a){
        double precioM,preciom;
        precioM = a *0.035;
        preciom = a *0.04;
        System.out.println("El rango de precios esta entre "+precioM+
                " y "+preciom);
    } 
    
    public void ex() {
        //Declaracion y solicitud de los datos
        int pricePerBarrel;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio por barril: ");
        pricePerBarrel = sc.nextInt();
        //Llamado al metodo pasando como parametro el precio
        rangoPrecios(pricePerBarrel);
    }
    
}
