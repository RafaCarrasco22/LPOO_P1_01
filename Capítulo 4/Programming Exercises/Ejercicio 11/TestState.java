
package teststate;
import java.util.*;

public class TestState {

    public static void main(String[] args) {

        State st = new State();
        Scanner sc =  new Scanner (System.in);
        System.out.print("\nDatos del edo: \nNombre: ");
        String edo = sc.nextLine();
        st.setEst(edo);
        System.out.print("Poblacion: ");
        Integer p = sc.nextInt();
        st.setPob(p);
        sc.nextLine();
        System.out.print("\nDatos de la capital: \nNombre: ");
        String cap = sc.nextLine();
        System.out.print("Poblacion: ");
        Integer pob = sc.nextInt();
        st.s1(cap, pob);
        sc.nextLine();
        System.out.print("\nDatos de la ciudad mas poblada: \nnombre: ");
        String cmp = sc.nextLine();
        System.out.print("Poblacion: ");
        Integer cant = sc.nextInt();
        st.s2(cmp, cant);
        
        System.out.println("\nDatos del edo: \nNombre: "+st.getEst()+
                "\nPoblacion: "+st.getPob());
        System.out.println("\nDatos de la capital: \nNombre: " +st.getc1()+
                "\nPoblacion: "+st.getpc1());
        System.out.println("\nDatos de la ciudad mas poblada: \nNombre: " +st.getc2()+
                "\nPoblacion: "+st.getpc2());
        
    }
    
}
