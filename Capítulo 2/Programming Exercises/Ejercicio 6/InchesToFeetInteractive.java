/*
Capitulo 2:

Ejercicio 6: 
b)
Escriba una versión interactiva de la clase InchesToFet que acepte las pulgadas
valor de un usuario. Guarde la clase como InchesToFeetInteractive.java.
 */
package capitulo2;

import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        //Declaracion de las variables a usar    
        int inches; 
        int pie = 12; //1 pie = 12 inches
        Scanner entrada = new Scanner(System.in);
        //Ingreso de las pulgadas
        System.out.println("Ingresa la cantidad de pulgadas: ");
        inches = entrada.nextInt();
        //Operaciones para obtener la cantidad de pies e inches
        int cant = inches / pie; 
        int res = inches % pie;
      
      System.out.println(inches + " pulgadas es equivalente a\n " + 
              cant + " pies \n " + res + " pulgadas ");
    }
}
