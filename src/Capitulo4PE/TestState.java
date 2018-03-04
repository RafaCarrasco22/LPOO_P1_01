/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4PE;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class TestState {
    public void ex() {

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
