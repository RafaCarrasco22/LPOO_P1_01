
package testbread;

public class Bread {
    public final static String MOTTO = "The staff of life";
    
    private String tipoPan;
    private double cals;
    public Bread(){
        tipoPan = "Blanco";
        cals = 50;
    }
    public Bread(String newTipo, double newCals){
        this.tipoPan = newTipo;
        this.cals = newCals;
    }

    public String getBread(){
        return tipoPan;
    }
    public double getCals(){
        return cals;
    } 
}
