package com.example.temperturehomework;

/**
 * 
 * @author Pat Kelsh & Geethika Mudunuri
 *
 */
public class Fahrenheit {
	
	private float temp;
	
	public Fahrenheit(String temp){
		this.temp = Float.parseFloat(temp);
	}
	
	public float convert(){
		float celsius = (float)((5.0/9.0) * (temp - 32.0));		
		return celsius;
	}

}
