/*
Cree una clase llamada Pintura que contenga campos para el título de una pintura, artista,
medio (como el color del agua), precio y comisión de la galería. Cree un constructor que 
inicialice cada campo a un valor predeterminado apropiado y cree métodos de instancia que 
obtengan y establezcan los campos para título, artista, medio y precio. El campo de comisión 
de la galería no se puede establecer desde fuera de la clase; se calcula como el 20 por ciento 
del precio cada vez que se establece el precio. Guarde la clase como Painting.java.
 */
package testpainting;


import java.util.Scanner;

public class Painting {
    String tit, art, medio;
    double price, com;

    public Painting(String title, String artist, String med, double price) {
        this.tit = title;
	this.art = artist;
        this.medio = med;
	this.price = price;
    }

    public void setTit(String title) {
        this.tit = title;
    }

    public void setArtist(String artist) {
        this.art = artist;
    }

    public void setMedio(String medium) {
        this.medio = medium;
    }
    
    public void setPrecio(double price) {
        this.price = price;
    }

    public String getTit() {
        return this.tit;
    }

    public String getArt() {
	return this.art;
    }
    
    public String getMed() {
        return this.medio;
    }

    public double getPrice() {
        return this.price;
    }

    // calculando el 20% comision
    public double calcCommission() {
        this.com = this.price * 0.2;
        return this.com;
    }

    public void getEntrada(Painting paint) {
        Scanner input = new Scanner(System.in);
        System.out.print("\n\nTitulo: ");
        this.tit = input.nextLine();
        System.out.print("Artista: ");
        this.art = input.nextLine();
        System.out.print("Medio: ");
        this.medio = input.nextLine();
        System.out.print("Valor: ");
        this.price = input.nextDouble();
	}

	// muestra de la informacion
    public void salida() {
        double com = calcCommission();
        System.out.print("\n\nTitulo: "+this.tit+"\nArtista: "+this.art+"\nMedio: "+this.medio+"\nPrecio:"+
                +this.price+"\nComision: "+com+"\n");
	}
}
