
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ColorWindow {
	

	private JFrame frame;
	private JLabel messagelabel;
	private JPanel buttonPanel;
	private JButton blueButton;
	private JButton yellowButton;
	private JButton redButton;
	
	//constructor method
	public ColorWindow() {
	// initialize JFrame
	
	frame = new JFrame(" Color Window");
	frame.setSize(250, 125);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout( new FlowLayout() );
	buildPanel();
	frame.setVisible(true);
	
}
	private void buildPanel() {
		//initialize components
		messagelabel= new JLabel(" Click a button to select a clor");
		buttonPanel = new JPanel();
		buttonPanel.setBorder(BorderFactory.createEtchedBorder() );
		redButton = new JButton("Red");
	    blueButton = new JButton("Blue");
		yellowButton = new JButton("yellow");
		
		// add components to containers
		buttonPanel.add(redButton);
		buttonPanel.add(blueButton);
		buttonPanel.add(yellowButton);
		
		frame.add(messagelabel);
		frame.add(buttonPanel);
		
	}



public static void main(String[] args) {
ColorWindow window = new ColorWindow();
			}
			
				
			
		
		
	}

