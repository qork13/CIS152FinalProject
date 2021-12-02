import java.util.LinkedList;
import java.util.PriorityQueue;

public class MediaPriorityQueue {
	private PriorityQueue<Node> pq;
	private int size;
	
	public MediaPriorityQueue() {
		this.pq = new PriorityQueue<Node>();
	}
	
	public void append(Node data){
		pq.add(data);
		size++;
	}
	
	public Node get(int i){
			return pq.getElement(i);
	}
	
	public int size() {
		return size;
	}
	
	public void delete(int i) {
		pq.remove(i);
	}
	
	
		
	}
	
	
	
}
}
