package cinemaApp;

public class Movie {
	
	//variables
	private int id;
	private String title;
	private String genre;
	private String cast;
	private String director;
	private String producer;
	private String description;
	private String trailerPic;
	private String trailerVideo;
	private String MPAA_rating;
	
	//constructor
	public Movie(int id, String title, String genre, String cast, String director, String producer,
			String description, String pic, String video, String rating) {
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.cast = cast;
		this.director = director;
		this.producer = producer;
		this.description = description;
		trailerPic = pic;
		trailerVideo = video;
		MPAA_rating = rating;
	}
	
	//setters
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setCast(String cast) {
		this.cast = cast;
	}
	
	public void setDirector(String dir) {
		director = dir;
	}
	
	public void setProducer(String prod) {
		producer = prod;
	}
	
	public void setDescription(String desc) {
		description = desc;
	}
	
	public void setTrailerPic(String pic) {
		trailerPic = pic;
	}
	
	public void setTrailerVideo(String vid) {
		trailerVideo = vid;
	}
	
	public void setRating(String rating) {
		MPAA_rating = rating;
	}
	
	//getters
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public String getCast() {
		return cast;
	}
	
	public String getDirector() {
		return director;
	}
	
	public String getProducer() {
		return producer; 
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getTrailerPic() {
		return trailerPic;
	}
	
	public String getTrailerVid() {
		return trailerVideo;
	}
	
	public String getRating() {
		return MPAA_rating;
	}
}
