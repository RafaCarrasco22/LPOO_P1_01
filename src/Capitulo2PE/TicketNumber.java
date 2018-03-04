/*
Capitulo 2:

Ejercicio 12:
Travel Tickets Company vende boletos para aerolíneas, tours y otros servicios
relacionados con viajes. Debido a que los agentes de boletos frecuentemente 
malinterpretan los números de boletos largos, Travel Tickets le ha pedido 
que escriba una aplicación que indique entradas de números de boletos no 
válidos. La clase solicita a un agente de boletos ingresar un número de
ticket de seis dígitos. Los números de boletos están diseñados de modo que si
suelta el último dígito del número, entonces divida el número por 7, el resto
de la división será idéntico al último dígito caído. Este proceso se ilustra 
en el siguiente ejemplo:

**Ingrese el número del boleto; por ejemplo, 123454.
**Elimine el último dígito, dejando 12345.
**Determine el resto cuando el número de ticket se divide por 7. En este
  caso, 12345 dividido por 7 deja un resto de 4.
**Asigne el valor booleano de la comparación entre el resto y
  el dígito caído del número del boleto
** Muestre el resultado, verdadero o falso, en un cuadro de mensaje.
 */
package Capitulo2PE;

import javax.swing.JOptionPane;

public class TicketNumber {
    public void ex() {
        //Preguntar al usuario el número del ticket usando el cuadro JOptionPane
        String ticket = JOptionPane.showInputDialog(null, "Ingrese su número de ticket de seis dígitos: ");

        
        // Convertir ticketString en un tipo de datos entero
        int nTick = Integer.parseInt(ticket);
        //Divida el número de ticket entre 10 para eliminar el último dígito
        int bye = nTick/10;
        //Almacena dígitos eliminados en una variable
        int comp = nTick%10;
        //Uso de %7 para tener la otra variable a comparar
        int modTicket = bye%7;
        //Muestra de resultado dependiendo el resultado Booleano
        if(comp == modTicket)
            JOptionPane.showMessageDialog(null, "Número Válido");
        else
            JOptionPane.showMessageDialog(null, "Número NO Válido");
    }
}
