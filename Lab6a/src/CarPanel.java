import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


public class CarPanel extends JPanel {

	private final int WIDTH = 800;
	private final int HEIGHT = 640;
	private final int DELAY = 1000/24;
	private ImageIcon image;
	private Timer timer;
	private int x;
	private int y;

	public CarPanel() {
		image = new ImageIcon("fd.gif");
		x = 0 - image.getIconWidth();
		y = HEIGHT / 2;
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
	
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		image.paintIcon(this, page, x, y);

	}

	public void start() {
		timer = new Timer(DELAY, new CarListener());
		timer.start();
	}
	
	public void stop() {
		timer.stop();
		
	}
	
	private class CarListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			
			x = x + 1;
			//Generates new Delay and Sets timer to new delay
			timer.setDelay(DELAY);
			repaint();
		}
	}
}
