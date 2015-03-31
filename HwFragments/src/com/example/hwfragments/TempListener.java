/*
 Geethika Mudunuri & Patrick Kelsh
 IS413 - QuotedFragments HW
 March 31, 2015
 */
package com.example.hwfragments;

import android.app.Activity;

import android.view.View;
import android.view.View.OnClickListener;


public class TempListener implements OnClickListener {
	
Activity activity; 
	
	
	public TempListener(Activity a) {
		this.activity = a; 
	}
	
	@Override
	public void onClick(View view) {
		
		if(view.getId() == R.id.rd1)
		{
			activity.getFragmentManager().beginTransaction().
			replace(R.id.container, 
					new Quote1()).commit();
		}else if(view.getId() == R.id.rd2)
		{
			activity.getFragmentManager().beginTransaction().
			replace(R.id.container, 
					new Quote2()).commit();
		}
		else
		{
			activity.getFragmentManager().beginTransaction().
			replace(R.id.container, 
					new Quote3()).commit(); 
		}
		
		
	}
}
