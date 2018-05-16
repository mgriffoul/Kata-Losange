package fr.kata.losange.griffoul.mathieu.builder;

import java.util.ArrayList;
import java.util.List;

import fr.kata.losange.griffoul.mathieu.bo.Diamond;

/**
 * Created by mathieu_griffoul on 16/05/2018.
 */
public class DiamondBuilder {


	/**
	 * Méthode qui construit la première moitié du losange à partir de la séquence de lettre verticale induite par la saisie de l'utilisateur.
	 * On calcul pour chaque ligne le nombre d'espace à rajouter avant le caractère de la ligne pour former un demi losange.
	 * @param verticalCharLine
	 * @return
	 */
	public Diamond halfDiamondBuilder(String verticalCharLine) {

		List<String> lines = new ArrayList<>();

		int spaceNumberToAdd = verticalCharLine.length() / 2;
		boolean decroissant = true;

		for (int i = 0; i < verticalCharLine.length(); i++) {

			char c = verticalCharLine.charAt(i);
			String s = "";
			int compteur = 0;

			while (compteur < spaceNumberToAdd) {
				s += " ";
				compteur++;
			}

			s += String.valueOf(c);
			lines.add(s);

			if (decroissant) {
				spaceNumberToAdd--;
			} else {
				spaceNumberToAdd++;
			}

			if (spaceNumberToAdd == 0) {
				decroissant = false;
			}

		}

		return new Diamond(lines);
	}

	/**
	 * Méthode qui construit la deuxième moitié du losange à partir d'un losange à moitié formé
	 * On calcul pour chaque ligne le nombre d'espace à rajouter après le caractère, puis on ajoute en fin de ligne le même caractère.
	 * @param diamond
	 * @return
	 */
	public void buildFullDiamond(Diamond diamond) {

		List<String> newLines = new ArrayList<>();
		List<String> lines = diamond.getLines();

		newLines.add(lines.get(0));

		boolean decroissant = false;

		for (int i = 1; i < lines.size() - 1; i++) {

			String currentLine = lines.get(i);
			char charToAdd = lines.get(i).charAt(lines.get(i).length() - 1);

			if (!decroissant) {
				while (currentLine.length() < newLines.get(i - 1).length()) {
					currentLine += " ";
				}
			} else {
				while (currentLine.length() < newLines.get(i - 1).length() - 2) {
					currentLine += " ";
				}
			}

			currentLine += charToAdd;

			if (i >= lines.size() / 2) {
				decroissant = true;
			}

			newLines.add(currentLine);
		}

		newLines.add(lines.get(lines.size() - 1));
		diamond.setLines(newLines);
	}

}
