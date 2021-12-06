package Final;
/**************************************************************
* Name        : Final Project Media Program
* Author      : Mike Smith
* Created     : 12/3/2021
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This class is the node class that the MediaLinkedList and MediaPriorityQueue will use. The Node is created using a Media Object.
* 
*
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/

public class Node {
	/**
	 * Node variable
	 */
		public Media data;
		
		/**
		 * Node constructor using a media object
		 * @param data
		 */
		public Node(Media data) {
			this.data = data ;
		}
		
	
		
		/**
		 * ToString
		 */
		@Override
		public String toString() {
			String item = "";
			if(data != null) {
				item +=  data;
			} 
			return item;
		} 
		

	}


		
		

	


