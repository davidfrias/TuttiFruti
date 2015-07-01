package ar.com.letme.model;

import java.util.Date;
import java.util.Set;

import ar.com.letme.model.enums.GameStatus;

public class Game extends EntityBase{
	
	private Challenge challenge;
	
	private char letter;
	
	private Date startDate;
	
	private Set<Sheet> sheets;
	
	private GameStatus status;
}
