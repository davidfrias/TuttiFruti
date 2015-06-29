package ar.com.letme.model;

import java.util.Set;

public class Challenge extends EntityBase {
	
	private String name;
	
	private int allowedGames;
	
	private Set<Category> categories;
	
	private Set<Game> games;
}
