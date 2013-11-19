import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * @author Matthew Verrette				TraitorPanel.java
 * 
 * Professor Cross						Introduction to Programming
 *
 * Create a separate class to represent the creature, 
 * and include in it a method that determines whether the location of 
 * the mouse click corresponds to the current location of the creature. 
 * Display a count of the number of times the creature is caught.
 */
public class TraitorPanel extends JPanel {

	private final int WIDTH = 800;
	private final int HEIGHT = 640;
	private final int DELAY = 1000;
	private final int IMAGE_SIZE = 150;
	
	private ImageIcon image;
	private Timer timer;
	private int x;
	private int y;

	private int coordX;
	private int coordY;
	
	private int caught_count;
	
	boolean mouseEnabled;
	
	public TraitorPanel() {
		image = new ImageIcon("traitor.gif");
		addMouseListener(new CoordinatesListener());
		x = WIDTH / 2;
		y = HEIGHT / 2;
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.white);
	}
	
	public void start() {
		caught_count = 0;
		x = WIDTH / 2;
		y = HEIGHT / 2;
		timer = new Timer(DELAY, new TraitorListener());
		mouseEnabled = true;
		timer.start();
	}
	
	public void stop() {
		mouseEnabled = false;
		timer.stop();
	}
	
	// Paints Initial Screen 
	
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		image.paintIcon(this, page, x, y);
		page.setColor(Color.black);
		page.drawString("Traitors Caught: " + caught_count, 5, 15);
	}
	
	// Listens for mouse press events
	
	private class CoordinatesListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent event) {}

		@Override
		public void mouseEntered(MouseEvent event) {}

		@Override
		public void mouseExited(MouseEvent event) {}

		@Override
		public void mousePressed(MouseEvent event) {
			if (mouseEnabled == true) {
				coordX = event.getX();
				coordY = event.getY();
	
				// Checks if Mouse Click is on image
				
				if ( coordX >= x && coordX <= x + IMAGE_SIZE &&
						coordY >= y && coordY <= y + IMAGE_SIZE ){
					System.out.println(caught_count);
						caught_count = caught_count + 1;
				}
				repaint();
			}

		}

		@Override
		public void mouseReleased(MouseEvent event) {}
		
	}
	
	// Moves image randomly in Panel
	
	private class TraitorListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			Random generator = new Random();
			
			// Generates Random X,Y
			x = generator.nextInt(WIDTH / 2) + 1;
			y = generator.nextInt(HEIGHT / 2) + 1;
			
			//Generates new Delay and Sets timer to new delay
			timer.setDelay(generator.nextInt(1000));
			repaint();
		}
		
	}

}
