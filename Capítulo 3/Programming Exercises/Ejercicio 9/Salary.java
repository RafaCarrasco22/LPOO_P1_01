/*
Capitulo 3.-

Ejercicio 9.-
Escriba una aplicación que calcule y muestre el salario semanal de un empleado. El 
método main () solicita al usuario una tarifa de pago por hora, horas regulares y 
horas extraordinarias. Cree un método separado para calcular el pago de horas extras,
que es horas regulares multiplicadas por la tasa de pago más horas extraordinarias 
multiplicadas por 1.5 veces la tasa de pago; devuelve el resultado al método 
main () que se mostrará. Guarde el programa como Salary.java.
 */
package salary;

import java.util.Scanner;


public class Salary {
    public static double pagoFinal(int x,int y,int z){
        //Se calcula el pago de horas regulares
        int p = x*y;
        //costo de las horas extra
        double newPago = x*1.5;
        //se suma el pago regular + horas extra
        double pagoF = p+(z*newPago);
        //retorna el pago final
        return pagoF;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Solicitud de los datos necesarios
        System.out.print("Ingrsa la tarifa de pago por hora: ");
        int pago = sc.nextInt();
        System.out.print("Ingrsa la cantidad de horas regulares: ");
        int h = sc.nextInt();
        System.out.print("Ingrsa la cantidad de horas extras: ");
        int he = sc.nextInt();
        //se manda al metodo los datos necesarios para que este 
        //retorne el resultado
        double pF = pagoFinal(pago,h,he);
        System.out.println("El pago total es de: "+pF);
    }
    
}
