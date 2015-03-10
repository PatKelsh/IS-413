package com.is413.tempertureintents;

import temperature.Fahrenheit;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FahrenheitActivity extends Activity {

	private Button submitButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_fahrenheit);

		Log.d("activity", "in activity");

		submitButton = (Button) findViewById(R.id.fButton);

		Intent intent = getIntent();
		try {
			Double result = new Fahrenheit(intent.getDoubleExtra("SUBMISSION",
					-274)).convertToCelsius();

			intent.putExtra("RESULT", result.doubleValue());

			Double test = intent.getDoubleExtra("RESULT", 273);
			Log.i("tag", test.toString());

			setResult(3, intent);
		} catch (Exception e) {
			setResult(4, intent);
		}
		finish();

	}
}
