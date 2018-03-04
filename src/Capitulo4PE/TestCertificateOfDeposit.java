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
public class TestCertificateOfDeposit {
    public void ex() {
        Scanner sc =  new Scanner (System.in);
       CertificateOfDeposit dep = new CertificateOfDeposit();
      
       System.out.print("Num. certificado: ");
       String num = sc.nextLine();
       dep.setNumeroC(num);
       System.out.print("Apellido del titular: ");
       String ape = sc.nextLine();
       dep.setapellido(ape);
       System.out.print("saldo de la cuenta: ");
       double saldo = sc.nextDouble();
       dep.setsaldo(saldo);
       
       System.out.print("FECHA\ndia:");
       int dia = sc.nextInt();
       System.out.print("Mes: ");
       int mes  = sc.nextInt();
       System.out.print("Anio: ");
       int anio = sc.nextInt();
       
       dep.setfecha(anio, (mes-1), dia);
       
       System.out.println("La informacion es la siguiente:");
       System.out.println("Numero: "+dep.getNumeroC());
       System.out.println("Apellido: "+ dep.getApellido());
       System.out.println("Saldo: "+ dep.getSaldo());
       System.out.println("Fecha de Apertura: "+dep.getFecha());
       dep.aumentar();
       System.out.println("Fecha de Vencimiento: "+dep.getFecha());
       
    }
}
