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
	 *
	 * @param verticalCharLine
	 * @return
	 */
	public Diamond halfDiamondBuilder(String verticalCharLine) {

		List<String> lines = new ArrayList<>();
		int spaceToAdd = verticalCharLine.length() / 2;

		//permet de savoir à quel moment le programme a atteint la pointe gauche du losange
		boolean decroissant = true;

		for (int i = 0; i < verticalCharLine.length(); i++) {
			String s = "";
			int addedSpace = 0;

			//construction d'une ligne avec le bon nombre d'espace, puis ajout du caractère adequat
			for (int j = addedSpace; j < spaceToAdd; j++) {
				s += " ";
			}
			s += String.valueOf(verticalCharLine.charAt(i));

			lines.add(s);

			/*Tant que l'on a pas atteint la pointe gauche du losange, on décrémente le nombre d'espaces à ajouter.
			Une fois la pointe atteinte, on incrémente jusqu'à la dernière ligne
			Losrque spaceToAdd = 0, c'est qu'on atteint la pointe gauche du losange*/
			if (decroissant) {
				spaceToAdd--;
			} else {
				spaceToAdd++;
			}
			if (spaceToAdd == 0) {
				decroissant = false;
			}

		}

		return new Diamond(lines);
	}

	/**
	 * Méthode qui construit la deuxième moitié du losange à partir d'un losange à moitié formé
	 * On calcul pour chaque ligne le nombre d'espace à rajouter après le caractère, puis on ajoute en fin de ligne le même caractère.
	 *
	 * @param diamond
	 * @return
	 */
	public void buildFullDiamond(Diamond diamond) {

		List<String> halfLines = diamond.getLines();
		List<String> fullLines = new ArrayList<>();

		//La première ligne ne contient qu'un seul caractère. On l'ajoute directement.
		fullLines.add(halfLines.get(0));

		//permet de savoir à quel moment le programme a atteint la pointe droite du losange
		boolean decroissant = true;

		for (int i = 1; i < halfLines.size() - 1; i++) {

			String currentLine = halfLines.get(i);

			/*Tant que l'on a pas atteint la pointe gauche du losange,
			il faut ajouter des espaces tant que la longueur de la ligne en construction n'est pas egale à la longueur de la ligne du dessus (sans le caractère de fin)
			*/
			/*Lorsque l'on a atteint la pointe gauche du losange,
			il faut ajouter des espaces tant que la longueur de la ligne en construction n'est pas egale à la longueur de la ligne du dessus - 2 (sans le caractère de fin)
			*/
			if (decroissant) {
				while (currentLine.length() < fullLines.get(i - 1).length()) {
					currentLine += " ";
				}
			} else {
				while (currentLine.length() < fullLines.get(i - 1).length() - 2) {
					currentLine += " ";
				}
			}

			//Ajout du caractère de fin de ligne adequat
			currentLine += halfLines.get(i).charAt(halfLines.get(i).length() - 1);

			//Lorsque cette condition est remplie, c'est qu'on atteint la pointe gauche du losange
			if (i >= halfLines.size() / 2) {
				decroissant = true;
			}

			fullLines.add(currentLine);
		}

		//Idem que la première ligne, la dernière ligne est ajoutée sans traitement
		fullLines.add(halfLines.get(halfLines.size() - 1));

		diamond.setLines(fullLines);
	}

}
