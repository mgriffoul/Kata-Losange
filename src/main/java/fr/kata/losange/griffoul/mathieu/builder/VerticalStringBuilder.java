package fr.kata.losange.griffoul.mathieu.builder;

/**
 * Created by mathieu_griffoul on 16/05/2018.
 */
public class VerticalStringBuilder {

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
