/*
Capitulo 1:

Ejercicio 12.- De 1925 a 1963, aparecieron carteles publicitarios de Burma Shave junto a las autopistas
en todos los Estados Unidos. Siempre hubo cuatro o cinco carteles seguidos que contenían
piezas de una rima, seguido de un signo final que decía "Burma Shave". Por ejemplo, uno
un conjunto de signos que ha sido preservado por la Institución Smithsonian dice lo siguiente:
Shaving brushes
You'll soon see 'em
On a shelf
In some museum
Burma Shave
Escribir, compilar y probar una clase que produce una serie de cuatro cuadros 
de diálogo para que cada uno muestre una línea de Burma Shave
lema a su vez. Guarde la clase como BurmaShave.java. 
 */
package capitulo1;

import javax.swing.JOptionPane;

public class BurmaShave {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "We know");
        JOptionPane.showMessageDialog(null, "How much");
	JOptionPane.showMessageDialog(null, "You love that gal");
        JOptionPane.showMessageDialog(null, "But use both hands for driving, pal");
	JOptionPane.showMessageDialog(null, "Burma-Shave");
    }
}
