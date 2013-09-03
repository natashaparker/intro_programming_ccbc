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
	 *	*** About Me ***
	 *		Name: Matthew Verrette
	 *		Birthday: February 24, 1981
	 *		Hobbies: Motorcycles, Art, Computers
	 *		Favorite Book: The Girl with the Dragon Tattoo
	 *		Favorite Movie: Blade Runner
	*/
	
	// Application OnCreate, appends data to TextView printing to 
	// Android View when Application is started.
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView tv = (TextView) findViewById(R.id.about_me);
		tv.append("*** About Me ***\n");
		tv.append("Name: Matthew Verrette\n");
		tv.append("Birthday: February 24, 1981\n");
		tv.append("Hobbies: Motorcycles, Art, Computers\n");
		tv.append("Favorite Book: The Girl with the Dragon Tattoo\n");
		tv.append("Favorite Movie: Blade Runner\n");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
