package fr.kata.losange.griffoul.mathieu.utils;

import java.util.Scanner;

/**
 * Classe utilitaire pour les saisies clavier
 * Created by mathieu_griffoul on 16/05/2018.
 */
public class KeyboardInputUtil {

	private static Scanner keyboardInput = new Scanner(System.in);

	/**
	 * Méthode demandant la saisie utilisateur au clavier
	 * @return
	 */
	public String askForInput(){
		String s = keyboardInput.nextLine();
		return s;
	}

	/**
	 * Méthode de cloture des ressources du Scanner
	 */
	public void closeScannerResource(){
		keyboardInput.close();
	}

}
