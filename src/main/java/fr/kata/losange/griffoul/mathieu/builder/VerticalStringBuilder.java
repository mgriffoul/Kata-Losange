package fr.kata.losange.griffoul.mathieu.builder;

/**
 * Created by mathieu_griffoul on 16/05/2018.
 */
public class VerticalStringBuilder {

	/**
	 * Méthode qui construit la séquence de lettres dont sera composé le côté du losange d'une pointe à l'autre
	 * @param c
	 * @return
	 */
	public String buildVerticalString(char c){
		String verticalCharLine = "";
		char startChar = 'a';

		while (startChar <= c) {
			verticalCharLine += startChar;
			startChar++;
		}

		startChar--;

		while (startChar > 'a') {
			startChar--;
			verticalCharLine += startChar;
		}

		return verticalCharLine;
	}


}