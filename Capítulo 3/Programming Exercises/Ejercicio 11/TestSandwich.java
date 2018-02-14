/*
Capitulo 3.-

Ejercicio 11.-
b)
Cree una aplicación llamada TestSandwich que crea una instancia de un objeto Sandwich 
y demuestra el uso de los métodos set y get. Guarde esta aplicación como TestSandwich.java.
 */
package testsandwich;


public class TestSandwich {

    public static void main(String[] args) {
        Sandwich bbSandwich = new Sandwich();
        bbSandwich.setIngPr("Atun");
        bbSandwich.setTipoPan("Trigo");
        bbSandwich.setPrice(4.99);
        System.out.println("El ingrediente principal es: "+bbSandwich.getIntPr()+
                "\nEl tipo de pan es: "+bbSandwich.getTipoPan()+
                "\nEl precio es: "+bbSandwich.getPrice());
        
        
        
    }
    
}
