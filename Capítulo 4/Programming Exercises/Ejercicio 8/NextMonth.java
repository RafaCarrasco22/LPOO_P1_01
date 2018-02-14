
package nextmonth;
import java.util.GregorianCalendar;
public class NextMonth {

    public static void main(String[] args) {
        GregorianCalendar a = new GregorianCalendar();
        GregorianCalendar b = new GregorianCalendar();
        b.add(GregorianCalendar.MONTH, 1);
        int dia = b.get(GregorianCalendar.DAY_OF_MONTH);
        b.add(GregorianCalendar.DATE, -dia);
       
        long dif = b.getTimeInMillis() - a.getTimeInMillis();
        dif /= (1000*60*60*24);
        
        System.out.println(dif);
                
    }
    
}
