import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;




public class TraitorControls extends JPanel {

	private TraitorPanel traitor;
	private JButton start;
	private JButton stop;
	
	public TraitorControls(TraitorPanel traitorPanel) {
		traitor = traitorPanel;
		
		start = new JButton("Start");
		start.setEnabled(true);
		start.setMnemonic('s');
		start.setToolTipText("Start Catch the Traitor");
		start.addActionListener(new startListener());
		
		stop = new JButton("Stop");
		stop.setEnabled(false);
		stop.setMnemonic('t');
		stop.setToolTipText("Stop Catch the Traitor");
		stop.addActionListener(new stopListener());
		
		setBackground(Color.black);
		add(start);
		add(stop);
	}

	private class startListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			traitor.start();
			start.setEnabled(false);
			stop.setEnabled(true);
			traitor.repaint();
			
		}
	}
	
	private class stopListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			traitor.stop();
			start.setEnabled(true);
			stop.setEnabled(false);
			traitor.repaint();
			
		}
		
	}
}
