import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class FontWindow {
	
	private JFrame frame;
	private JTextArea textArea;
	private JPanel fontPanel;
	private JRadioButton dialogFontButton;
	private JRadioButton serifFontButton;
	private JRadioButton monospacedFontButton;
	private ButtonGroup fontNameGroup;
	
	
	public FontWindow() {
		
		frame = new JFrame(" Font Window");
		frame.setSize(325, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout( new FlowLayout() );
	    buildPanel();
		frame.setVisible(true);
	}
	
	

	private void buildPanel() {
		textArea = new JTextArea(10, 25);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		fontPanel = new JPanel();
		fontPanel.setBorder( BorderFactory.createTitledBorder("Font Name"));
		
		dialogFontButton = new JRadioButton("Dialog", true);
		dialogFontButton.addActionListener( new DialogFontListener() );
		
		monospacedFontButton = new JRadioButton("Monospaced", false);
		monospacedFontButton.addActionListener( new monospacedFontListener() );
		serifFontButton = new JRadioButton("Serif", false);
		serifFontButton.addActionListener( new serifFontListener() );
		
		
		//initialize button group
		fontNameGroup = new ButtonGroup();
		fontNameGroup.add(dialogFontButton);
		fontNameGroup.add(monospacedFontButton);
		fontNameGroup.add(serifFontButton);
		
		
		// add components to container
		fontPanel.add(dialogFontButton);
		fontPanel.add(monospacedFontButton);
		fontPanel.add(serifFontButton);
		
		frame.add(textArea);
		frame.add(fontPanel);
		
		
		
		
		
		
			
	}

   private class DialogFontListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		Font font = new Font(Font.DIALOG, Font.PLAIN, 12);
		textArea.setFont(font);
		
		
		
	}
	   
	   
   }
   private class monospacedFontListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			Font font = new Font(Font.MONOSPACED, Font.PLAIN, 12);
			textArea.setFont(font);
			
			
			
		}
   }
		   
   	   private class serifFontListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
			Font font = new Font(Font.SERIF, Font.PLAIN, 12);
			textArea.setFont(font);
		}
   	 }
   	   
	public static void main(String[] args) {
		FontWindow window = new FontWindow();
	

	}

}
