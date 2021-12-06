/**************************************************************
* Name        : Final Project Media Program
* Author      : Mike Smith
* Created     : 12/3/2021
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This class is a subclass of the Media.java that will add the runtime and format since it is a movie.
* 
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/
import java.util.Date;

public class Movie extends Media {
	/**
	 * Movie specific variables
	 */
	String runTime;
	String format;
	
	/**
	 * Constructor that will pull in everything from the Media object and add the runtime and format
	 * @param title
	 * @param type
	 * @param releaseDate
	 * @param rentedDate
	 * @param runTime
	 * @param format
	 */
	public Movie(String title, String type, Date releaseDate, Date rentedDate, String runTime, String format) {
		super(title, type, releaseDate, rentedDate);
		this.runTime = runTime;
		this.format = format;
	}

	/**
	 * ToString to print object
	 */
	@Override
	public String toString() {
		return "Id=" + getId() + ", Type=" + type + ", Title=" + title +", Format=" + format + ", Run Time=" + runTime
				+ ", Release Date=" + releaseDate + ", RentedDate=" + rentedDate;
	}

	/**
	 * Getters and setters for runtime and format
	 * @return
	 */
	public String getRunTime() {
		return runTime;
	}
	
	public void setRunTime(String runTime) {
		this.runTime = runTime;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

}
