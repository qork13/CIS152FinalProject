import java.util.Date;

public class Movie extends Media{
	String runTime;
	String format;
	
	public Movie(String title, String type, Date releaseDate, Date rentedDate, String runTime, String format) {
		super(title, type, releaseDate, rentedDate);
		this.runTime = runTime;
		this.format = format;
	}

	public String getRunTime() {
		return runTime;
	}

	@Override
	public String toString() {
		return "Movie [runTime=" + runTime + ", format=" + format + ", id=" + id +", title=" + title + ", type=" + type
				+ ", releaseDate=" + releaseDate + ", rentedDate=" + rentedDate + "]";
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
