
public class LinkedList {
	Node head;
	
	public void append(Media data) {
		if(head == null) {
			head = new Node(data);
			return;
		} 
		
		Node current = head;
		while(current.next != null) {
			current = current.next;
			
		}
		
		current.next = new Node(data);
	}

	public void deleteWithValue(Media data){
		if(head == null) return;
		if(head.data == data){
		   head = head.next;
		   return;
		}
		Node current = head;
		while  (current.next != null){
		if (current.next.data == data){
		    current.next = current.next.next;
		    return;
		    }
		  current = current.next;
		 }
		}
}
