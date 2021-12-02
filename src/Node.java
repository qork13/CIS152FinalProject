
public class Node implements Comparable<Node> {
		Node next;
		Game data;
		Movie data2;
		
		public Node(Game data) {
			this.data = data ;
		}
		
		public Node(Movie data2) {
			this.data2 = data2 ;
		}
		

		@Override
		public String toString() {
			String item = "";
			if(data != null) {
				item += "data=" + data;
			} else {
				item += "data=" + data2;
			}
			return item;
		}

		@Override
		public int compareTo(Node node) {
			if(node.data.getType() == "Game" && this.data.getType() == "Game") {
				

				if(node.data.getRentedDate().before(this.data.getRentedDate())) {
					return 1;
				} else {
					return 0;
				}
			} else {
				if(node.data2.getReleaseDate().before(this.data2.getReleaseDate())) {
					return 1;
				} else {
					return 0;
				}
			}
		}
	}
		
		
	
	


