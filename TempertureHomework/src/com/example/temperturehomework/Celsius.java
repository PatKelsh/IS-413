package com.example.temperturehomework;

/**
 * 
 * @author Pat Kelsh & Geethika Mudunuri
 *
 */
public class Celsius {

	private float temp;
	
	public Celsius(String temp){
		this.temp = Float.parseFloat(temp);
	}
	
	/**
	 * 
	 * @return the conversion
	 */
	public float convert(){
		float fahrenheit = (float)(((9.0/5.0) * temp) + 32.0);
		return fahrenheit;
	}
}
	