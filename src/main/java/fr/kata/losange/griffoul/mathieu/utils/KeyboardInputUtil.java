package fr.kata.losange.griffoul.mathieu.utils;

import java.util.Scanner;

/**
 * Classe utilitaire pour les saisies clavier
 * Created by mathieu_griffoul on 16/05/2018.
 */
public class KeyboardInputUtil {

	/**
	 * Méthode
	 * @return
	 */
	public String askForInput(){
		Scanner keyboardInput = new Scanner(System.in);
		String s = keyboardInput.nextLine();
		keyboardInput.close();
		return s;
	}


}
