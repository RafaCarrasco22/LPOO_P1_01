/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo2CS;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class CarlysEventPrice {
    public void ejecuta() {
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
 

