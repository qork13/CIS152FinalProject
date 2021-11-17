
import javax.swing.*;
import javax.swing.text.DateFormatter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class MediaGUI extends JPanel {
	

	private JTextField title;
	private JTextField type;
	private DateFormat format = new SimpleDateFormat("MM-dd-yyyy");
	private JFormattedTextField releaseDate;
	private JButton submit;
	private JButton reset;
	private JLabel titleLabel;
	private JLabel typeLabel;
	private JLabel releaseLabel;



	
	 public MediaGUI() {

		 	
	        

	        //Creating the MenuBar and adding components
	        JMenuBar mb = new JMenuBar();
	        JMenu m1 = new JMenu("File");
	        JMenu m2 = new JMenu("Help");
	        mb.add(m1);
	        mb.add(m2);
	        JMenuItem m11 = new JMenuItem("New");
	        m1.add(m11);
	        

	        // adding components
	        titleLabel = new JLabel("Title");
	        typeLabel = new JLabel("Type");
	        releaseLabel = new JLabel("Release Date");
	        title = new JTextField(30);
	        type = new JTextField(6);
	        releaseDate = new JFormattedTextField(format);
	        releaseDate.setColumns(10);
	        submit = new JButton("Submit");
	        SubmitButtonListener sbl = new SubmitButtonListener();
			submit.addActionListener(sbl);
	        reset = new JButton("Reset");
	        ResetButtonListener rbl = new ResetButtonListener();
			reset.addActionListener(rbl);
	        add(titleLabel); // Components Added using Flow Layout
	        add(title);
	        add(typeLabel);
	        add(type);
	        add(releaseLabel);
	        add(releaseDate);
	        add(submit);
	        add(reset);

	        
	    }
	 
	 class ResetButtonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				title.setText("");
				type.setText("");
				releaseDate.setText("");
		
				
				
				
				MediaGUI empty = new MediaGUI();
				
				
			}
			
		}
		
		class SubmitButtonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String a = title.getText();
					String b = type.getText();
					Date c = (Date) releaseDate.getValue();
				
				
				
				
					Media media = new Media(a, b, c);
					
				
				
				}  catch (Exception e1) {
					throw e1;
				}
				
			}
	 }
}



