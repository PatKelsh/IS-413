package com.is413.tempertureintents;

import temperature.Celsius;
import temperature.Fahrenheit;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * 
 * @author Pat Kelsh and Geethika Mudunuri
 * 
 */
public class CelsiusActivity extends Activity {

	private Button submitButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		submitButton = (Button) findViewById(R.id.fButton);

		Intent intent = getIntent();
		try {
			Double result = new Celsius(intent.getDoubleExtra("SUBMISSION",
					-274)).convertToFahrenhiet();

			intent.putExtra("RESULT", result.doubleValue());

			setResult(3, intent);
		} catch (Exception e) {
			setResult(4, intent);
		}
		finish();

	}
}
