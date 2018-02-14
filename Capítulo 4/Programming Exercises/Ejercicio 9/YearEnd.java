
package yearend;

import java.util.GregorianCalendar;

public class YearEnd {

    public static void main(String[] args) {
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
