/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsandwich;

public class Bread {
	private String breadType;
	private Double caloriesPerSlice;
	public static final String MOTTO = "The staff of life";
	public Bread(String type, Double calories) {
		breadType = type;
		caloriesPerSlice = calories;
		
	}
	
	public String getBreadType() {
		return breadType;
	}
	public Double getCaloriesPerSlice() {
		return caloriesPerSlice;
	}

}