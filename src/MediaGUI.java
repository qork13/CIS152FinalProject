
import javax.swing.*;
import javax.swing.text.DateFormatter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class MediaGUI extends JPanel {
	

	private JTextField title;
	private JComboBox type;
	private String types[] = {"None Selected", "Game", "Movie"};
	private DateFormat format = new SimpleDateFormat("MM-dd-yyyy");
	private JFormattedTextField releaseDate;
	private JTextField system;
	private JTextField genre;
	private JTextField runtime;
	private JTextField movieFormat;
	private JButton submit;
	private JButton reset;
	private JButton viewList;
	private JButton viewRented;
	private JLabel titleLabel;
	private JLabel typeLabel;
	private JLabel releaseLabel;
	private JLabel systemLabel;
	private JLabel genreLabel;
	private JLabel runtimeLabel;
	private JLabel formatLabel;
	public LinkedList<Media> ll = new LinkedList<Media>();



	
	 public MediaGUI() {

		 	
	        

	        
	        // adding components
	        titleLabel = new JLabel("Title");
	        typeLabel = new JLabel("Type");
	        releaseLabel = new JLabel("Release Date");
	        systemLabel = new JLabel("Game System");
	        genreLabel = new JLabel("Genre");
	        runtimeLabel = new JLabel("Runtime");
	        formatLabel = new JLabel("Movie Format");
	        
	        title = new JTextField(30);
	        type = new JComboBox(types);
	        
	        releaseDate = new JFormattedTextField(format);
	        releaseDate.setColumns(10);
	        system = new JTextField(30);
	        genre = new JTextField(20);
	        runtime = new JTextField(10);
	        movieFormat = new JTextField(10);
	        
	        ComboBoxListener cbl = new ComboBoxListener();
	        type.addItemListener(cbl);
	        submit = new JButton("Submit");
	        SubmitButtonListener sbl = new SubmitButtonListener();
			submit.addActionListener(sbl);
	        reset = new JButton("Reset");
	        ResetButtonListener rbl = new ResetButtonListener();
			reset.addActionListener(rbl);
			viewList = new JButton("View List");
			ViewListButtonListener vll = new ViewListButtonListener();
			viewList.addActionListener(vll);
			viewRented = new JButton("View Rented");
		//	ViewRentedListener vrl = new ViewRentedListener();
		//	viewRented.addActionListener(vrl);
			
			// Components Added using Flow Layout
			add(typeLabel);
	        add(type);
	        add(titleLabel); 
	        add(title);
	        add(releaseLabel);
	        add(releaseDate);
	        add(systemLabel);
	        add(system);
	        add(genreLabel);
	        add(genre);
	        add(runtimeLabel);
	        add(runtime);
	        add(formatLabel);
	        add(movieFormat);
	        add(submit);
	        add(reset);
	        add(viewList);
	        add(viewRented);

	        // Set visibility of all fields except type to false
	        titleLabel.setVisible(false);
	        title.setVisible(false);
	        releaseLabel.setVisible(false);
	        releaseDate.setVisible(false);
	        systemLabel.setVisible(false);
	        system.setVisible(false);
	        genreLabel.setVisible(false);
	        genre.setVisible(false);
	        runtimeLabel.setVisible(false);
	        runtime.setVisible(false);
	        formatLabel.setVisible(false);
	        movieFormat.setVisible(false);
	        



	        
	    }
	 
	 class ComboBoxListener implements ItemListener {
		 
	 
	 public void itemStateChanged(ItemEvent e) {
	        // if the state combobox changed
	        if (type.getSelectedItem().toString() == "Game") {
	        	titleLabel.setVisible(true);
		        title.setVisible(true);
		        releaseLabel.setVisible(true);
		        releaseDate.setVisible(true);
		        systemLabel.setVisible(true);
		        system.setVisible(true);
		        genreLabel.setVisible(true);
		        genre.setVisible(true);
		        runtimeLabel.setVisible(false);
		        runtime.setVisible(false);
		        formatLabel.setVisible(false);
		        movieFormat.setVisible(false);
	            
	        }
	 
	        // if state of combobox 2 is changed
	        else if(type.getSelectedItem().toString() == "Movie") {
	        	titleLabel.setVisible(true);
		        title.setVisible(true);
		        releaseLabel.setVisible(true);
		        releaseDate.setVisible(true);
		        systemLabel.setVisible(false);
		        system.setVisible(false);
		        genreLabel.setVisible(false);
		        genre.setVisible(false);
		        runtimeLabel.setVisible(true);
		        runtime.setVisible(true);
		        formatLabel.setVisible(true);
		        movieFormat.setVisible(true);
		        
	        } else {
	        	titleLabel.setVisible(false);
		        title.setVisible(false);
		        releaseLabel.setVisible(false);
		        releaseDate.setVisible(false);
		        systemLabel.setVisible(false);
		        system.setVisible(false);
		        genreLabel.setVisible(false);
		        genre.setVisible(false);
		        runtimeLabel.setVisible(false);
		        runtime.setVisible(false);
		        formatLabel.setVisible(false);
		        movieFormat.setVisible(false);
	        }
	 	}
	 }
	 
	 class ResetButtonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				//TO DO
		
				
				
				
				MediaGUI empty = new MediaGUI();
				
				
			}
			
		}
		
		class SubmitButtonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String a = title.getText();
					String b = type.getSelectedItem().toString();
					Date c = (Date) releaseDate.getValue();
					Date d = null;
					String f = system.getText();
					String g = genre.getText();
				
				
				
				
					Game game = new Game(a, b, c, d, f, g);
					ll.add(game);
					
				
				
				}  catch (Exception e1) {
					throw e1;
				}
				
			}
	 }
		class ViewListButtonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					for(int i = 0; i < ll.size(); i++) {
						System.out.println(ll.get(i));
					}
					
					
				
				
				}  catch (Exception e1) {
					throw e1;
				}
				
			}
	 }
		
		class ViewRentedButtonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					// TO DO
					
				
				
				}  catch (Exception e1) {
					throw e1;
				}
				
			}
		}
}




