/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3PE;

public class Student2 {
    private double promedio;
    private int id, cred,punto;
    //Constructor solicitado
    public Student2() {
    id = 9999;
    punto = 12;
    cred = 3;
}

    public void setId(int id){
        this.id = id;
    }
    public Integer getId(){
        return id;
    }
    public void setCred(int cred){
        this.cred = cred;
    }
    public Integer getCred(){
        return cred;
    }
    public void setPuntos(int punto){
        this.punto = punto;
    }
    public Integer getPuntos(){
        return punto;
    }
    public double promedio(){
        return promedio = punto/cred;
    }
}
