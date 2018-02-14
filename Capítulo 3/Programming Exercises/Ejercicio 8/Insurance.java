/*
Capitulo 3.-

Ejercicio 8.-
La compañía de seguros de vida de Harrison Group calcula las primas de pólizas anuales 
en función de la edad que el cliente entrega en el año calendario actual. La prima se 
calcula tomando la década de la edad del cliente, añadiéndole 15 y multiplicándola por 20.
Por ejemplo, un hombre de 34 años pagaría $ 360, que se calcula sumando las décadas (3)
a 15, y luego, multiplique por 20. Escriba una aplicación que solicite al usuario el año
actual y el año de nacimiento. Pase ambos a un método que calcule y devuelva el monto de
la prima, y ​​luego muestre la cantidad devuelta. Guarde la aplicación como Insurance.java.
 */
package insurance;

import java.util.Scanner;


public class Insurance {
    //Calculo del pago de acuerdo a las condiciones dadas
    public static int pagoSeguro(int x,int y){
        int edad = y-x;
        int dec = edad/10;
        dec+=15;
        dec*=20;
        return dec;
    }
    
    public static void main(String[] args) {
        //Solicitud de los datos
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el anio nacimiento del cliente: ");
        Integer aN = sc.nextInt();
        System.out.print("Ingresa el anio actual: ");
        Integer aA = sc.nextInt();
        //Llamado al valor de retorno y muestra de resultados
        int a = pagoSeguro(aN,aA);
        System.out.println("Usted pagará: "+a);
    }
    
}
