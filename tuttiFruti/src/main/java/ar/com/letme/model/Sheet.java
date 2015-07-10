package ar.com.letme.model;

import java.util.HashSet;
import java.util.Set;

public class Sheet extends EntityBase {
	
	private Participant participant;
	
	private Set<Answer> answers;
	
	public Sheet(Participant participant){
		this.participant = participant;
		this.answers = new HashSet<Answer>();
	}
	
	public void Answer(String description, Category category){
		Answer answer = new Answer(description, category);
		this.answers.add(answer);
	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public Set<Answer> getAnswers() {
		return answers;
	}

//	public void setAnswers(Set<Answer> answers) {
//		this.answers = answers;
//	}
}