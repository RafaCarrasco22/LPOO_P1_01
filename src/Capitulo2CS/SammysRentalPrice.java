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
public class SammysRentalPrice {


    public void ejecuta() {
        Scanner entrada = new Scanner(System.in);
        //Entrada del dato
        System.out.println("Ingrese la cantidad de minutos de renta: ");
        int renta = entrada.nextInt();
        //variables para calculo de minutos y horas
        int hora,aux;
        aux=renta;
        //se calcula en numero de horas
        hora=renta/60;
        //con el modulo obtenemos los minutos
        renta%=60;
        //se calcula el precio (1h=40 y por cada minuto es $1 extra) 
        int total=(hora*40)+renta;
        //Muestra de resultado
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("s Sammy's makes it fun in the sun  S");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("\nLas horas que de renta son: "+hora+
                "\nLos minutos de renta extra son: "+renta+
                "\nUsted pagará: $"+total);
        
    }    
}