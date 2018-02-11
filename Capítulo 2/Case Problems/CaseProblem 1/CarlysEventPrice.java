/*
Capitulo 2:

CaseProblem 1.-
Carly's Catering ofrece comidas para fiestas y eventos especiales. Escriba un
programa que solicite al usuario la cantidad de invitados que asistirán a un 
evento y luego calcule el precio total, que es de $ 35 por persona. Muestre el
lema de la compañía con el borde que creó en la clase CarlysMotto2 en el 
Capítulo 1, y luego muestre el número de invitados, el precio por huésped y 
el precio total. También muestre un mensaje que indique verdadero o falso 
según si el trabajo está clasificado como un evento grande: un evento con 50 
o más invitados. Guarde el archivo como CarlysEventPrice.java.
 */
package capitulo2;

import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Entrada del dato
        System.out.println("Ingrese la cantidad de clientes: ");
        int cliente = entrada.nextInt();
        //Calculo del total
        int total = cliente *35;
        //Mensaje predeterminado del negocio
        System.out.println("************************************************");
        System.out.println("* Carly's makes the food that makes it a party *");
        System.out.println("************************************************");
        System.out.println("El numero de invitados es: "+cliente+
                "\nEl precio por huésped es: $35\nEl total a pagar es:"+
                total);
        //Condicional para saber si es o no un gran evento
        if(cliente>=50)
            System.out.println("Es un GRAN evento");
        else
            System.out.println("NO es un evento grande");
    }
}
