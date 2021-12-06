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
* Description : This class stores the methods used to create, add to, get item, delete, and sort Priority Queue. 
* 
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/
import java.util.Comparator;
import java.util.PriorityQueue;


public class MediaPriorityQueue {
	/**
	 * Priority queue variables
	 */
	private PriorityQueue<Node> pq;
	private int size;
	
	/**
	 * Build priority queue with a node comparator to sort by priority
	 */
	public MediaPriorityQueue() {
		this.pq = new PriorityQueue<Node>(new NodeComparator());
	}
	
	/**
	 * adds to the queue
	 * @param data
	 */
	public void enqueue(Node data){
		pq.add(data);
		size++;
	}
	
	/**
	 * Gets element at the head of the queue
	 * @return
	 */
	public Node get(){
			return pq.poll();
	}
	
	/**
	 * Returns the size of the queue
	 * @return
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Will remove element from the queue at location i
	 * @param i
	 */
	@SuppressWarnings("unlikely-arg-type")
	public void dequeue(int i) {
		 pq.remove(i);
	}
	
	/**
	 * Checks if queue is empty
	 * @return
	 */
	public boolean isEmpty() {
		return pq.isEmpty();
	}
	
	/**
	 * Compare function that will compare rented date and put the date in ascending order by rented date.
	 * @author Mike
	 *
	 */
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

