package com.example.temperaturehw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	private TextView text;
	private Button submitButton;
	private Button switchButton;
	private EditText input;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		text = (TextView)findViewById(R.id.ANSWER);
		submitButton = (Button)findViewById(R.id.button1);
		switchButton = (Button)findViewById(R.id.button2);
		input = (EditText)findViewById(R.id.editText1);
		
		submitButton.setOnClickListener(this);
		switchButton.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {

		switch(v.getId()){
			case R.id.button1: {
				String new_input = input.getText().toString();
				Celsius c = new Celsius(new_input);
				text.setText("The inputed Celsius temp was: " + new_input + "\nThe converted Fahrenheit temp is: " + c.convert());
				break;
			}
			
			case R.id.button2: {
				Intent myIntent = new Intent(MainActivity.this, OtherActivity.class); 
				startActivity(myIntent);
				break;
			}
			
			default: {
				text.setText("No matching event Id. \nEvent Id called :" + v.getId());
				break;
			}
		}
	}
}

