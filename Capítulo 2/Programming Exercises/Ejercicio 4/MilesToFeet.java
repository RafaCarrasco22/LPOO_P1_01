/*
Capitulo 2:

Ejercicio 4:
a) Escriba una clase de Java que declara una constante con nombre que contiene 
el número de pies en una milla: 5.280. También declare una variable para 
representar la distancia en millas entre tu casa y la de tu tío. 
Asignar un valor apropiado a la variable-por ejemplo, 8.5. Calcule y muestre 
la distancia hasta la casa de su tío en ambos millas y pies. 
Mostrar texto explicativo con los valores, por ejemplo, la distancia a la 
casa de mi tío es de 8.5 millas o 44880.0 pies. Guarde la clase como
MilesToFeet.java.
 */
package capitulo2;

public class MilesToFeet {
    public static void main(String[] args) {
        //Declaracion y asignacion de variables
        int milleToFeet=5280;
        float distance=8.5f;
        float distanceFinal;
        
        //Se multiplica milleToFeet*float para convertirlo en float
        distanceFinal= distance*(float)milleToFeet;
        
        //Impresión de resultados
        System.out.println("La distancia entre la casa de mi tio y la mia es de "+distance+" millas o "+distanceFinal +"pies ");
    }
    
}
