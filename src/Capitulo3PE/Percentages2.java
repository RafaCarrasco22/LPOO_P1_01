/*
Capitulo 3.-

Ejercicio 4.-
b)Modificar la clase de Percentages para aceptar los valores de los dos dobles de un usuario
en el teclado. 
 */
package Capitulo3PE;

import java.util.Scanner;

public class Percentages2 {
    //Metodo que calcula el porcentaje usando regla de 3
private static void computePercent(double a, double b){
        double porcentaje = (a*100)/b;
        System.out.println(a+" es el "+porcentaje+" % de "+b);
    }
    public void ex() {
        //Variables a usar y scanner
        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        //Solicitud de datos
        System.out.print("Ingresa primer valor: ");
        a = sc.nextDouble();
        System.out.print("Ingresa segundo valor: ");
        b = sc.nextDouble();
        
        //Llamado al metodo pasando los parametros necesarios
        computePercent(a,b);
        computePercent(b,a);
    }
    
}
