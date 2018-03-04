/*
Capitulo 2:

Ejercicio 9:
El Happy Yappy Kennel junta perros a un costo de 50 centavos por libra por día.
Escriba una clase que acepte el peso de un perro y el número de días que debe
abordarse y que muestre el precio total del embarque. 
Guarde la clase como DogBoarding.java.
 */
package Capitulo2PE;

import java.util.Scanner;

public class DogBoarding {
    public void ex() {
        //Declaracion de cantidad de libras y dias
        float lb;
        int dias;
        Scanner entrada = new Scanner(System.in);
        
        //Solicitud de los datos a ocupar
        System.out.print("Ingrese la cantidad de libras que pesa el perro: ");
        lb = entrada.nextFloat();
        System.out.print("Ingrese la cantidad de dias: ");
        dias = entrada.nextInt();
        //Calculo del monto a pagar
        float costo = (0.5f*lb)*dias;
        //muestra de resultado
        System.out.println("El precio total es: $"+costo);
    }
}
