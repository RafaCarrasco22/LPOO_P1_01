/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4PE;

/**
 *
 * @author Rafael
 */
public class Sandwich {
    private Bread2 bread;
    private SandwichFilling2 filling;
	
    public Sandwich(String breadType, Double breadSliceCalories, String fillingType, Double fillingCalories) {
	bread = new Bread2(breadType, breadSliceCalories);
	filling = new SandwichFilling2(fillingType, fillingCalories);
    }
    public String getSFillingType() {	
        return filling.getFillingType();
    }
    public Double getSCalor() {
	return filling.getCalories();
    }
    public String getSBreadType() {
	return bread.getBreadType();
    }
    public Double getCalXRe() {
        return bread.getCaloriesPerSlice();
    }
    public Double totalCal() {
	return filling.getCalories()+bread.getCaloriesPerSlice()*2;
    }
}
