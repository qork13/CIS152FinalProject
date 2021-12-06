/**************************************************************
* Name        : Final Project Media Program
* Author      : Mike Smith
* Created     : 12/3/2021
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This class is the Media superclass that Game and Movie will use to build their objects.
* 
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/

import java.util.Date;
import java.util.Random;

public class Media {
	/**
	 * Media variables that Game and Movie share
	 */
	
	public int id;
	public String title;
	public String type;
	public Date releaseDate;
	public Date rentedDate;
	
	
	/**
	 * Constructor without rented date and assigning random id for sort functionality
	 * @param title
	 * @param type
	 * @param releaseDate
	 */
	public Media(String title, String type, Date releaseDate) {
		
		this.id = new Random().nextInt((1000-1)+1);
		this.title = title;
		this.type = type;
		this.releaseDate = releaseDate;
		this.rentedDate = null;
	}
	
	/**
	 * Constructor with rented date 
	 * @param title
	 * @param type
	 * @param releaseDate
	 * @param rentedDate
	 */
	public Media(String title, String type, Date releaseDate, Date rentedDate) {
		
		this.id = new Random().nextInt((1000-1)+1);
		this.title = title;
		this.type = type;
		this.releaseDate = releaseDate;
		this.rentedDate = rentedDate;
	}
	
	/**
	 * Getters and setters for id, title, type, release date and rented date. NOTE: id is only a getter since it is being randomly set
	 * @return
	 */
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Date getRentedDate() {
		return rentedDate;
	}

	public void setRentedDate(Date rentedDate) {
		this.rentedDate = rentedDate;
	}
	
	
}
