import java.util.Comparator;

public class Node {
	
		//Game data;
		//Movie data2;
		Media data;
		
		public Node(Media data) {
			this.data = data ;
		}
		
	/*	public Node(Movie data) {
			this.data2 = data ;
		} */
		

		@Override
		public String toString() {
			String item = "";
			if(data != null) {
				item += "data=" + data;
			} /* else {
				item += "data=" + data2;
			} */
			return item;
		}
		
		class LinkedListComparator implements Comparator<Node> {

			@Override
			public int compare(Node o1, Node o2) {
				return o1.data.getId() - o2.data.getId();
				
			}
	       }

	}


		
		

	


