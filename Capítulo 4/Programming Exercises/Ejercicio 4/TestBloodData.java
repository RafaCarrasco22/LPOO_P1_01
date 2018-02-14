/*
Cree una clase llamada Patient que incluya un número de ID, edad y BloodData. Proporcione
un constructor predeterminado que establezca el número de ID en "0", la edad en 0 y BloodData
en "O" y "+". Cree un constructor sobrecargado que proporcione valores para cada campo. 
También proporcione métodos de obtención para cada campo. Guarde el archivo como Patient.java
Cree una aplicación llamada TestPatient que demuestre que cada método funciona correctamente 
y guárdelo como TestPatient.java.
 */
package testblooddata;

import java.util.Scanner;


public class TestBloodData {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        BloodData ex1 = new BloodData();
	BloodData ex2 = new BloodData();
        BloodData ex3 = new BloodData("B", "+");

		
        System.out.print("Ingresa el tipo de sangre: ");
	ex1.setTipoSangre(sc.next());
        System.out.print("Ingresa el factor RH: ");
	ex1.setRh(sc.next());
        System.out.println();
				
	// muestra de resultados
        System.out.println("Examen 1\nTipo Sangre: " + ex1.getTipoSangre());
	System.out.println("Rh: " + ex1.getRh());
	System.out.println();
		
	System.out.println("Examen 2\nTipo Sangre: " + ex2.getTipoSangre());
	System.out.println("Rh: " + ex2.getRh());
	System.out.println();
		
	System.out.println("Examen 3\nTipo Sangre: " + ex3.getTipoSangre());
	System.out.println("Rh: " + ex3.getRh());
    }
    
}
