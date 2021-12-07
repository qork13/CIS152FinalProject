package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import Final.Game;
import Final.MediaPriorityQueue;
import Final.Movie;
import Final.Node;

class MediaPriorityQueueTest {


	@Test
	void testCreateMediaList() {
		// ARRANGE
		MediaPriorityQueue myPQ = new MediaPriorityQueue();
		boolean actual;
		actual = myPQ.isEmpty();
		assertTrue(actual);
	}

	@Test
	void testIsEmptyTrue() {
		// ARRANGE
		MediaPriorityQueue myPQ = new MediaPriorityQueue();
		boolean actual;
		// ACT
		actual = myPQ.isEmpty();
		// ASSERT
		assertTrue(actual);
	}

	@Test
	void testIsEmptyFalse() throws ParseException {
		// ARRANGE
		MediaPriorityQueue myPQ = new MediaPriorityQueue();
		String rDate1 = "03-08-2021";
		Date rentedDate1 = new SimpleDateFormat("MM-dd-yyyy"). parse(rDate1);
	 	String rDate2 = "04-02-1995";
	 	Date rentedDate2= new SimpleDateFormat("MM-dd-yyyy"). parse(rDate2);
	 	String rDate3 = "02-08-2020";
	 	Date rentedDate3 = new SimpleDateFormat("MM-dd-yyyy"). parse(rDate3);
	 	Game rGame1 = new Game("God of War", "Game", rentedDate1, rentedDate1, "PS4", "Action/Adventure");
	 	Game rGame2 = new Game("The Legend of Zelda", "Game", rentedDate2, rentedDate2, "NES", "Adventure");
	 	Movie rMovie1 = new Movie("Planes, Trains, and Automobiles", "Movie", rentedDate3, rentedDate3, "92 mins", "Blu-Ray");
	 	Node rgNode1 = new Node(rGame1);
		boolean actual;
		// ACT
		myPQ.enqueue(rgNode1);
		actual = myPQ.isEmpty();
		// ASSERT
		assertFalse(actual);
	}

	@Test
	void testInsert() throws  ParseException {
		// ARRANGE
		MediaPriorityQueue myPQ = new MediaPriorityQueue();
		String rDate1 = "03-08-2021";
		Date rentedDate1 = new SimpleDateFormat("MM-dd-yyyy"). parse(rDate1);
	 	Game rGame1 = new Game("God of War", "Game", rentedDate1, rentedDate1, "PS4", "Action/Adventure");
	 	Node rgNode1 = new Node(rGame1);
		// ACT
		myPQ.enqueue(rgNode1);
		String actual, expected;
		// ACT
		actual = myPQ.get().toString();
		expected = "ID="+ myPQ.get().data.id + ", Type=Game, Title=God of War, System=PS4, Genre=Action/Adventure, Release Date=Mon Mar 08 00:00:00 CST 2021, Rented Date = Mon Mar 08 00:00:00 CST 2021";
		// ASSERT
		assertEquals(expected, actual);
	}
	
	@Test
	void testInsertRemove() throws ParseException {
		// ARRANGE
		MediaPriorityQueue myPQ = new MediaPriorityQueue();
		String rDate1 = "03-08-2021";
		Date rentedDate1 = new SimpleDateFormat("MM-dd-yyyy"). parse(rDate1);
	 	String rDate2 = "04-02-1995";
	 	Date rentedDate2= new SimpleDateFormat("MM-dd-yyyy"). parse(rDate2);
	 	String rDate3 = "02-08-2020";
	 	Date rentedDate3 = new SimpleDateFormat("MM-dd-yyyy"). parse(rDate3);
	 	Game rGame1 = new Game("God of War", "Game", rentedDate1, rentedDate1, "PS4", "Action/Adventure");
	 	Game rGame2 = new Game("The Legend of Zelda", "Game", rentedDate2, rentedDate2, "NES", "Adventure");
	 	Movie rMovie1 = new Movie("Planes, Trains, and Automobiles", "Movie", rentedDate3, rentedDate3, "92 mins", "Blu-Ray");
	 	Node rgNode1 = new Node(rGame1);
	 	Node rgNode2 = new Node(rGame2);
	 	Node rmNode1 = new Node(rMovie1);
		String actual, expected;
		// ACT
		myPQ.enqueue(rmNode1);
		myPQ.enqueue(rgNode2);
		myPQ.dequeue();
		myPQ.dequeue();
		myPQ.enqueue(rgNode1);
		actual = myPQ.get().toString();
		expected = "ID="+ myPQ.get().data.getId() + ", Type=Game, Title=God of War, System=PS4, Genre=Action/Adventure, Release Date=Mon Mar 08 00:00:00 CST 2021, Rented Date = Mon Mar 08 00:00:00 CST 2021";
		// ASSERT
		assertEquals(expected, actual);
	}	


	@Test
	void testRemove() throws ParseException {
		//ARRANGE
		MediaPriorityQueue myPQ = new MediaPriorityQueue();
		String rDate1 = "03-08-2021";
		Date rentedDate1 = new SimpleDateFormat("MM-dd-yyyy"). parse(rDate1);
	 	String rDate2 = "04-02-1995";
	 	Date rentedDate2= new SimpleDateFormat("MM-dd-yyyy"). parse(rDate2);
	 	String rDate3 = "02-08-2020";
	 	Date rentedDate3 = new SimpleDateFormat("MM-dd-yyyy"). parse(rDate3);
	 	Game rGame1 = new Game("God of War", "Game", rentedDate1, rentedDate1, "PS4", "Action/Adventure");
	 	Game rGame2 = new Game("The Legend of Zelda", "Game", rentedDate2, rentedDate2, "NES", "Adventure");
	 	Movie rMovie1 = new Movie("Planes, Trains, and Automobiles", "Movie", rentedDate3, rentedDate3, "92 mins", "Blu-Ray");
	 	Node rgNode1 = new Node(rGame1);
	 	Node rgNode2 = new Node(rGame2);
	 	Node rmNode1 = new Node(rMovie1);
		String actual, expected;
		// ACT
		myPQ.enqueue(rmNode1);
		myPQ.enqueue(rgNode2);
		myPQ.dequeue();
		myPQ.enqueue(rgNode1);
		actual = myPQ.get().toString();
		expected = "ID="+ myPQ.get().data.getId() + ", Type=Movie, Title=Planes, Trains, and Automobiles, Format=Blu-Ray, Run Time=92 mins, Release Date=Sat Feb 08 00:00:00 CST 2020, RentedDate=Sat Feb 08 00:00:00 CST 2020";
		// ASSERT
		assertEquals(expected, actual);
	}
	
/*	@Test TODO for edit
	void testReplace() throws LinkedListEmptyException, LinkedListFullException {
		//ARRANGE
		linkedlist myList = new linkedlist(2);
		double item1 = 2.4;
		double item2 = 3.5;
		double item3 = 4.3;
		double item4 = 5.6;
		double actual, expected;
		expected = item4;
		myList.insert(item2);
		myList.insert(item3);
		myList.replace(1,item4);
		// ACT
		actual = myList.get(2);
		// ASSERT
		assertEquals(expected, actual);
	}
	*/
	
	
	@Test
	void testSizeZero() {
		// ARRANGE
		MediaPriorityQueue myPQ = new MediaPriorityQueue();
		int actual, expected;
		expected = 0;
		// ACT
		actual = myPQ.size();
		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	void testSizeNonZero() throws ParseException {
		// ARRANGE
		MediaPriorityQueue myPQ = new MediaPriorityQueue();
		String rDate1 = "03-08-2021";
		Date rentedDate1 = new SimpleDateFormat("MM-dd-yyyy"). parse(rDate1);
	 	String rDate2 = "04-02-1995";
	 	Date rentedDate2= new SimpleDateFormat("MM-dd-yyyy"). parse(rDate2);
	 	String rDate3 = "02-08-2020";
	 	Date rentedDate3 = new SimpleDateFormat("MM-dd-yyyy"). parse(rDate3);
	 	Game rGame1 = new Game("God of War", "Game", rentedDate1, rentedDate1, "PS4", "Action/Adventure");
	 	Game rGame2 = new Game("The Legend of Zelda", "Game", rentedDate2, rentedDate2, "NES", "Adventure");
	 	Movie rMovie1 = new Movie("Planes, Trains, and Automobiles", "Movie", rentedDate3, rentedDate3, "92 mins", "Blu-Ray");
	 	Node rgNode1 = new Node(rGame1);
	 	Node rgNode2 = new Node(rGame2);
	 	Node rmNode1 = new Node(rMovie1);
		int actual, expected;
		// ACT
		myPQ.enqueue(rmNode1);
		myPQ.enqueue(rgNode2);
		myPQ.dequeue();
		myPQ.dequeue();
		myPQ.enqueue(rgNode1);
		expected = 1;
		// ASSERT
		actual = myPQ.size();
		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	void testGet() throws ParseException {
		// ARRANGE
		MediaPriorityQueue myPQ = new MediaPriorityQueue();
		String rDate1 = "03-08-2021";
		Date rentedDate1 = new SimpleDateFormat("MM-dd-yyyy"). parse(rDate1);
	 	String rDate2 = "04-02-1995";
	 	Date rentedDate2= new SimpleDateFormat("MM-dd-yyyy"). parse(rDate2);
	 	String rDate3 = "02-08-2020";
	 	Date rentedDate3 = new SimpleDateFormat("MM-dd-yyyy"). parse(rDate3);
	 	Game rGame1 = new Game("God of War", "Game", rentedDate1, rentedDate1, "PS4", "Action/Adventure");
	 	Game rGame2 = new Game("The Legend of Zelda", "Game", rentedDate2, rentedDate2, "NES", "Adventure");
	 	Movie rMovie1 = new Movie("Planes, Trains, and Automobiles", "Movie", rentedDate3, rentedDate3, "92 mins", "Blu-Ray");
	 	Node rgNode1 = new Node(rGame1);
	 	Node rgNode2 = new Node(rGame2);
	 	Node rmNode1 = new Node(rMovie1);
		String actual, expected;
		// ACT
		myPQ.enqueue(rmNode1);
		myPQ.enqueue(rgNode2);
		myPQ.enqueue(rgNode1);
		actual = myPQ.get().toString();
		expected = "ID="+ myPQ.get().data.getId() + ", Type=Game, Title=The Legend of Zelda, System=NES, Genre=Adventure, Release Date=Sun Apr 02 00:00:00 CST 1995, Rented Date = Sun Apr 02 00:00:00 CST 1995";
		// ASSERT
		assertEquals(expected, actual);
	}

}