/*
Capitulo 3.-

Ejercicio 7.-
Suponga que un galón de pintura cubre aproximadamente 350 pies cuadrados de espacio de pared. 
Cree una aplicación con un método main () que solicite al usuario la longitud, el ancho y 
la altura de una habitación rectangular. Pase estos tres valores a un método que haga lo siguiente:
Calcula el área de la pared de una habitación
Pasa el área de pared calculada a otro método que calcula y devuelve el
cantidad de galones de pintura necesarios
Muestra la cantidad de galones necesarios
Calcula el precio basado en un precio de pintura de $ 32 por galón, suponiendo que
el pintor puede comprar cualquier fracción de un galón de pintura al mismo precio que un
Galón entero
Devuelve el precio al método main ()
El método main () muestra el precio final. Por ejemplo, el costo de pintar un
La habitación de 15 por 20 pies con techos de 10 pies cuesta $ 64. 
 */
package Capitulo3PE;

import java.util.Scanner;


public class PaintCalculator {
    //Se calcula el area sumando las areas de las 4 paredes
    private static double calcularArea(double a, double b,double c){
        double pG,pC,area;
        pG=a*c;
        pC=b*c;
        area=(pG+pC)*2;
        return area;
    }
    //se calcula la cantidad de galones necesarios(redondeando)
    private static double galonesNec(double x){
        double cG=x/350;
        Math.ceil(cG);
        return cG;
    }
    
    public void ex() {
        //Solicitud de datos
        Scanner sc = new Scanner(System.in);
        double longitud,ancho,altura;
        System.out.print("Ingresa la longitud: ");
        longitud = sc.nextDouble();
        System.out.print("Ingresa el ancho: ");
        ancho = sc.nextDouble();
        System.out.print("Ingresa la altura: ");
        altura = sc.nextDouble();
        //Llamado a las otras funciones
        double area = calcularArea(longitud,ancho,altura);
        double gal = galonesNec(area);
        //calculo del precio
        double precio = gal*32;
        //Muestra de resultados
        System.out.println("El costo para pintar una habitación de "+longitud+
                " por "+ancho+" pies con altura de "+altura+" pies cuesta $"+precio);
        
        
    }
    
}