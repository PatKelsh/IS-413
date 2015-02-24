package edu.tempconverter;

import temperature.Celsius;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CalsiusActivity extends Activity{
	
	private Button submit;
	private EditText input;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.celsius_activity);
		
		submit.setOnClickListener(new TempListener());
	}
	
	protected void onStart(){
		super.onStart();
	}
	
	private class TempListener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			String temp = input.getText().toString();
			Celsius cel = new Celsius(Integer.getInteger(temp));
			Log.i("Temp" , cel.getTemp() + " goes to " + cel.convertToFahrenhiet());
		}
		
	}

}
