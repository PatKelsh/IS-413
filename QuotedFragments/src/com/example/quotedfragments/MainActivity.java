package com.example.quotedfragments;

//import android.support.v7.app.ActionBarActivity;
//
//import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
//import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Activity implements OnClickListener {

	
	
	private DefaultFragment df;
	private Quote1Fragment q1;
	private Quote2Fragment q2;
	private Quote3Fragment q3;
	private RadioButton quote1;
	private RadioButton quote2;
	private RadioButton quote3;
	private EditText editText;
	private FragmentManager fm;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	
	
	// default fragment
	df = new DefaultFragment();
	
	// fragment manager reference
	fm = getFragmentManager();
	
	//add default fragment to the container
	FragmentTransaction ft = fm.beginTransaction();
	ft.add(R.id.fragmentContainer, df);
	ft.commit();
	
	
	
	//set the buttons
	quote1 = (RadioButton)findViewById(R.id.radio1);
	quote2 = (RadioButton)findViewById(R.id.radio2);
	quote3 = (RadioButton)findViewById(R.id.radio3);
	
	quote1.setOnClickListener(this);
	quote2.setOnClickListener(this);
	quote3.setOnClickListener(this);
	
	
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

	
	



	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		FragmentTransaction ft = fm.beginTransaction();
		
		switch(v.getId()){
		case R.id.radio1:
	
			{
				q1 = new Quote1Fragment();
				ft.replace(R.id.fragmentContainer, q1);
				ft.commit();
			} 
			break;
		case R.id.radio2:

			{
				q2 = new Quote2Fragment();
				ft.replace(R.id.fragmentContainer, q2);
				ft.commit();
			} 
			break;
			
		case R.id.radio3:

			{
				q3 = new Quote3Fragment();
				ft.replace(R.id.fragmentContainer, q3);
				ft.commit();
			} 
			break;
		}
		
		
	}
}
