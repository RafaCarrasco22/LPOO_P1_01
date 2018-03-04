
package Capitulo4PE;


public class TestPatient {

    public void ex() {
        Patient p1 = new Patient();
        Patient p2 = new Patient("123456789", 10, "AB", "+");
		
	System.out.println("\nPaciente 1\nID: " + p1.getIdNum());
	System.out.println("Edad: " + p1.getAge());
        System.out.println("Tipo Sangre: " + p1.getBloodData().getTipoSangre());
	System.out.println("Rh: " + p1.getBloodData().getRh());
		
        System.out.println("\nPaciente2\nID: " + p2.getIdNum());
	System.out.println("Edad: " + p2.getAge());
        System.out.println("Tipo Sangre: " + p2.getBloodData().getTipoSangre());
        System.out.println("Rh: " + p2.getBloodData().getRh());
    }
    
}
