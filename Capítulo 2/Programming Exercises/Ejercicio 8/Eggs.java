/*
Capitulo 2:

Ejercicio 8:

Meadowdale Dairy Farm vende huevos marrones orgánicos a los clientes locales. 
Cobran $ 3.25 por una docena de huevos, o 45 centavos por huevos individuales 
que no son parte de una docena. Escriba una clase que le solicite al usuario 
el número de huevos en el pedido y luego muestre la cantidad adeudada con una 
explicación completa. Por ejemplo, la salida típica podría ser, 
"ordenó 27 huevos. Eso es 2 docenas a $ 3.25 por docena y 3 huevos sueltos 
a 45.0 centavos cada uno por un total de $ 7.85. 
"Guarde la clase como Eggs.java.
 */
package capitulo2;

import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        //Declaracion de cantidad de huevos
        int eggs;
        Scanner entrada = new Scanner(System.in);
        
        //Solicitud de la cantidad de huevos
        System.out.print("Dame la cantidad de huevos: ");
        eggs = entrada.nextInt();        
        
        //Variables para obtener la cantidad de docenas y sueltos
        int docena;
        int suelto;
        //Aplicacion de las respectivas operaciones
        docena = eggs/12;
        suelto= eggs%12;
        //Calculo del total a pagar
        float total;
        total=(docena*3.25f)+(suelto*0.45f);
        
        //Muestra de resultados
        System.out.println("Usted pidio "+eggs+" huevos/n"+
                "Eso es: "+docena+" a $3.25 y "+suelto+
                " huevo(s) suelto(s) a $.45 que hacen un total de $"+total);
        
    }
}
