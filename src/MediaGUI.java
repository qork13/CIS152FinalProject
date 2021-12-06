/**************************************************************
* Name        : Final Project Media Program
* Author      : Mike Smith
* Created     : 12/3/2021
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This class will build the GUI for the media program and houses the logic for
* the submit, reset, delete, edit buttons as well as what data structure to add to depending on
* if the Media item has a rented date or not. 
* 
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@SuppressWarnings("serial")
public class MediaGUI extends JPanel {
	
/**
 * Members used for the GUI. Used a text formatter to accept dates in a certain format. Used
 * Java Swing components to create the GUI. Opted for a combobox to select the type to display
 * what fields that type is allowed to have. 
 */
	/**
	 * Combobox with array of types.
	 */
	
	private String types[] = {"None Selected", "Game", "Movie"};
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private JComboBox type = new JComboBox(types);
	
	/**
	 * Jtextfield components and JFormatted Text Field for dates. JFormatted text field
	 * will only allow the format that is given otherwise it will wipe out the field.
	 */
	private DateFormat format = new SimpleDateFormat("MM-dd-yyyy");
	private JFormattedTextField releaseDate = new JFormattedTextField(format);
	private JFormattedTextField rentedDate = new JFormattedTextField(format);
	private JTextField title = new JTextField(15);
	private JTextField system = new JTextField(15);
	private JTextField genre = new JTextField(15);
	private JTextField runtime = new JTextField(10);
	private JTextField movieFormat = new JTextField(15);
	
	/**
	 * JButton components for GUI
	 */
	private JButton submit = new JButton("Submit");
	private JButton reset = new JButton("Reset");
	private JButton viewList = new JButton("View List");
	private JButton viewRented = new JButton("View Rented");
	
	/**
	 * JLabel components to label text fields
	 */
	private JLabel titleLabel = new JLabel("Title");
	private JLabel typeLabel = new JLabel("Type");;
	private JLabel releaseLabel = new JLabel("Release Date(MM-dd-yyyy)");
	private JLabel rentedLabel = new JLabel("Rented Date(MM-dd-yyyy)");
	private JLabel systemLabel = new JLabel("Game System");
	private JLabel genreLabel = new JLabel("Genre");
	private JLabel runtimeLabel = new JLabel("Runtime");
	private JLabel formatLabel = new JLabel("Movie Format");
	
	/**
	 * JList components for both the linked list and priority queue data structures
	 * to display Media items
	 */
	private JList list;
	private JList queue;
	
	/**
	 * Default List Model created so I can assign a scrollable list to the JList in case items
	 * in LinkedList or PriorityQueue extend past the GUI view.
	 */
	private DefaultListModel listItems;
	private DefaultListModel queueItems;
	
	/**
	 * Data Structure constructors used.
	 */
	public MediaLinkedList ll = new MediaLinkedList();
	public MediaPriorityQueue pq = new MediaPriorityQueue();

	

	/**
	 * Media GUI constructor that will assign label the variables instantiated above and 
	 * then add them to the JFrame that is created in the MediaProgram.java class.
	 */
	 public MediaGUI() {

	        
		 	
	        
	        
	        /**
	         * Set Date fields to 10 column width
	         */
	        releaseDate.setColumns(20);
	        rentedDate.setColumns(27);
	        type.setPreferredSize(new Dimension(150,20));
	        
	        
	        
	        /**
	         * Add button listeners to the type combo box, submit button, reset button, view list button and view rented button
	         */
	        ComboBoxListener cbl = new ComboBoxListener();
	        type.addItemListener(cbl);
	        SubmitButtonListener sbl = new SubmitButtonListener();
			submit.addActionListener(sbl);
	        reset = new JButton("Reset");
	        ResetButtonListener rbl = new ResetButtonListener();
			reset.addActionListener(rbl);
			ViewListButtonListener vll = new ViewListButtonListener();
			viewList.addActionListener(vll);
			ViewRentedButtonListener vrbl = new ViewRentedButtonListener();
			viewRented.addActionListener(vrbl);
			
			/**
			 * Add components to the JPanel which adds to the JFrame created in MediaProgram.java. 
			 */
			add(typeLabel, BorderLayout.NORTH);
	        add(type, BorderLayout.NORTH);
	        add(titleLabel, BorderLayout.CENTER); 
	        add(title, BorderLayout.CENTER);
	        add(releaseLabel);
	        add(releaseDate);
	        add(rentedLabel);
	        add(rentedDate);
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
	        rentedLabel.setVisible(false);
	        rentedDate.setVisible(false);
	        systemLabel.setVisible(false);
	        system.setVisible(false);
	        genreLabel.setVisible(false);
	        genre.setVisible(false);
	        runtimeLabel.setVisible(false);
	        runtime.setVisible(false);
	        formatLabel.setVisible(false);
	        movieFormat.setVisible(false);
	        submit.setVisible(false);
	        reset.setVisible(false);
	        viewList.setVisible(false);
	        viewRented.setVisible(false);
	        



	        
	    }
	 
	 /**
	  * ItemListener for the combo box that displays fields based on what is selected as the type
	  * @author Mike
	  *
	  */
	 class ComboBoxListener implements ItemListener {
		 
	 /**
	  * Method for if the item changes
	  */
	 public void itemStateChanged(ItemEvent e) {
	        /**
	         * if the type is game then everything except the runtimeLabel, runtime field, format label and format field are displayed
	         */
	        if (type.getSelectedItem().toString() == "Game") {
	        	titleLabel.setVisible(true);
		        title.setVisible(true);
		        releaseLabel.setVisible(true);
		        releaseDate.setVisible(true);
		        rentedLabel.setVisible(true);
		        rentedDate.setVisible(true);
		        systemLabel.setVisible(true);
		        system.setVisible(true);
		        genreLabel.setVisible(true);
		        genre.setVisible(true);
		        runtimeLabel.setVisible(false);
		        runtime.setVisible(false);
		        formatLabel.setVisible(false);
		        movieFormat.setVisible(false);
		        submit.setVisible(true);
		        reset.setVisible(true);
		        viewList.setVisible(true);
		        viewRented.setVisible(true);
	            
	        }
	 
	        /**
	         * If movie type is selected or changed from another option then everything except for the system label, system, genre label
	         * and genre are displayed
	         */
	        else if(type.getSelectedItem().toString() == "Movie") {
	        	titleLabel.setVisible(true);
		        title.setVisible(true);
		        releaseLabel.setVisible(true);
		        releaseDate.setVisible(true);
		        rentedLabel.setVisible(true);
		        rentedDate.setVisible(true);
		        systemLabel.setVisible(false);
		        system.setVisible(false);
		        genreLabel.setVisible(false);
		        genre.setVisible(false);
		        runtimeLabel.setVisible(true);
		        runtime.setVisible(true);
		        formatLabel.setVisible(true);
		        movieFormat.setVisible(true);
		        submit.setVisible(true);
		        reset.setVisible(true);
		        viewList.setVisible(true);
		        viewRented.setVisible(true);
		        
		        /**
		         * None selected is the default first item in the list. If it gets selected again then all the fields 
		         * become invisible so you cannot add anything.
		         */
	        } else {
	        	titleLabel.setVisible(false);
		        title.setVisible(false);
		        releaseLabel.setVisible(false);
		        releaseDate.setVisible(false);
		        rentedLabel.setVisible(false);
		        rentedDate.setVisible(false);
		        systemLabel.setVisible(false);
		        system.setVisible(false);
		        genreLabel.setVisible(false);
		        genre.setVisible(false);
		        runtimeLabel.setVisible(false);
		        runtime.setVisible(false);
		        formatLabel.setVisible(false);
		        movieFormat.setVisible(false);
		        submit.setVisible(false);
		        reset.setVisible(false);
		        viewList.setVisible(false);
		        viewRented.setVisible(false);
	        }
	 	}
	 }
	 
	 /**
	  * Reset button listener
	  * @author Mike
	  *
	  */
	 class ResetButtonListener implements ActionListener {
		 	/**
		 	 * Clicking reset button will reset the form fields on the type that is selected
		 	 */
			@Override
			public void actionPerformed(ActionEvent e) {
				title.setText("");
				releaseDate.setText("");
				rentedDate.setText("");
				system.setText("");
				genre.setText("");
				runtime.setText("");
				movieFormat.setText("");
				
			}
			
		}
		
	 /**
	  * Submit Button Listener
	  * @author Mike
	  *
	  */
		class SubmitButtonListener implements ActionListener {
			/**
			 * This method will try to perform the actions below otherwise it will throw an error.
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					/**
					 * If the type that is selected is Game then the system and genre field are displayed on the screen.
					 * I am setting variables to the text that was entered on the form and then creating a new Game object
					 * and a new Node for the LinkedList/PriorityQueue and passing the Game object in.
					 */
					if(type.getSelectedItem().toString() == "Game") {
						String a = title.getText();
						String b = type.getSelectedItem().toString();
						Date c = (Date)releaseDate.getValue();
						Date d = (Date)rentedDate.getValue();
						String f = system.getText();
						String g = genre.getText();
				
						Game game = new Game(a, b, c, d, f, g);
						Node node = new Node(game);
						/**
						 * Check to see if the user filled out the rented date if they did not it goes to the LinkedList data
						 * structure otherwise it will get put in the Priority Queue in the ascending Date order.
						 */
						if(game.getRentedDate() == null) {
							ll.append(node);
						} else {
							pq.enqueue(node);
						}
						/**
						 * If the type is not a Game then it is a Movie and has the runtime and movieFormat fields. Setting variables
						 * to the text on the form and creating a new Movie object and a new Node using the movie object as the data to
						 * add to the LinkedList/Priority Queue.
						 */
					} else {
						
							String a = title.getText();
							String b = type.getSelectedItem().toString();
							Date c = (Date)releaseDate.getValue();
							Date d = (Date)rentedDate.getValue();
							String f = runtime.getText();
							String g = movieFormat.getText();
					
							Movie movie = new Movie(a, b, c, d, f, g);
							Node node = new Node(movie);
							/**
							 * Check to see if the user filled out the rented date if they did not it goes to the LinkedList data
							 * structure otherwise it will get put in the Priority Queue in the ascending Date order.
							 */
							if(movie.getRentedDate() == null) {
								ll.append(node);
							} else {
								pq.enqueue(node);
							}
					}
				
				/**
				 * Throw exception and pop up dialog box message if failed
				 */
				}  catch (Exception e1) {
					throw e1;
				}
				
			}
	 }
		/**
		 * View List button listener
		 * @author Mike
		 *
		 */
		class ViewListButtonListener implements ActionListener {
			/**
			 * If List button is clicked, program will try to display a new window with a JList and a Delete and Edit button.
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				    
					/**
					 * Create new frame and Buttons. sit listItems variable to a new DefaultListModel object.
					 */
					JFrame newFrame = new JFrame("Game List");
					JPanel panel2 = new JPanel();
					JButton edit = new JButton("Edit");
					JButton delete = new JButton("Delete");
					// TODO figure out edit functionality
					edit.setVisible(false);;
					listItems = new DefaultListModel();
					
					/**
					 * Loop to add LinkedList nodes to listItems model
					 */
					for(int i = 0; i < ll.size(); i++) {
						listItems.addElement(ll.get(i));
					}
					
					/**
					 * Set list variable to a new JList passing in the listItems and setting the list
					 * to only allow a single item to be selected at a time.
					 */
					list = new JList(listItems);
					list.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
					
					/**
					 * Creating a new scrollpane in case the list gets too large for the screen then you can scroll through it. Adding configurations
					 * to the frame and adding the components to the panel along with 2 new buttons and listeners.
					 */
					JScrollPane scrollableList = new JScrollPane(list);
					newFrame.setDefaultCloseOperation(newFrame.DISPOSE_ON_CLOSE);
			        newFrame.setSize(750, 750);
			        newFrame.getContentPane().add(BorderLayout.CENTER, panel2);
					newFrame.add(panel2);
					panel2.add(scrollableList);
					panel2.add(edit, BorderLayout.SOUTH);
					panel2.add(delete, BorderLayout.SOUTH);
					DeleteListButtonListener dlbl = new DeleteListButtonListener();
					delete.addActionListener(dlbl);
					newFrame.setVisible(true);
					
					//TODO edit button functionality
					//EditListButtonListener elbl = new EditListButtonListener();
					//edit.addActionListener(elbl);
							
					/**
					 * Catch exception and display a dialog box pop up and catch the stack trace in console.
					 */
				}  catch (Exception e1) {
					throw e1;
				}
				
			}
	 }
		
		/**
		 * View Rented Button Listener
		 * @author Mike
		 *
		 */
		class ViewRentedButtonListener implements ActionListener {
			/**
			 * If View Rented Button is clicked then a try/catch executes that pops up a new frame with the list of 
			 * scrollable items.
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					/**
					 * Create new frame, panel, buttons and default list model.
					 */
					JFrame newFrame2 = new JFrame("Rented List");
					JPanel panel3 = new JPanel();
					JButton edit = new JButton("Edit");
					JButton delete = new JButton("Delete");
					queueItems = new DefaultListModel();
					
					/**
					 * loop through priority queue and add items to queueItems variable.
					 */
					while(!pq.isEmpty()) {
						queueItems.addElement(pq.get());
					}
					
					/**
					 * Create a new JList using the queueItems variable and set the List to only allow one
					 * item in the list to be selected at a time.
					 */
					queue = new JList(queueItems);
					queue.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
					
					/**
					 * Create a scrollpane using items from queue to allow for scrolling through the queue if its too 
					 * big for the screen. Configure frame, add list, 2 buttons and button listeners to the panel and then display the list. 
					 */
					JScrollPane scrollableQueue = new JScrollPane(queue);
					newFrame2.setDefaultCloseOperation(newFrame2.DISPOSE_ON_CLOSE);
			        newFrame2.setSize(750, 750);
			        newFrame2.getContentPane().add(BorderLayout.CENTER, panel3);
					newFrame2.add(panel3);
					panel3.add(scrollableQueue);
					panel3.add(edit, BorderLayout.SOUTH);
					panel3.add(delete, BorderLayout.SOUTH);
					DeleteQueueButtonListener dqbl = new DeleteQueueButtonListener();
					delete.addActionListener(dqbl);
					newFrame2.setVisible(true);
					newFrame2.setVisible(true);
					
					//TODO
					//EditQueueButtonListener e1bl = new EditQueueButtonListener();
					//edit.addActionListener(e1bl);
				
					/**
					 * Catch for if something goes wrong a dialog box will pop up and the stack trace will be captured in the console
					 */
				}  catch (Exception e1) {
					throw e1;
				}
					
				
			}
		}
		
		/**
		 * Delete List Button Listener
		 * @author Mike
		 *
		 */
		class DeleteListButtonListener implements ActionListener {
			/**
			 * Since they are 2 distinct removal paths I opted for 2 separate button listeners. This
			 * listener will grab the item selected in the list view and then remove it from the LinkedList and the list screen
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
						ll.delete(list.getSelectedIndex());
						listItems.remove(list.getSelectedIndex());
					
						/**
						 * Catch for if something goes wrong, a dialog box will pop up and the stack trace is captured in the console
						 */
				}  catch (Exception e1) {
					throw e1;
				}
				
			}
		}
		
		/**
		 * TODO
		 * @author Mike
		 *
		 */
		class EditListButtonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					//TODO
				}  catch (Exception e1) {
					throw e1;
				}
				
			}
		}
			
		/**
		 * Delete Queue Button Listener
		 * @author Mike
		 *
		 */
			class DeleteQueueButtonListener implements ActionListener {
				/**
				 * When an item is selected from the List view and delete is selected then the item will be removed from the priority queue
				 * and from the list view.
				 * 
				 */
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
							
							pq.dequeue(queue.getSelectedIndex());
							queueItems.remove(queue.getSelectedIndex());
							
							
						/**
						 * Catch if it fails, will throw a dialog box and capture the stack trace in the console.
						 */
					}  catch (Exception e1) {
						throw e1;
					}
					
				}
			}
			
			/**
			 * TODO
			 * @author Mike
			 *
			 */
			class EditQueueButtonListener implements ActionListener {

				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						
							//TODO
							
							
							
							
						
					}  catch (Exception e1) {
						throw e1;
					}
					
				}
			}
}
		
		





