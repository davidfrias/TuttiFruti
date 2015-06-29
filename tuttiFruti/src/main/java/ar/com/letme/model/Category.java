package ar.com.letme.model;

import java.util.Set;

public class Category extends EntityBase {
	private String name;

	private Set<Challenge> challenges;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Challenge> getChallenges() {
		return challenges;
	}

	public void setChallenges(Set<Challenge> challenges) {
		this.challenges = challenges;
	}
}
