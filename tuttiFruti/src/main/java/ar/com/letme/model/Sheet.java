package ar.com.letme.model;

import java.util.Set;

public class Sheet extends EntityBase {
	
	private Participant participant;
	
	private Set<Answer> answers;
	
	public void Answer(String description, Category category){
		Answer answer = new Answer(description, category);
		this.answers.add(answer);
	}
}
