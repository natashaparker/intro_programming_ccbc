package io.renegade.lab1bandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

/*
 * @author Matthew Verrette
 * 		   Introduction to Programming
 *         Professor Cross
 *         lab1b for Android
 */

public class MainActivity extends Activity {
	/*
	 *		*** About Me ***
	 *		Name: Matthew Verrette
	 *		Birthday: February 24, 1981
	 *		Hobbies: Motorcycles, Art, Computers
	 *		Favorite Book: The Girl with the Dragon Tattoo
	 *		Favorite Movie: Blade Runner
	*/
	
	// Application OnCreate, appends data to TextView printing to 
	// Android View when Application is started. Uses StringBuider
	// to concatenate About Me String.
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView tv = (TextView) findViewById(R.id.about_me);
		StringBuilder sb = new StringBuilder();
		sb.append("*** About Me ***\n");
		sb.append("Name: Matthew Verrette\n");
		sb.append("Birthday: February 24, 1981\n");
		sb.append("Hobbies: Motorcycles, Art, Computers\n");
		sb.append("Favorite Book: The Girl with the Dragon Tattoo\n");
		sb.append("Favorite Movie: Blade Runner\n");
		String aboutMe = sb.toString();
		tv.setText(aboutMe);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
