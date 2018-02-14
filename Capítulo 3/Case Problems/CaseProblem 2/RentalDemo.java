/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentaldemo;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class RentalDemo {
private static Scanner scanner;
    	public static Integer tiempoRenta() {
		scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero de minutos que rento el equipo deportivo: ");

		Integer minutes = scanner.nextInt();
		return minutes;
	}
        public static String NumCont() {
		scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero de contrato: ");
		String number = scanner.nextLine();
		return number;
	}
    public static void main(String[] args) {
        Integer tr = tiempoRenta();
        String contractN = NumCont();
        
        Rental help = new Rental();
        help.setConNum(contractN);
        help.setHoraM(tr);
        samysMotto();
        System.out.println(help.Messag());
        
    }
    public static void samysMotto() {
	System.out.println("\nSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("s Sammy's makes it fun in the sun  S");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n");	
	}
    
}
