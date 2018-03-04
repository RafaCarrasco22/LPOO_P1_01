/*
Capitulo 2:

Ejercicio 6:
a) 
Escriba una clase que declare una variable llamada pulgadas que tenga 
una longitud en pulgadas y asigne un valor. Muestra el valor en pies y
pulgadas; por ejemplo, 86 pulgadas se convierte en 7 pies y 2 pulgadas.
Asegúrese de usar una constante con nombre cuando corresponda. 
Guarde la clase como InchesToFeet.java.
 */
package Capitulo2PE;

public class InchesToFeet {
    public void ex() {
        //Valor del ejercicio propuesto    
        int inches = 86; 
        int pie = 12; //1 pie = 12 inches 
        //Operaciones para obtener la cantidad de pies e inches
        int cant = inches / pie; 
        int res = inches % pie;
        //Muestra de resultados
        System.out.println(inches + " pulgadas es equivalente a\n " + 
              cant + " pies \n " + res + " pulgadas ");
    }
}
