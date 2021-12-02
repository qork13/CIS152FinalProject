
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
	private JList list;
	private DefaultListModel listItems;
	public MediaLinkedList ll = new MediaLinkedList();



	
	 public MediaGUI() {

	        
		 	// adding components
	        titleLabel = new JLabel("Title");
	        typeLabel = new JLabel("Type");
	        releaseLabel = new JLabel("Release Date(MM-dd-yyyy");
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
			add(typeLabel, BorderLayout.NORTH);
	        add(type, BorderLayout.NORTH);
	        titleLabel.setBounds(10,20,80,25);
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
	        add(submit, BorderLayout.SOUTH);
	        add(reset, BorderLayout.SOUTH);
	        add(viewList, BorderLayout.SOUTH);
	        add(viewRented, BorderLayout.SOUTH);
	        
	        

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
	 
	        // if state of combobox
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
					if(type.getSelectedItem().toString() == "Game") {
						String a = title.getText();
						String b = type.getSelectedItem().toString();
						Date c = (Date)releaseDate.getValue();
						Date d = null;
						String f = system.getText();
						String g = genre.getText();
				
				
				
				
						Game game = new Game(a, b, c, d, f, g);
						Node node = new Node(game);
						ll.append(node);
					} else {
						
							String a = title.getText();
							String b = type.getSelectedItem().toString();
							Date c = (Date)releaseDate.getValue();
							Date d = null;
							String f = runtime.getText();
							String g = movieFormat.getText();
					
					
					
					
							Movie movie = new Movie(a, b, c, d, f, g);
							Node node = new Node(movie);
							ll.append(node);
					}
				
				
				}  catch (Exception e1) {
					throw e1;
				}
				
			}
	 }
		class ViewListButtonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					JFrame newFrame = new JFrame("Game List");
					JPanel panel2 = new JPanel();
					JButton edit = new JButton("Edit");
					JButton delete = new JButton("Delete");
					listItems = new DefaultListModel();
					
					
	
					for(int i = 0; i < ll.size(); i++) {
						listItems.addElement(ll.get(i));
						
					}
					
					list = new JList(listItems);
					list.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
					JScrollPane scrollableList = new JScrollPane(list);
					
					
					newFrame.setDefaultCloseOperation(newFrame.EXIT_ON_CLOSE);
			        newFrame.setSize(750, 750);
			        newFrame.getContentPane().add(BorderLayout.CENTER, panel2);
					
					newFrame.add(panel2);
					panel2.add(scrollableList);
					panel2.add(edit, BorderLayout.SOUTH);
					panel2.add(delete, BorderLayout.SOUTH);
					DeleteButtonListener dbl = new DeleteButtonListener();
					delete.addActionListener(dbl);
					//EditButtonListener ebl = new EditButtonListener();
					//edit.addActionListener(ebl);
					newFrame.setVisible(true);
				
				
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
		
		class DeleteButtonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
						
						ll.delete(list.getSelectedIndex());
						listItems.remove(list.getSelectedIndex());
					
				}  catch (Exception e1) {
					throw e1;
				}
				
			}
		}
		
		class EditButtonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
						ll.get(list.getSelectedIndex());
						
						
						
						
					
				}  catch (Exception e1) {
					throw e1;
				}
				
			}
		}
}




