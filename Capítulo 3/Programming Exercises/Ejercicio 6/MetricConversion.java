/*
Capitulo 3.-

Ejercicio 6.- Hay 2.54 centímetros en una pulgada, y hay 3.7854 litros en un 
galón de los EE.UU. Crea una clase llamada MetricConversion. Su método main () 
acepta un valor entero de un usuario en el teclado y, a su vez, pasa el valor 
ingresado a dos métodos. Uno convierte el valor de pulgadas a centímetros y el
otro convierte el mismo valor de galones en litros. Cada método muestra los 
resultados con la explicación adecuada.
 */
package metricconversion;

import java.util.Scanner;

public class MetricConversion {
//Metodo que convierte pulgadas a cm
    public static void inchesToCm(int a){
        double valF = a*2.54;
        System.out.println(a+" pulgadas equivalen a "+valF+" cm");
    }
    //Metodo que convierte galones a litros
    public static void galToLitro(int a){
        double valF = a*3.7854;
        System.out.println(a+" galones equivalen a "+valF+" litros");
    }
    public static void main(String[] args) {
        //Declaracion y solicitud del valor a manipular
        int valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un valor entero: ");
        valor = sc.nextInt();
        //Llamado a los metodos pasando el respectivo parametro
        inchesToCm(valor);
        galToLitro(valor);
    }
    
}
