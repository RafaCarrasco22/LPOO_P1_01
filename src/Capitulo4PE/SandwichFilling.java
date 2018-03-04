
package Capitulo4PE;


public class SandwichFilling {
    private String tipo;
    private int cals;
	
    SandwichFilling(String sabor, int hots){
        this.tipo=sabor;
        this.cals=hots;
    }
	
    public String getTipo(){
	return tipo;
    }
    public int getCalor(){
	return cals;
    }
}
