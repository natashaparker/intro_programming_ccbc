import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Car {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Cars");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CarPanel car = new CarPanel();
		CarControls control = new CarControls(car);

		JPanel panel = new JPanel();
		panel.setBackground(Color.black);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(Box.createRigidArea(new Dimension(0,20)));
		panel.add(car);
		panel.add(Box.createRigidArea(new Dimension(0, 10)));
		panel.add(control);
		panel.add(Box.createRigidArea(new Dimension(0, 10)));
		
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}

}
