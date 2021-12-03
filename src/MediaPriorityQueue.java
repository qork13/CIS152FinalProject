import java.util.Comparator;
import java.util.PriorityQueue;

public class MediaPriorityQueue {
	private PriorityQueue<Node> pq;
	private int size;
	
	public MediaPriorityQueue() {
		this.pq = new PriorityQueue<Node>(new NodeComparator());
	}
	
	public void enqueue(Node data){
		pq.add(data);
		size++;
	}
	
	public Node get(){
			return pq.poll();
	}
	
	public int size() {
		return size;
	}
	
	public void dequeue(int i) {
		 pq.remove(i);
	}

	public boolean isEmpty() {
		return pq.isEmpty();
	}
	
	class NodeComparator implements Comparator<Node> {
		@Override
		public int compare(Node node1, Node node2) {
			if(node1.data.getType() == "Game" && node2.data.getType() == "Game") {
				if(node1.data.getRentedDate().before(node2.data.getRentedDate())) {
					return -1;
				} else if (node1.data.getRentedDate().after(node2.data.getRentedDate())){
					return 1;
				} else {
					return 0;
				}
			} else if(node1.data.getType() == "Game" && node2.data.getType() == "Movie"){
				if(node1.data.getRentedDate().before(node2.data.getRentedDate())) {
					return -1;
				} else if(node1.data.getRentedDate().after(node2.data.getRentedDate())) {
					return 1;
				} else {
					return 0;
				}
			} else if(node1.data.getType() == "Movie" && node2.data.getType() == "Game"){
				if(node1.data.getRentedDate().before(node2.data.getRentedDate())) {
					return -1;
				} else if(node1.data.getRentedDate().after(node2.data.getRentedDate())) {
					return 1;
				} else {
					return 0;
				}
			} else {
				if(node1.data.getRentedDate().before(node2.data.getRentedDate())) {
					return -1;
				} else if(node1.data.getRentedDate().after(node2.data.getRentedDate())) {
					return 1;
				} else {
					return 0;
				}
			} 
		}
	} 
		
	
	
	
	
 }

