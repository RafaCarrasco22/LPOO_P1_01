/*
Crea una clase llamada TestPainting cuyo método main () declara tres elementos de pintura. 
Cree un método que solicite al usuario y acepte valores para dos de los objetos de Pintura, 
y deje el tercero con los valores predeterminados proporcionados por el constructor. A 
continuación, muestre cada objeto completado. Finalmente, muestre un mensaje que explique 
la tasa de comisión de la galería. Guarde la aplicación como TestPainting.java.
 */
package Capitulo3PE;

public class TestPainting {

    public void ex() {
        Painting p1 = new Painting("", "", "", 0.0);
	Painting p2 = new Painting("", "", "", 0.0);
        Painting p3 = new Painting("La creación de Adán", "Miguel Angel", "fresco",1000);

        p1.getEntrada(p1);
	p2.getEntrada(p2);

	p1.salida();
        p2.salida();
	p3.salida();
    }
    
}
