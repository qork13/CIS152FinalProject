import java.util.*;

public class MediaLinkedList {
	
	private LinkedList<Node> ll;
	private int size;
	
	public MediaLinkedList() {
		this.ll = new LinkedList<Node>();
	}
	
	public void append(Node data){
		ll.add(data);
		size++;
	}
	
	public Node get(int i){
			return ll.get(i);
	}
	
	public int size() {
		return size;
	}
	
	public void delete(int i) {
		ll.remove(i);
	}
	
	public addRentedDate(int i) {
		ll.get(i);
		
	}
	
	
	
}
