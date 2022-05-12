package classandmethods;

public class Movie {
	private  String movieName;
	private int yearOfmovie;
	private String language;
	private String actorName;
	
	

	public int getyearOfmovie() {
		return yearOfmovie;
	}

	public void setyearOfmovie(int yearOfmovie) {
		this.yearOfmovie = yearOfmovie;
	}

	public String getlanguage() {
		return language;
	}
	public void setlanguage(String language) {
		this.language = language;
	}

	public String getactorName() {
		return actorName;
	}

	public void setactorName(String actorName) {
		this.actorName = actorName;
	}

	public String getmovieName() {
		return movieName;
	}

	public void setmovieName(String movieName) {
		this.movieName = movieName;
	}

}

