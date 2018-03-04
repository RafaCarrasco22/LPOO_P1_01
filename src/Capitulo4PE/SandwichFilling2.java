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
public class SandwichFilling2 {
    private String FillingType;
	private Double calories;
	public SandwichFilling2(String type, Double calories) {
		FillingType = type;
		this.calories = calories;
	}
	public String getFillingType() {
		return FillingType;
	}
	public Double getCalories() {
		return calories;
	}
}
