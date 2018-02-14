
package rentaldemo;

import java.util.Scanner;

public class RentalDemo {

private static Scanner scanner;
public static void main(String[] args) {
    Renta r1 = new Renta();
    Renta r2 = new Renta(NumCont(),tiempoRenta());
    
    Renta.samysMotto();
    calc(r1);
    calc(r2);
}
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
	public static void calc(Renta renta1) {
		System.out.println("\n\nNumero de contrato: "+renta1.getConNum());
		System.out.println("Cantidad de horas : " + renta1.getRentalHours());
		System.out.println("Cantidad de minutos : " + renta1.getExtramin());
		System.out.println("El precio total a pagar es: " + renta1.getPrice());
	}
	public static void samysMotto() {
		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("s Carly's makes the food that makes it a party S");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
	}
}