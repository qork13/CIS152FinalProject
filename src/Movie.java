import java.util.Date;

public class Movie extends Media{
	int runTime;
	String format;
	
	public Movie(String title, String type, Date releaseDate, Date rentedDate, int runTime, String format) {
		super(title, type, releaseDate, rentedDate);
		this.runTime = runTime;
		this.format = format;
	}

	public int getRunTime() {
		return runTime;
	}

	@Override
	public String toString() {
		return "Movie [runTime=" + runTime + ", format=" + format + ", title=" + title + ", type=" + type
				+ ", releaseDate=" + releaseDate + ", rentedDate=" + rentedDate + "]";
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

}
