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
		Date rentedDate1 = new SimpleDateFormat("MM-dd-yyyy"). parse(rDate1);
	 	String rDate2 = "04-02-1995";
	 	Date rentedDate2= new SimpleDateFormat("MM-dd-yyyy"). parse(rDate2);
	 	String rDate3 = "02-08-2020";
	 	Date rentedDate3 = new SimpleDateFormat("MM-dd-yyyy"). parse(rDate3);
	 	Game rGame1 = new Game("God of War", "Game", date1, rentedDate1, "PS4", "Action/Adventure");
	 	Game rGame2 = new Game("The Legend of Zelda", "Game", date2, rentedDate2, "NES", "Adventure");
	 	Movie rMovie1 = new Movie("Planes, Trains, and Automobiles", "Movie", date3, rentedDate3, "92 mins", "Blu-Ray");
	 	Node rgNode1 = new Node(rGame1);
		boolean actual;
		// ACT
		myLL.append(rgNode1);
		actual = myPQ.isEmpty();
		// ASSERT
		assertFalse(actual);
	}

	@Test
	void testInsert() throws  ParseException {
		// ARRANGE
		MediaLinkedList myLL = new MediaLinkedList();
		String gDate1 = "04-20-2018";
	 	Date date1 = new SimpleDateFormat("MM-dd-yyyy"). parse(gDate1);
	 	Game game1 = new Game("God of War", "Game", date1, null, "PS4", "Action/Adventure");
	 	Node gNode1 = new Node(game1);
		// ACT
		myLL.append(gNode1);
		String actual, expected;
		expected = "ID="+ myLL.get(0).data.getId() + ", Type=Game, Title=God of War, System=PS4, Genre=Action/Adventure, Release Date=Fri Apr 20 00:00:00 CDT 2018, Rented Date = null";
		// ACT
		actual = myLL.get(0).toString();
		// ASSERT
		assertEquals(expected, actual);
	}
	
	@Test
	void testInsertRemove() throws ParseException {
		// ARRANGE
		MediaLinkedList myLL = new MediaLinkedList();
		String gDate1 = "04-20-2018";
	 	Date date1 = new SimpleDateFormat("MM-dd-yyyy"). parse(gDate1);
	 	String gDate2 = "08-27-1987";
	 	Date date2= new SimpleDateFormat("MM-dd-yyyy"). parse(gDate2);
	 	String mDate1 = "11-25-1987";
	 	Date date3 = new SimpleDateFormat("MM-dd-yyyy"). parse(mDate1);
	 	Game game1 = new Game("God of War", "Game", date1, null, "PS4", "Action/Adventure");
	 	Game game2 = new Game("The Legend of Zelda", "Game", date2, null, "NES", "Adventure");
	 	Movie movie1 = new Movie("Planes, Trains, and Automobiles", "Movie", date3, null, "92 mins", "Blu-Ray");
	 	Node gNode1 = new Node(game1);
	 	Node gNode2 = new Node(game2);
	 	Node mNode1 = new Node(movie1);
		String actual, expected;
		// ACT
		myLL.append(mNode1);
		myLL.append(gNode2);
		myLL.delete(0);
		myLL.delete(0);
		myLL.append(gNode1);
		actual = myLL.get(0).toString();
		expected = "ID="+ myLL.get(0).data.getId() + ", Type=Game, Title=God of War, System=PS4, Genre=Action/Adventure, Release Date=Fri Apr 20 00:00:00 CDT 2018, Rented Date = null";
		// ASSERT
		assertEquals(expected, actual);
	}	


	@Test
	void testRemoveAt() throws ParseException {
		//ARRANGE
		MediaLinkedList myLL = new MediaLinkedList();
		String gDate1 = "04-20-2018";
	 	Date date1 = new SimpleDateFormat("MM-dd-yyyy"). parse(gDate1);
	 	String gDate2 = "08-27-1987";
	 	Date date2= new SimpleDateFormat("MM-dd-yyyy"). parse(gDate2);
	 	String mDate1 = "11-25-1987";
	 	Date date3 = new SimpleDateFormat("MM-dd-yyyy"). parse(mDate1);
	 	Game game1 = new Game("God of War", "Game", date1, null, "PS4", "Action/Adventure");
	 	Game game2 = new Game("The Legend of Zelda", "Game", date2, null, "NES", "Adventure");
	 	Movie movie1 = new Movie("Planes, Trains, and Automobiles", "Movie", date3, null, "92 mins", "Blu-Ray");
	 	Node gNode1 = new Node(game1);
	 	Node gNode2 = new Node(game2);
	 	Node mNode1 = new Node(movie1);
		String actual, expected;
		myLL.append(gNode2);
		myLL.delete(0);
		myLL.append(gNode1);
		myLL.append(mNode1);
		myLL.append(gNode1);
		// ACT
		myLL.delete(1);
		expected = "ID="+ myLL.get(0).data.getId() + ", Type=Game, Title=God of War, System=PS4, Genre=Action/Adventure, Release Date=Fri Apr 20 00:00:00 CDT 2018, Rented Date = null";
		actual = myLL.get(1).toString();
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
		MediaLinkedList myLL = new MediaLinkedList();
		int actual, expected;
		expected = 0;
		// ACT
		actual = myLL.size();
		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	void testSizeNonZero() throws ParseException {
		// ARRANGE
		MediaLinkedList myLL = new MediaLinkedList();
		String gDate1 = "04-20-2018";
	 	Date date1 = new SimpleDateFormat("MM-dd-yyyy"). parse(gDate1);
	 	String gDate2 = "08-27-1987";
	 	Date date2= new SimpleDateFormat("MM-dd-yyyy"). parse(gDate2);
	 	String mDate1 = "11-25-1987";
	 	Date date3 = new SimpleDateFormat("MM-dd-yyyy"). parse(mDate1);
	 	Game game1 = new Game("God of War", "Game", date1, null, "PS4", "Action/Adventure");
	 	Game game2 = new Game("The Legend of Zelda", "Game", date2, null, "NES", "Adventure");
	 	Movie movie1 = new Movie("Planes, Trains, and Automobiles", "Movie", date3, null, "92 mins", "Blu-Ray");
	 	Node gNode1 = new Node(game1);
	 	Node gNode2 = new Node(game2);
	 	Node mNode1 = new Node(movie1);
		int actual, expected;
		expected = 2;
		// ACT
		myLL.append(gNode1);
		myLL.append(gNode2);
		myLL.append(mNode1);
		myLL.delete(1);
		actual = myLL.size();
		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	void testGet() throws ParseException {
		// ARRANGE
		MediaLinkedList myLL = new MediaLinkedList();
		String gDate1 = "04-20-2018";
	 	Date date1 = new SimpleDateFormat("MM-dd-yyyy"). parse(gDate1);
	 	String gDate2 = "08-27-1987";
	 	Date date2= new SimpleDateFormat("MM-dd-yyyy"). parse(gDate2);
	 	String mDate1 = "11-25-1987";
	 	Date date3 = new SimpleDateFormat("MM-dd-yyyy"). parse(mDate1);
	 	Game game1 = new Game("God of War", "Game", date1, null, "PS4", "Action/Adventure");
	 	Game game2 = new Game("The Legend of Zelda", "Game", date2, null, "NES", "Adventure");
	 	Movie movie1 = new Movie("Planes, Trains, and Automobiles", "Movie", date3, null, "92 mins", "Blu-Ray");
	 	Node gNode1 = new Node(game1);
	 	Node gNode2 = new Node(game2);
	 	Node mNode1 = new Node(movie1);
	 	String expected, actual;
		// ACT
		myLL.append(mNode1);
		myLL.append(gNode2);
		myLL.append(gNode1);
		expected = "ID="+ myLL.get(2).data.getId() + ", Type=Game, Title=God of War, System=PS4, Genre=Action/Adventure, Release Date=Fri Apr 20 00:00:00 CDT 2018, Rented Date = null";
		actual = myLL.get(2).toString();
		// ASSERT
		assertEquals(expected, actual);
	}

}