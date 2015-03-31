/*
 Geethika Mudunuri & Patrick Kelsh
 IS413 - QuotedFragments HW
 March 31, 2015
 */

package com.example.hwfragments;


import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;


public class MainActivity extends Activity {
	private RadioButton radioB1, radioB2, radioB3;
	private TempListener tempListener; 
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        radioB1 = (RadioButton)findViewById(R.id.rd1);
        radioB2 = (RadioButton)findViewById(R.id.rd2);
        radioB3 = (RadioButton)findViewById(R.id.rd3);
        
        tempListener = new TempListener(this); 
        
        radioB1.setOnClickListener(tempListener);
        radioB2.setOnClickListener(tempListener);
        radioB3.setOnClickListener(tempListener);
    }
    

}
