package ar.com.letme.model.enums;

public enum GameStatus {
	INPROGRESS(0), DONE(1);
	
	private int value;
	
	private GameStatus(int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
}
