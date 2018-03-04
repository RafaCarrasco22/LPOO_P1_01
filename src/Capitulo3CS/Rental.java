/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3CS;

/**
 *
 * @author Rafael
 */
public class Rental {
    public static final Integer hm = 60;
    public static final Integer ren = 40;
    private String contrato;
    private Integer horaR;
    private Integer extra;
    private Integer price;
    
    public void setConNum(String contract) {
	contrato = contract;
    }
    public void setHoraM(Integer minutes) {
        horaR = minutes/60;
	extra = minutes%60;
        price = (minutes<60 && minutes >0) ? 40 : horaR*40+extra;
    }
    
    public String getConNum() {
        return contrato;
    }
    public Integer getRentalHours() {
        return horaR;
    }
    public Integer getExtramin() {
        return extra;
    }
    public Integer getPrice() {
        return price;
    }
    public String Messag() {
		return "Numero de contrato: " + contrato + "\nNumero de horas " + horaR
				+ "\nNumero de minutos " + extra +"\nPrecio por hora= $40"+ "\nPrecio total=" + price;
	}
}
