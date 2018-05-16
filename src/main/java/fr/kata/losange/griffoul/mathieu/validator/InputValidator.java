package fr.kata.losange.griffoul.mathieu.validator;

/**
 * Created by mathieu_griffoul on 16/05/2018.
 */
public class InputValidator {

	/**
	 * Méthode de validation de la saisie
	 * Renvoie vrai si la saisie N'EST PAS valide
	 * @param input
	 * @return
	 */
	public boolean isInputInvalid(String input){
		return !input.matches("[a-z]");
	}

}
