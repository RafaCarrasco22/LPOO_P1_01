
package Capitulo2PE;

public class MilesToFeet {
    public void ex() {
        //Declaracion y asignacion de variables
        int milleToFeet=5280;
        float distance=8.5f;
        float distanceFinal;
        
        //Se multiplica milleToFeet*float para convertirlo en float
        distanceFinal= distance*(float)milleToFeet;
        
        //Impresión de resultados
        System.out.println("La distancia entre la casa de mi tio y la mia es de "+distance+" millas o "+distanceFinal +"pies ");
    }
    
}
