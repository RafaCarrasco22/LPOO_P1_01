/*
Capitulo 3.-

Ejercicio 12.-
a)
Crea una clase llamada Estudiante. Un alumno tiene campos para un número de identificación, 
número de horas de crédito obtenidas y número de puntos ganados. (Por ejemplo, muchas 
escuelas calculan promedios basados ​​en una escala de 4, por lo que una clase de tres 
créditos por hora en la que un alumno obtiene una A vale 12 puntos). Incluye métodos para 
asignar valores a todos los campos. Un estudiante también tiene un campo para el promedio 
de calificaciones. Incluya un método para calcular el campo promedio del punto de calificación 
dividiendo puntos por horas de crédito obtenidas. Escriba métodos para mostrar los valores en 
cada campo del Estudiante. Guarde esta clase como Student.java.
 */
package showstudent;

public class Student {
    private double promedio;
    private int id, cred,punto;
    
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
