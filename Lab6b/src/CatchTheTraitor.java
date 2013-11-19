import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author Matthew Verrette				CatchTheTraitor.java
 * 
 * Professor Cross						Introduction to Programming
 *
 *
 *Design and implement an application that plays a game called 
 *Catch-the-Creature. Use an image to represent the creature. Have the 
 *creature appear at a random location for a random duration, then 
 *disappear and reappear somewhere else. The goal is to “catch” the 
 *creature by pressing the mouse button while the mouse pointer is on 
 *the creature image. Create a separate class to represent the creature, 
 *and include in it a method that determines whether the location of 
 *the mouse click corresponds to the current location of the creature. 
 *Display a count of the number of times the creature is caught.
 */
public class CatchTheTraitor {

	// Sets up Traitor Panel
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Catch the Traitor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TraitorPanel traitor = new TraitorPanel();
		TraitorControls control = new TraitorControls(traitor);

		JPanel panel = new JPanel();
		panel.setBackground(Color.black);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(Box.createRigidArea(new Dimension(0,20)));
		panel.add(traitor);
		panel.add(Box.createRigidArea(new Dimension(0, 10)));
		panel.add(control);
		panel.add(Box.createRigidArea(new Dimension(0, 10)));
		
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);

	}

}
