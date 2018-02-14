/*
Capitulo 3.-

Ejercicio 3.- 
a) Cree una aplicación llamada ArithmeticMethods cuyo método main()
contiene dos variables enteras. Asignar valores a las variables. A su vez, pase 
cada valor a los métodos denominados displayNumberPlus10 (), displayNumberPlus100 () 
y displayNumberPlus1000 (). Cree cada método para realizar la tarea que su nombre implica. 
*/
package arithmeticmethods;

public class ArithmeticMethods {
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
    public static void main(String[] args) {
        //Valores predefinidos
        Integer num1 = 5;
	Integer num2 = 10;
        //LLamado a los métodos
	displayNumberPlus10(num1, num2);
        displayNumberPlus100(num1, num2);
	displayNumberPlus1000(num1, num2);
    }
    
}
