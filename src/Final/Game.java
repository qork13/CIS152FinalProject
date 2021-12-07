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
* Description : This class is a subclass to the Media.java and adds the system and genre fields for a video game object. I also has 
* getters and setters as well as a ToString to print the object.
* 
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/
import java.util.Date;

public class Game extends Media {
	/**
	 * Game specific variables
	 */
	String system;
	String genre;
	
	/**
	 * Constructor for Game object that uses the superclass variables to fill in the title, type, releaseDate and rentedDate
	 * @param title
	 * @param type
	 * @param releaseDate
	 * @param rentedDate
	 * @param system
	 * @param genre
	 */
	public Game(String title, String type, Date releaseDate, Date rentedDate, String system, String genre ) {
		super(title, type, releaseDate, rentedDate);
		this.system = system;
		this.genre = genre;
	}
	
	/**
	 * To string to print object
	 */
	@Override
	public String toString() {
		return "ID=" + getId() + ", Type=" + type + ", Title=" + title +", System=" + system + ", Genre=" + genre +
				 ", Release Date=" + releaseDate + ", Rented Date = " + rentedDate;
	}

	/**
	 * Getters and setters for system and genre
	 */
	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
