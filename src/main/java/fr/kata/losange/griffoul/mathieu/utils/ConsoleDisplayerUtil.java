package fr.kata.losange.griffoul.mathieu.utils;

import fr.kata.losange.griffoul.mathieu.bo.Diamond;

/**
 * Classe dans laquelle sont centralisés les affichages console
 * Created by mathieu_griffoul on 16/05/2018.
 */
public class ConsoleDisplayerUtil {

	public void giveInstruction() {
		System.out.println("Saisissez une lettre de l'alphabet.");
	}

	public void sayInputIsInvalid() {
		System.out.println("Saisie incorrecte");
	}

	/**
	 * Méthode d'affichage d'un losange
	 *
	 * @param diamond
	 */
	public void printDiamond(Diamond diamond) {
		System.out.println("Votre losange :");
		for (String s : diamond.getLines()) {
			System.out.println(s);
		}
	}

	/**
	 * Dans le cas où l'utilisateur a saisi "a", il n'y a pas de losange à construire. On affiche "a" et on sort du programme.
	 */
	public void aCasePrint() {
		System.out.println("a");
		System.exit(0);
	}

}
