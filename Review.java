
public class Review {
	private int reviewId;
	private int writerId;
	private String review;
	private int stars;
	
	public Review(int reviewId, int writerId, String review, int stars) {
		this.reviewId = reviewId;
		this.writerId = writerId;
		this.review = review;
		this.stars = stars;
	}
	
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	
	public void setWriterId(int writerId) {
		this.writerId = writerId;
	}
	
	public void setReview(String review) {
		this.review = review;
	}
	
	public void setStars(int stars) {
		this.stars = stars;
	}
	
	public int getReviewId() {
		return reviewId;
	}
	
	public int getWriterId() {
		return writerId;
	}
	
	public String getReview() {
		return review;
	}
	
	public int getStars() {
		return stars;
	}
}
