import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MediaProgram {

	public static void main(String[] args) {
		//Creating the Frame
        JFrame frame = new JFrame("Media database");
        MediaGUI panel = new MediaGUI();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
        
        

	}

}
