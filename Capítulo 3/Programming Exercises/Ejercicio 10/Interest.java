/*
Capitulo 3.-

Ejercicio 10:

Escriba una aplicación que calcule y muestre la cantidad de dinero que tendría un 
usuario si su dinero pudiera invertirse con un interés del 5 por ciento durante un
año. Cree un método que solicite al usuario el valor de inicio de la inversión y 
lo devuelva al programa de llamada. Llame a un método diferente para hacer el 
cálculo y devuelva el resultado que se mostrará.
 */
package interest;

import java.util.Scanner;


public class Interest {

    public static double getInv(){
        //se solicita al dato necesario
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa lo que desea invertir: ");
        double inv = sc.nextDouble();
        return inv;
    }
    //metodo que calcula las ganancias
    public static double calculo(double x){
        //obtencion de las ganacias de intereses
        double y = x*0.05;
        //se suma la ganancia a lo invertido
        return y+x;
    }
    public static void main(String[] args) {
        //llamado a los métodos
        double inv = getInv();
        double res = calculo(inv);
        //muestra de resultados
        System.out.println("Su inversion con ganancias sera de: "+res);
    }
    
}
