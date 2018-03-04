/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4PE;

import java.util.GregorianCalendar;

/**
 *
 * @author Rafael
 */
public class YearEnd {
    public void ex() {
        GregorianCalendar a = new GregorianCalendar();
        GregorianCalendar b = new GregorianCalendar();
        b.add(GregorianCalendar.YEAR, 1);
        int dia = b.get(GregorianCalendar.DAY_OF_YEAR);
        b.add(GregorianCalendar.DATE, -dia);
       
        long dif = b.getTimeInMillis() - a.getTimeInMillis();
        dif /=(1000*60*60*24);
        System.out.println(dif);
    }
}
