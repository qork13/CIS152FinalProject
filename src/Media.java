import java.util.Date;
import java.util.Random;

public class Media {
	
	public int id;
	public String title;
	public String type;
	public Date releaseDate;
	public Date rentedDate;
	
	
	public Media(String title, String type, Date releaseDate) {
		
		this.id = new Random().nextInt((1000-1)+1);
		this.title = title;
		this.type = type;
		this.releaseDate = releaseDate;
		this.rentedDate = null;
	}
	
	public Media(String title, String type, Date releaseDate, Date rentedDate) {
		
		this.id = new Random().nextInt((1000-1)+1);
		this.title = title;
		this.type = type;
		this.releaseDate = releaseDate;
		this.rentedDate = rentedDate;
	}
	

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
