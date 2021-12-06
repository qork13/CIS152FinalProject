/**************************************************************
* Name        : Final Project Media Program
* Author      : Mike Smith
* Created     : 12/3/2021
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This class stores the methods used to create, add to, get item, delete and sort. 
* 
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/
import java.util.*;

public class MediaLinkedList {
	/**
	 * Linked List variables
	 */
	
	private LinkedList<Node> ll;
	private int size;
	
	/**
	 * Constructor for linked list
	 */
	public MediaLinkedList() {
		this.ll = new LinkedList<Node>();
	}
	
	/**
	 * Add Node to linked list
	 * @param data
	 */
	public void append(Node data){
		ll.add(data);
		size++;
	}
	
	/**
	 * Get node from certain index
	 * @param i
	 * @return
	 */
	public Node get(int i){
			return ll.get(i);
	}
	
	/**
	 * Keep track of size
	 * @return
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Delete item from linked list at a certain index
	 * @param i
	 */
	public void delete(int i) {
		ll.remove(i);
		size--;
	}
	
	//TODO edit
	public void set(int i, Node node) {
		ll.set(i, node);
	}
	
	public boolean isEmpty() {
		return ll.isEmpty();
	}
	
	/**
	 * Bubble sort for items in linked list. I built another linked list as I was having trouble with the linked list
	 * that was passed in.
	 * @param pl
	 * @return
	 */
	public MediaLinkedList bubbleSort(MediaLinkedList pl) {
	       boolean swapped;
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
