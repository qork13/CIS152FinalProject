import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MediaProgram {

	public static void main(String[] args) {
		//Creating the Frame
        JFrame frame = new JFrame("Media database");
        MediaGUI panel = new MediaGUI();
        frame.add(panel);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
        
        
        

	}

}
