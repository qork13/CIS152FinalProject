import java.util.*;

public class MediaLinkedList {
	
	private Node head;
	private LinkedList<Node> ll;
	private int size;
	
	public MediaLinkedList() {
		this.ll = new LinkedList<Node>();
		this.head = null;
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
		size--;
	}
	
	public void set(int i, Node node) {
		ll.set(i, node);
	}
	
	public void deleteFirst() {
		ll.remove();
		size--;
	}
	
	
	
	public MediaLinkedList bubbleSort(MediaLinkedList pl) {
	       boolean swapped;
	       System.out.println(pl.size());
	       LinkedList<Node> nl = new LinkedList<Node>();
	       
	       for(int j = 0; j < pl.size(); j++) {
	    	   nl.add(pl.get(j));
	    	   pl.delete(j);
	       }
	      
	       
	       do {
	    	   swapped = false;
	    	   
	    	   for(int i = 0; i < nl.size() - 1; i++) {
	    		   if(nl.get(i).data.getId() < nl.get(i+1).data.getId()) {
	    			   Collections.swap(nl, i, i+1);
	    			   swapped = true;
	    		   }
	    	   }
	       } while(swapped);
	       
	       
	       for(int k = 0; k < nl.size(); k++) {
	    	   pl.append(nl.get(k));
	       }
	       
	       return pl;
	       
	       	}
	
	
}
