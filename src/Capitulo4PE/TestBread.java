/*
Cree una clase para Tip Top Bakery llamada Bread con campos de datos para el tipo de pan 
(como "centeno") y calorías por porción. Incluya un constructor que tome parámetros para
cada campo e incluya los métodos de obtención que devuelven los valores de los campos. 
Incluya también una cadena estática final pública llamada MOTTO e iníciela en The staff 
of life. Escriba una aplicación llamada TestBread para instanciar tres objetos Bread con 
diferentes valores, y luego muestre todos los datos, incluido el lema, para cada objeto.
 */
package Capitulo4PE;

public class TestBread {

    public void ex() {
        Bread bread1 = new Bread();
        Bread bread2 = new Bread("centeno", 10);
        Bread bread3 = new Bread("integral", 20);
        
        System.out.println(Bread.MOTTO);
       
        System.out.println("Tipo pan: "+bread1.getBread());
        System.out.println("Calorias: "+bread1.getCals());
        System.out.println("Tipo pan: "+bread2.getBread());
        System.out.println("Calorias: "+bread2.getCals());
        System.out.println("Tipo pan: "+bread3.getBread());
        System.out.println("Calorias: "+bread3.getCals());
        
    }
    
}
