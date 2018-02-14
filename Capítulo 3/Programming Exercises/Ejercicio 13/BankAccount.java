/*

Cree una clase llamada BankAccount con campos que contengan un número de cuenta, el nombre 
del propietario y el saldo de la cuenta. Incluya un constructor que inicialice cada campo a
los valores predeterminados apropiados. También incluya métodos para obtener y establecer 
cada uno de los campos. Incluya un método llamado deductMonthlyFee () que reduce el saldo en
$ 4.00. Incluya un método estático llamado explainAccountPolicy () que explique que la 
tarifa de servicio de $ 4 se deducirá cada mes. Guarde la clase como BankAccount.java.
 */
package testbankaccount;

public class BankAccount {
    private int nCuen;
    private String name;
    private double sald;
    
    BankAccount() {
        nCuen = 1440434;
	name = "Rafael Carrasco";
        sald = 500.00;
    }
		
    public int getNumC() {
        return nCuen;
    }
	
    public void setNumC(int num) {
        nCuen = num;
    }
	
    public String getName() {
        return name;
    }
	
    public void setName(String Name) {
        name = Name;
    }
	
    public double getSaldo() {
        return sald;
    }
	
    public void setSaldo(double saldo) {
        sald = saldo;
    }
	
    public double deductMonthlyFee() {
        double newSal;
		
        newSal = getSaldo() - 4.00;
        return newSal;
    }

}
