package edu.tempconverter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
	
	private Button fToC;
	private Button cToF;
	private Bundle state = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
        fToC = (Button) findViewById(R.id.fbutton);
        cToF = (Button) findViewById(R.id.cbutton);
        
        fToC.setOnClickListener(new FListener());
        cToF.setOnClickListener(new CListener());
    }
    
    private class FListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
//			setContentView(R.layout.fahrenheit_activity);
			
			FahrenheitActivity fa = new FahrenheitActivity();
			Intent intent = new Intent(MainActivity.this, FahrenheitActivity.class);
			fa.startActivity(intent);
		}
    }
    
    private class CListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			CalsiusActivity ca = new CalsiusActivity();
			Intent intent = new Intent();
			intent.setAction(ACTIVITY_SERVICE);
			ca.startActivity(intent);
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
