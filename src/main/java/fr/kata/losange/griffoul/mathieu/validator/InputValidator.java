package fr.kata.losange.griffoul.mathieu.validator;

/**
 * Created by mathieu_griffoul on 16/05/2018.
 */
public class InputValidator {

	public boolean isInputValid(String input){
		return !input.matches("[a-z]");
	}

}
