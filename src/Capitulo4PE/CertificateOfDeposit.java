/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4PE;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Rafael
 */
public class CertificateOfDeposit {
    private String numCerti;
    private String apellido;
    private double saldo;
    private Integer dia, mes, anio;
    private GregorianCalendar date = new GregorianCalendar();
    
    public CertificateOfDeposit(){
        numCerti = "";
        apellido ="";
        saldo =0;
        this.date = date;
    }
    public void aumentar(){
        //String res = null;
        date.add(GregorianCalendar.MONTH, 12);
    }
    public void setfecha(Integer yy, Integer mm, Integer dd){
        date.set(yy, mm, dd);
    }
    public Date getFecha(){
        return date.getTime();
    }
    public void setNumeroC(String num){
        this.numCerti = num;
    }
    public void setapellido (String ape){
        this.apellido = ape;
    }
    public void setsaldo (double sal){
        this.saldo = sal;
    }
    public String getNumeroC(){
        return this.numCerti;
    }
    public String getApellido(){
        return this.apellido;
    }
    public double getSaldo(){
        return this.saldo;
    } 
}
