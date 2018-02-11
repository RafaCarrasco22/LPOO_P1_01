/*
Capitulo 2:

CaseProblem 2.-Escriba un programa que le indique al usuario la cantidad de minutos
que alquiló una pieza de equipo deportivo. Calcule el costo del alquiler en $ 40 por
hora más $ 1 por minuto adicional. (Es posible que haya pensado ya que esta tasa tiene
un error lógico, pero por ahora, calcule las tasas como se describe aquí. Puede 
solucionar el problema después de leer el capítulo sobre toma de decisiones.) 
Muestre el lema de Sammy con el borde que creó en el Clase SammysMotto2 en el 
Capítulo 1. A continuación, muestra las horas, los minutos y el precio total.
 */
package capitulo2;

import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
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
