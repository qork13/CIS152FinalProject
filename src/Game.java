import java.util.Date;

public class Game extends Media {
	String system;
	String genre;
	
	public Game(String title, String type, Date releaseDate, Date rentedDate, String system, String genre ) {
		super(title, type, releaseDate, rentedDate);
		this.system = system;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Game [system=" + system + ", genre=" + genre + ", title=" + title + ", type=" + type + ", releaseDate="
				+ releaseDate + ", rentedDate=" + rentedDate + "]";
	}

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
