/*
 Capitulo 3.-

Ejercicio 12.-
c)
Crea un constructor para la clase de Estudiante que creaste. El constructor debe 
inicializar el número de ID de cada estudiante en 9999, sus puntos obtenidos en 12 
y las horas de crédito en 3 (lo que resulta en un promedio de calificaciones de 4.0).
Escriba un programa que demuestre que el constructor funciona instanciando un objeto
y mostrando los valores iniciales. Guarde la aplicación como ShowStudent2.java.
 */
package showstudent2;

public class ShowStudent2 {

    public static void main(String[] args) {
        Student2 estudiante = new Student2();
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
