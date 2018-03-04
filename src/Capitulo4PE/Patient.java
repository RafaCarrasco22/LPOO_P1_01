package Capitulo4PE;


public class Patient {
    private String idNum;
    private int edad;
    private BloodData data;
	
    Patient() {
        idNum = "0";
	edad = 0;
	data = new BloodData();
    }
	
    Patient(String id, int ed, String tipoSangre, String rh) {
        this.idNum = id;
	this.edad = ed;
	this.data = new BloodData(tipoSangre, rh);
    }
	
    public String getIdNum() {
        return this.idNum;
    }
	
    public int getAge() {
	return this.edad;
    }
	
    public BloodData getBloodData() {
	return this.data;
    }
}
