
package sammysrentalpricewithmethods;

import java.util.Scanner;

public class SammysRentalPriceWithMethods {
    public static int min() {
        Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese la cantidad de minutos que uso el equipo  :");
        Integer minutos = sc.nextInt();
        return minutos;
    }

    public static void Motto() {
	System.out.println("\nSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("s Sammy's makes it fun in the sun  S");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n");
    }
    
    public static void TrueFalse(Integer mm) {
        Integer h =(int) (mm/60);
	Integer mRes = (mm%60);
        final Integer costoAlquiler = 40;
	int cosTo = (h*costoAlquiler) + mRes;
        System.out.println("Se ocupa el equipo por la siguiente cantidad de  Horas: "+ h +" minutos: "+ mRes);
	System.out.println("Costo Total: "+ cosTo);
    }
	
    public void estanciaRentalDemo() {
        SammysRentalPriceWithMethods objectoo = new SammysRentalPriceWithMethods();
	objectoo.Motto();
    }
    public static void main(String[] args) {
        Integer mm = min();
	Motto();
	TrueFalse(mm);
    }
    
}
