package fr.kata.losange.griffoul.mathieu.utils;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

/**
 * Classe utilitaire pour les saisies clavier
 * Created by mathieu_griffoul on 16/05/2018.
 */
public class KeyboardInputUtil implements Closeable{

	private Scanner keyboardInput;

	public KeyboardInputUtil() {
		this.keyboardInput = new Scanner(System.in);
	}

	/**
	 * Méthode demandant la saisie utilisateur au clavier
	 * @return
	 */
	public String askForInput(){
		String s = keyboardInput.nextLine();
		return s;
	}

	@Override
	public void close() throws IOException {
		keyboardInput.close();
	}

}
