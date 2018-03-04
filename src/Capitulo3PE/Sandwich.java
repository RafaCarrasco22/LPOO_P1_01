/*
Capitulo 3.-

Ejercicio 11.-
a)Crea una clase llamada Sandwich. Los campos de datos incluyen una Cadena para el 
ingrediente principal (como "atún"), una Cadena para el tipo de pan (como "trigo") 
y un doble para el precio (como 4.99). Incluye métodos para obtener y establecer 
valores para cada uno de estos campos. Guarde la clase como Sandwich.java.
 */
package Capitulo3PE;

public class Sandwich {
    public String ingPrincipal;
    public String tipoPan;
    public double price;
    
    public void setIngPr(String ingPrincipal){
        this.ingPrincipal = ingPrincipal;
    }
    public String getIntPr(){
        return ingPrincipal;
    }
    public void setTipoPan(String tipoPan){
        this.tipoPan = tipoPan;
    }
    public String getTipoPan(){
        return tipoPan;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    
}
