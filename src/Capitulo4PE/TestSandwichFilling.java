/*
Crea una clase llamada SandwichFilling. Incluya un campo para el tipo de relleno 
(como "ensalada de huevo") y otro para las calorías en una porción. Incluya un 
constructor que tome parámetros para cada campo e incluya los métodos de obtención 
que devuelven los valores de los campos. Escriba una aplicación llamada 
TestSandwichFilling para instanciar tres objetos SandwichFilling con diferentes 
valores, y luego muestre todos los datos para cada objeto.
 */
package Capitulo4PE;

public class TestSandwichFilling {

    public void ex() {
        SandwichFilling cecina= new SandwichFilling("Cecina",20);
	SandwichFilling tinga = new SandwichFilling("Tinga",75);
        SandwichFilling ensaladaHuevo = new SandwichFilling("Ensalada de huevo", 100);
		
	System.out.println(cecina.getTipo());
        System.out.println(cecina.getCalor()+"\n");
	
        System.out.println(tinga.getTipo());
	System.out.println(tinga.getCalor()+"\n");
		
        System.out.println(ensaladaHuevo.getTipo());
	System.out.println(ensaladaHuevo.getCalor()+"\n");
    }
    
}
