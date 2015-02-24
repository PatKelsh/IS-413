package com.example.fahrenheitactivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * 
 * @author Pat Kelsh & Geetheka Mudunuri
 *
 */
public class FahrenheitActivity extends Activity {
	
	private Button submit;
	private EditText input;
	private TextView response;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fahrenheit);
		
		submit = (Button) findViewById(R.id.submit);
		input = (EditText) findViewById(R.id.entry);
		response = (TextView) findViewById(R.id.reponse);
		
		submit.setOnClickListener(new TempConverter());
	}
	
	@Override
	protected void onStart(){
		super.onStart();
	}
	
	private class TempConverter implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			String temp = input.getText().toString();
			Log.i("Test", temp);
			Fahrenheit fahr = new Fahrenheit(Integer.parseInt(temp));
			Log.i("Temp" , fahr.getTemp() + " goes to " + fahr.convertToCelsius());
			response.setText(fahr.convertToCelsius() + " C");
		}
		
	}
	
	

}