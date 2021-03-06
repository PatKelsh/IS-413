package com.is413.tempertureintents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 
 * @author Pat Kelsh and Geethika Mudunuri
 *
 */
public class DisplayActivity extends Activity {

	private Button fButton;
	private Button cButton;
	private TextView response;
	private EditText entry;

	public static final int FAHRENHEIT_TO_CELSIUS = 1;
	public static final int CELSIUS_TO_FAHRENHEIT = 2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display);

		fButton = (Button) findViewById(R.id.fButton);
		cButton = (Button) findViewById(R.id.cButton);
		response = (TextView) findViewById(R.id.response);
		entry = (EditText) findViewById(R.id.entry);

		fButton.setOnClickListener(new fListener());
		cButton.setOnClickListener(new cListener());
	}

	private class fListener implements OnClickListener {
		@Override
		public void onClick(View arg0) {
			
			Intent fIntent = new Intent(DisplayActivity.this,
					FahrenheitActivity.class);
			
			fIntent.putExtra("SUBMISSION",
					Double.parseDouble(entry.getText().toString()));
			
			startActivityForResult(fIntent, FAHRENHEIT_TO_CELSIUS);
		}
	}

	private class cListener implements OnClickListener {
		@Override
		public void onClick(View arg0) {
			Intent cIntent = new Intent(DisplayActivity.this,
					CelsiusActivity.class);
			cIntent.putExtra("SUBMISSION",
					Double.parseDouble(entry.getText().toString()));

			startActivityForResult(cIntent, CELSIUS_TO_FAHRENHEIT);
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int responseCode,
			Intent intent) {

		super.onActivityResult(requestCode, responseCode, intent);
		
		if (responseCode == 4) {
			Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
		} else if (responseCode == 3) {

			double returnedTemp = intent.getDoubleExtra("RESULT", -275);

			if (requestCode == FAHRENHEIT_TO_CELSIUS) {
				response.setText(entry.getText().toString() + " degrees Fahrenheit is " + returnedTemp
						+ " degrees Celsius");
			} else if (requestCode == CELSIUS_TO_FAHRENHEIT) {
				response.setText(entry.getText().toString() + " degrees Celsius is " + returnedTemp
						+ " degrees Fahrenheit");
			}
		}
	}
}
