package fr.kata.losange.griffoul.mathieu.utils;

import fr.kata.losange.griffoul.mathieu.bo.Diamond;

/**
 * Classe dans laquelle sont centralisés les affichages console
 * Created by mathieu_griffoul on 16/05/2018.
 */
public class Ihm {

	public void giveInstruction(){
		System.out.println("Saisissez une lettre de l'alphabet.");
	}

	public void sayInputIsInvalid(){
		System.out.println("Saisie incorrecte");
	}

	public void printDiamond(Diamond diamond){
		System.out.println("Votre losange :");
		for (String s : diamond.getLines()) {
			System.out.println(s);
		}
	}
}
