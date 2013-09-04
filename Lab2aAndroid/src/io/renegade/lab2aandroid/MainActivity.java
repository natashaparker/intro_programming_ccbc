package io.renegade.lab2aandroid;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
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
		
		firstNumber = (EditText) findViewById(R.id.firstFloat);
		secondNumber = (EditText) findViewById(R.id.secondFloat);
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
					float floatA = Integer.parseInt(valA);
					float floatB = Integer.parseInt(valB);
					
					calculations.append(String.format("Addition: %f\n", 
							floatA + floatB));
					calculations.append(String.format("Subtraction: %f\n", 
							floatA - floatB));
					calculations.append(String.format("Multiplication: %f\n", 
							floatA * floatB));
					
					// Can't divide by 0. Answer is undefined.
					if (floatB == 0) {
						calculations.append("Division: undefined");
					} else {
						calculations.append(String.format("Division: %f\n", 
								floatA / floatB));
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
