package fr.kata.losange.griffoul.mathieu.run;

import fr.kata.losange.griffoul.mathieu.bo.Diamond;
import fr.kata.losange.griffoul.mathieu.builder.DiamondBuilder;
import fr.kata.losange.griffoul.mathieu.builder.VerticalStringBuilder;
import fr.kata.losange.griffoul.mathieu.utils.Ihm;
import fr.kata.losange.griffoul.mathieu.utils.KeyboardInputUtil;
import fr.kata.losange.griffoul.mathieu.validator.InputValidator;

/**
 * Created by mathieu_griffoul on 16/05/2018.
 */
public class AppRunner {

	public static void main(String[] args) {

		//Injections manuelles
		KeyboardInputUtil keyboardInputUtil = new KeyboardInputUtil();
		InputValidator inputValidator = new InputValidator();
		Ihm ihm = new Ihm();
		VerticalStringBuilder verticalStringBuilder = new VerticalStringBuilder();
		DiamondBuilder diamondBuilder = new DiamondBuilder();

		ihm.giveInstruction();

		String input = keyboardInputUtil.askForInput();

		//Validation de la saisie pour n'accepter qu'un seul caractère en minuscule
		while (inputValidator.isInputInvalid(input)) {
			ihm.sayInputIsInvalid();
			ihm.giveInstruction();
			input = keyboardInputUtil.askForInput();
		}

		//Cas de la saisie égale à "a"
		if("a".equals(input)){
			ihm.aCasePrint();
		}

		//construction de la première moitiée du losange
		String verticalCharLine = verticalStringBuilder.buildVerticalString(input.charAt(0));
		Diamond diamond = diamondBuilder.halfDiamondBuilder(verticalCharLine);
		//construction de la seconde moitiée
		diamondBuilder.buildFullDiamond(diamond);

		//affichage du losange
		ihm.printDiamond(diamond);
		keyboardInputUtil.closeScannerResource();
	}


}
