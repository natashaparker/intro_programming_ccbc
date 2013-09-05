package io.renegade.lab2bandroid;

import android.os.Bundle;
import android.app.Activity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText firstNumber;
	EditText secondNumber;
	TextView calculations;
	String valA;
	String valB;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		firstNumber = (EditText) findViewById(R.id.firstInt);
		secondNumber = (EditText) findViewById(R.id.secondInt);
		Button calculate = (Button) findViewById(R.id.calculate);
		calculations = (TextView) findViewById(R.id.calculations);
		calculations.setMovementMethod(new ScrollingMovementMethod());
		calculations.setText("Calculations:\n");
		
		
		calculate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				valA = firstNumber.getText().toString();
				valB = secondNumber.getText().toString();
				
				
				try {
					float intA = Float.parseFloat(valA);
					float intB = Float.parseFloat(valB);
					
					// Can't divide by 0. Answer is undefined.
					if (intB == 0) {
						calculations.append("Division: undefined");
					} else {
						
						calculations.append(String.format("Fraction: %.0f / %.0f\n", intA, intB));
						calculations.append(String.format("Decimal: %.2f\n", 
								intA / intB));
					}
					calculations.append("**********************************");
					
				} catch (NumberFormatException e) {
					e.printStackTrace();
					Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
