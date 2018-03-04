/*
Capitulo 3.-

Ejercicio 4.-
a)Crea una aplicación llamada Percentajes cuyo método main () contiene dos double
variables. Asignar valores a las variables. Pase ambas variables a un método llamado
computePercent () que muestra los dos valores y el valor del primer número como
porcentaje del segundo. Por ejemplo, si los números son 2.0 y 5.0, el método
debería mostrar una declaración similar a "2.0 es 40% de 5.0." Luego llame al metodo por segundo
tiempo, pasando los valores en orden inverso. 
 */
package Capitulo3PE;

public class Percentages {
    //Metodo que calcula el porcentaje usando regla de 3
    private static void computePercent(double a, double b){
        double porcentaje = (a*100)/b;
        System.out.println(a+" es el "+porcentaje+" % de "+b);
    }
    
    public void ex() {
        //Variables del tipo solicitado y predefinidas
        double a = 10;
        double b = 5;
        //Llamado al metodo pasando los parametros necesarios
        computePercent(a,b);
        computePercent(b,a);
    }
    
}
