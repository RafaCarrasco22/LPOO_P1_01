/*
Capitulo 2:

Ejercicio 5:
a)
Escriba una clase Java que declare una constante con nombre que represente
el incremento anticipado del 10 por ciento en las ventas para cada división 
de una compañía el próximo año. (Puede representar el 10 por ciento como 0.10).
También declare las variables para representar el total de ventas de este año 
en dólares para las divisiones Norte y Sur. Asigne valores apropiados a las 
variables, por ejemplo, 4000 y 5500. Calcule y muestre, con texto explicativo, 
las ventas proyectadas del año próximo para cada división. 
Guarde la clase como ProjectedSales.java.
 */
package capitulo2;

public class ProjectedSales {
    public static void main(String[] args) {
        //Variables con los valores propuestos
        double incr = 0.10;
        int norte = 4000;
        int sur = 5500;
        double proyecNorte;
        double proyecSur;
	
        //Calculo de las proyecciones
        proyecNorte = norte + (norte * incr);
        proyecSur = sur + (sur * incr);
	//Muestra de resultados    
        System.out.println("La cifra de ventas proyectadas para el norte es " + proyecNorte);
        System.out.println("La cifra de ventas proyectadas para el sur es " + proyecSur);
    }    
}
