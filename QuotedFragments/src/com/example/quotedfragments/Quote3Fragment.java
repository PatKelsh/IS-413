package com.example.quotedfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Quote3Fragment extends Fragment{
	
	public Quote3Fragment(){
		System.out.println("Creating instance Quote 1");
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
		      Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.quote3,  container, false);
		return view;
	}


}
