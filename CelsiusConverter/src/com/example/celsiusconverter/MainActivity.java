package com.example.celsiusconverter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity{
	
	private Button submit;
	private EditText input;
	private TextView response;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		submit = (Button) findViewById(R.id.submit);
		input = (EditText) findViewById(R.id.entry);
		response = (TextView) findViewById(R.id.reponse);
		
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
			Celsius cel = new Celsius(Integer.parseInt(temp));
			Log.i("Temp" , cel.getTemp() + " goes to " + cel.convertToFahrenhiet());
			response.setText(cel.convertToFahrenhiet() + " F");
		}
		
	}
	
	protected void onResume(){
		super.onResume();
	}
	
	protected void onPause(){
		super.onPause();
	}

	protected void onStop(){
		super.onStop();
	}
	
	protected void onDestory(){
		super.onDestroy();
	}
}

