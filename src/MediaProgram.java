/**************************************************************
* Name        : Final Project Media Program
* Author      : Mike Smith
* Created     : 12/3/2021
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This is the main class that will launch the program and create the frame and MediaGUI. 
* 
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MediaProgram {

	public static void main(String[] args) throws Exception {
		//Creating the Frame
        JFrame frame = new JFrame("Media database");
        MediaGUI panel = new MediaGUI();
        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
        
       }

}
