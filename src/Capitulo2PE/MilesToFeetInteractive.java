/*
Capitulo 2:

Ejercicio 4:
b) Convierte la clase MilesToFeet a una aplicación interactiva. En lugar de asignar
un valor a la distancia, acepte el valor del usuario como entrada. Guarde el revisado
clase como MilesToFeetInteractive.java.
 */
package Capitulo2PE;

import java.util.Scanner;

public class MilesToFeetInteractive {
    public void ex() {
        //Declaracion y asignacion de variables
        int milleToFeet=5280;
        float distance;
        float distanceFinal;
        //Creamos un scanner para la entrada de datos
        Scanner entrada = new Scanner(System.in);
        
        //Solicitud del dato
        System.out.printf("Ingrese la cantidad de millas de distancia de tu tio y tu: ");
        distance= entrada.nextFloat();
        //Se multiplica milleToFeet*float para convertirlo en float
        distanceFinal= distance*(float)milleToFeet;
        //Impresión de resultados
        System.out.println("\nLa distancia entre la casa de mi tio y la mia es de "+distance+" millas o "+distanceFinal +"pies ");
    }
}
