/*
Capitulo 1:

Ejercicio 10.- Escribir, compilar y probar una clase que usa la ventana de comando para mostrar el
siguiente declaración sobre los comentarios:
“Program comments are nonexecuting statements you add to a file for the purpose of
documentation.”
También incluya la misma declaración en tres comentarios diferentes en la clase; cada
comentario debe usar uno de los tres métodos diferentes de incluir comentarios en
una clase de Java. Guarde la clase como Comments.java.
 */
package capitulo1;

public class Comments {
    public static void main(String[] args) {
        System.out.println("“Program comments are nonexecuting statements you add to a file for the purpose of\n" +
                "documentation.”");
        
        //“Program comments are nonexecuting statements you add to a file for the purpose of 
        // documentation.”
        
        /*“Program comments are nonexecuting statements you add to a file for the purpose of
           documentation.”*/
        
        /**
         * “Program comments are nonexecuting statements you add to a file for the purpose of
         *  documentation.”
         */
    }
}
