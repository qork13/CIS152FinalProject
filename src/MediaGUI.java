
import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class MediaGUI {
	LinkedList<Media> media = new LinkedList<Media>();
	PriorityQueue<Media> rented = new PriorityQueue<Media>();
	
	 public static void main(String args[]) {

	        //Creating the Frame
	        JFrame frame = new JFrame("Media database");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 400);

	        //Creating the MenuBar and adding components
	        JMenuBar mb = new JMenuBar();
	        JMenu m1 = new JMenu("File");
	        JMenu m2 = new JMenu("Help");
	        mb.add(m1);
	        mb.add(m2);
	        JMenuItem m11 = new JMenuItem("New");
	        m1.add(m11);
	        

	        //Creating the panel at bottom and adding components
	        JPanel panel = new JPanel(); 
	        JLabel label = new JLabel("Title");
	        JTextField title = new JTextField(30); 
	        JButton submit = new JButton("Submit");
	        JButton reset = new JButton("Reset");
	        panel.add(label); // Components Added using Flow Layout
	        panel.add(title);
	        panel.add(submit);
	        panel.add(reset);


	        //Adding Components to the frame.
	        frame.getContentPane().add(BorderLayout.CENTER, panel);
	        frame.getContentPane().add(BorderLayout.NORTH, mb);
	        frame.setVisible(true);
	    }
	 }


