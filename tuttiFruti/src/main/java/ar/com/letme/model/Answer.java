package ar.com.letme.model;

public class Answer extends EntityBase {
	
	private String description;
	
	private Category category;
	
	private int score;
	
	public Answer(String description, Category category){
		this.description = description;
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
