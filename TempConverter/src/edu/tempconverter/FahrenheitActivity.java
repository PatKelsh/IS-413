package edu.tempconverter;

import temperature.Fahrenheit;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/**
 * 
 * @author Pat Kelsh & Geetheka Mudunuri
 *
 */
public class FahrenheitActivity extends Activity {
	
	private Button submit;
	private EditText input;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fahrenheit_activity);
		
		submit = (Button) findViewById(R.id.submit);
		input = (EditText) findViewById(R.id.entry);
		
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
			Fahrenheit fahr = new Fahrenheit(Integer.getInteger(temp));
			Log.i("Temp" , fahr.getTemp() + " goes to " + fahr.convertToCelsius());
		}
		
	}
	
	

}
