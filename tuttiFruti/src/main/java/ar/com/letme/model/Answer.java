package ar.com.letme.model;

public class Answer extends EntityBase {
	
	private String description;
	
	private Category category;
	
	private int score;
	
	public Answer(String description, Category category){
		this.description = description;
		this.category = category;
	}
}
