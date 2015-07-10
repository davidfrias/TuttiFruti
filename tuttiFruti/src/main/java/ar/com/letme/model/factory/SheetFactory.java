package ar.com.letme.model.factory;

import ar.com.letme.dto.NewSheetRequestDTO;
import ar.com.letme.model.Participant;
import ar.com.letme.model.Sheet;

public class SheetFactory {
	
	public Sheet create(NewSheetRequestDTO request){
		Participant participant = new Participant();
		Sheet sheet = new Sheet(participant);
		return sheet;
	}
}
