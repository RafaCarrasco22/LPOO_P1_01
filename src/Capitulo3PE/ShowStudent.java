/*
Capitulo 3.-

Ejercicio 12.-
b)
Escriba una clase llamada ShowStudent que crea una instancia de un objeto Student 
de la clase que creó y asigne valores a sus campos. Calcule el promedio de 
calificaciones del alumno y luego muestre todos los valores asociados con el alumno.
Guarde la aplicación como ShowStudent.java.
 */
package Capitulo3PE;

public class ShowStudent {

    public void ex() {
        Student estudiante = new Student();
        estudiante.setId(442698);
        estudiante.setCred(4);
	estudiante.setPuntos(12);
        
        Integer id = estudiante.getId();
	Integer cred = estudiante.getCred();
        Integer puntikos = estudiante.getPuntos();
	double promFinal = estudiante.promedio();
        
        System.out.println("ID: " + id);
        System.out.println("Creditos: " + cred);
	System.out.println("Puntos: " + puntikos);
        System.out.println("Promedio: " + promFinal);
    }
    
}
