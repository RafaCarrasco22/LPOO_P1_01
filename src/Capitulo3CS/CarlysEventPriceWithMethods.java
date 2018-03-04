/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3CS;

import java.util.Scanner;

public class CarlysEventPriceWithMethods {

	public static int data() {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduzca cuantas personas asistiran: ");
		int invitados = in.nextInt();
		return invitados;
	}

        public static void Mensaje() {
            System.out.println("\n************************************************");
            System.out.println("* Carly's makes the food that makes it a party *");
            System.out.println("************************************************");		
	 }
	 
        public static void TrueFalse(int invitados) {
            boolean x; 		
                System.out.println("Cantidad de inviados: " +invitados);
		System.out.println("Precio por huesped  : $35");
		System.out.println("Precio total :   "+(invitados*35));
                if(invitados>=50)
                    x =true;
                else 
                    x= false;
			
                System.out.println("Este evento esta claficado como grande(T/F): "+x);
	 }
        
        
	public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("\nPersonas invitadas:  ");
            int invitados = in.nextInt();
            Mensaje();
            TrueFalse(invitados);
		
	}
    
}
