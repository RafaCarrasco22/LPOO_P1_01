/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4PE;

/**
 *
 * @author Rafael
 */
public class TestSandwich {
    public void ex() {
        Sandwich s1 = new Sandwich("Blanco",100.10,"Cecina",80.3);	
        Sandwich s2 = new Sandwich("Integral", 110.98, "Milanesa", 10.5);	
        Sandwich s3 = new Sandwich("Horneado", 150.12, "Tasajo", 55.3);
        
       
	System.out.println("\nSandwich1\ntipo de pan: "+s1.getSBreadType());
        System.out.println("calorias por rebanada: "+s1.getCalXRe());
	System.out.println("tipo de relleno: "+s1.getSFillingType());
        System.out.println("calorias del relleno: "+s1.getSCalor());
	System.out.println("calorias totales: "+s1.totalCal());
       
        System.out.println("\nSandwich2\ntipo de pan: "+s2.getSBreadType());
	System.out.println("calorias por rebanada: "+s2.getCalXRe());
        System.out.println("tipo de relleno: "+s2.getSFillingType());
	System.out.println("calorias del relleno: "+s2.getSCalor());
        System.out.println("calorias totales: "+s2.totalCal());
	
	System.out.println("\nSandwich3\ntipo de pan: "+s3.getSBreadType());
        System.out.println("calorias por rebanada: "+s3.getCalXRe());
	System.out.println("tipo de relleno: "+s3.getSFillingType());
        System.out.println("calorias del relleno: "+s3.getSCalor());
	System.out.println("calorias totales: "+s3.totalCal());
    }
}
