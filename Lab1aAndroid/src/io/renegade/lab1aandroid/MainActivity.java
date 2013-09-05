package io.renegade.lab1aandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

//************************************************************
//Lincoln.java 			Introduction to Programming
//
//Matthew Verrette		Professor Cross
//
//Demonstrates the basic structure of an Android application
//
//************************************************************

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView tv = (TextView) findViewById(R.id.lincoln_quote);
		tv.setText("A quote by Abraham Lincoln:\n");
		tv.append("Whatever you are, be a good one.\n");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
