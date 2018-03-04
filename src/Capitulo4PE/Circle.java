
package Capitulo4PE;

public class Circle {
	private double rad;
	private double area;
	private double diam;

	public void setRad(double r){
            this.rad = r;
	}

	public double getRad(){
            return rad;
	}

	public double getDiametro(){
            return rad * 2;
	}

	public double Area(){
            return ((rad*rad)*Math.PI);
	}
}
