/*
 Geethika Mudunuri & Patrick Kelsh
 IS413 - QuotedFragments HW
 March 31, 2015
 */
package com.example.hwfragments;

import java.text.DecimalFormat;


import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ListofQuotes extends Fragment {

	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		
		View rootView = inflater.inflate(R.layout.qt1, container,
				false);
		
		
		
		return rootView;
	}
}
