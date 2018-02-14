/*
Cree una clase llamada BloodData que incluya campos que contengan un tipo de sangre 
(los cuatro tipos de sangre son O, A, B y AB) y un factor Rh (los factores son + y -). 
Cree un constructor predeterminado que establezca los campos en "O" y "+", y un 
constructor sobrecargado que requiera valores para ambos campos. Incluye los métodos 
get y set para cada campo. Guarde este archivo como BloodData.java. Cree una aplicación
llamada TestBloodData que demuestre que cada método funciona correctamente.
 */
package testblooddata;

public class BloodData {
    private String sangre;
    private String rh;

    
    BloodData() {
        sangre = "O";
	rh = "+";
    }
	
    BloodData(String tipoSangre, String factRH) {
        this.sangre = tipoSangre;
	this.rh = factRH;
    }
	
    public String getTipoSangre() {
        return sangre;
    }
	
    public void setTipoSangre(String tipo) {
        this.sangre = tipo;
    }
	
    public String getRh() {
	return this.rh;
    }
	
    public void setRh(String factor) {
	this.rh = factor;
    }
}
