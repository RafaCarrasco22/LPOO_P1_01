/*
Capitulo 3.-

Ejercicio 3:
b)Modifique la clase ArithmeticMethods para aceptar los valores de los dos 
enteros de un usuario en el teclado.
 */
package Capitulo3PE;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class ArithmeticMethods2 {
       //Método que suma 1000 a la suma de los dos enteros
    private static void displayNumberPlus10(Integer num1, Integer num2) {
        Integer resultado = num1 + num2 + 10;
        System.out.println("El resultado de la suma es: "+ resultado);
    }
	//Método que suma 100 a la suma de los dos enteros
    private static void displayNumberPlus100(Integer num1, Integer num2) {
        Integer resultado = num1 + num2 + 100;
	System.out.println("El resultado de la suma es: "+ resultado);
    }
	//Método que suma 1000 a la suma de los dos enteros
    private static void displayNumberPlus1000(Integer num1, Integer num2) {
        Integer resultado = num1 + num2 + 1000;
	System.out.println("El resultado de la suma es: "+ resultado);
    }
    public void ex() {
        //Declaracion de variables y scanner
        Integer num1;
	Integer num2;
        Scanner sc = new Scanner(System.in);
        //Solicitud de los datos
        System.out.println("Ingrese el valor de num1: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el valor de num2: ");
        num2 = sc.nextInt();
        //LLamado a los métodos
	displayNumberPlus10(num1, num2);
        displayNumberPlus100(num1, num2);
	displayNumberPlus1000(num1, num2);
    }
    
}
