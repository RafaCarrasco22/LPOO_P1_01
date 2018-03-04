/*
Crea una clase llamada TestCircle cuyo método main () declara varios objetos Circle. 
Usando el método setRadius (), asigne un círculo a un valor de radio pequeño, y asigne
otro valor de radio más grande. No asigne un valor al radio del tercer círculo; en 
cambio, retenga el valor asignado en la construcción. Muestra todos los valores para 
todos los objetos Circle. Guarde la aplicación como TestCircle.java.
 */
package Capitulo4PE;

public class TestCircle {

    public void ex() {
        Circle a = new Circle();
	Circle b = new Circle();

        a.setRad(10);
	b.setRad(20);

        System.out.println("El area es "+ a.Area());
	System.out.println("El diametro es "+ a.getDiametro());

	System.out.println("El area es "+ b.Area());
	System.out.println("El diametro es "+ b.getDiametro());
    }
    
}
