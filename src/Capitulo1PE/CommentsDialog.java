/*
Capitulo 1:

Ejercicio 11.- Modifique el programa Comments.java en el ejercicio 10 
para que la declaración sobre comentarios se muestra en un cuadro de diálogo. 
 */
package Capitulo1PE;

import javax.swing.JOptionPane;

public class CommentsDialog {
    public void ejecuta() {
        JOptionPane.showMessageDialog(null,"Program comments are nonexecuting statements you add to a "
                + "file for the purpose of\n" +
                "documentation.");
    }
}
