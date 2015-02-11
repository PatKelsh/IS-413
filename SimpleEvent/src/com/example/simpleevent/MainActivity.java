package com.example.simpleevent;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {

	private Button b1, b2, b3, b4;
	private RadioButton rb1, rb2, rb3, rb4;
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.color_region);
		
		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b3 = (Button) findViewById(R.id.button3);
		b4 = (Button) findViewById(R.id.button4);

		rb1 = (RadioButton) findViewById(R.id.radio_button1);
		rb2 = (RadioButton) findViewById(R.id.radio_button2);
		rb3 = (RadioButton) findViewById(R.id.radio_button3);
		rb4 = (RadioButton) findViewById(R.id.radio_button4);

		b1.setOnClickListener(new RedListener());
		rb1.setOnClickListener(new RedListener());
		
		b2.setOnClickListener(new BlueListener());
		rb2.setOnClickListener(new BlueListener());
		
		b3.setOnClickListener(new GreenListener());
		rb3.setOnClickListener(new GreenListener());
		
		b4.setOnClickListener(new YellowListener());
		rb4.setOnClickListener(new YellowListener());
	}

	private class RedListener implements OnClickListener {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			tv.setBackgroundColor(Color.RED);
		}
	}
	
	private class BlueListener implements OnClickListener {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			tv.setBackgroundColor(Color.BLUE);
		}
	}
	
	private class GreenListener implements OnClickListener {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			tv.setBackgroundColor(Color.GREEN);
		}
	}
	
	private class YellowListener implements OnClickListener {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			tv.setBackgroundColor(Color.YELLOW);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
