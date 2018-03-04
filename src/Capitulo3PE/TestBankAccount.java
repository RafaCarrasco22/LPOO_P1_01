/*
Capitulo 3
EJ 1.-Cree una clase llamada TestBankAccount cuyo método main () declara cuatro objetos 
BankAccount. Llame a un método getData () tres veces. Dentro del método, solicite a un 
usuario los valores de cada campo para una Cuenta bancaria, y devuelva un objeto Cuenta 
bancaria al método principal () donde está asignado a uno de los objetos de cuenta bancaria 
de main (). No solicite al usuario los valores para el cuarto objeto de Cuenta bancaria, 
pero deje que continúe manteniendo los valores predeterminados. Luego, en main (), 
pase cada objeto BankAccount a su vez a un método showValues ​​() que muestra los datos, 
llama al método que deduce la tarifa mensual y muestra el saldo nuevamente. El método 
showValues ​​() también llama al método que explica la política de deducción.
 */
package Capitulo3PE;

import java.util.Scanner;


public class TestBankAccount {
    
    public void ex() {
        
   
        BankAccount cuenta1 = new BankAccount();
	BankAccount cuenta2 = new BankAccount();
        BankAccount cuenta3 = new BankAccount();
	BankAccount cuenta4 = new BankAccount();
        getData(cuenta1);
	getData(cuenta2);
        getData(cuenta3);
	showValues(cuenta1);
        showValues(cuenta2);
	showValues(cuenta3);
        showValues(cuenta4);
    }
	
    public static BankAccount getData(BankAccount cuenta) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("\nNumero de cuenta: ");
	cuenta.setNumC(sc.nextInt());
        //System.out.print("Nombre: ");
	//cuenta.setName(sc.next());
        System.out.print("Saldo: ");
	cuenta.setSaldo(sc.nextInt());
	
        return cuenta;
    }
	
    public static BankAccount showValues(BankAccount cuenta) {
	System.out.println("\n\nNumero de cuenta: " + cuenta.getNumC());
        System.out.println("Nombre: " + cuenta.getName());
	System.out.println("Saldo: $" + cuenta.getSaldo());
		
	cuenta.setSaldo(cuenta.deductMonthlyFee());
	System.out.println("---Nuevo saldo: $" + cuenta.getSaldo());
        System.out.println();
	return cuenta;
    }
}
