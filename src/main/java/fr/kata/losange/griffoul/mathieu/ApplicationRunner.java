package fr.kata.losange.griffoul.mathieu;

import java.io.IOException;

import fr.kata.losange.griffoul.mathieu.service.DiamondService;
import fr.kata.losange.griffoul.mathieu.utils.ConsoleDisplayerUtil;
import fr.kata.losange.griffoul.mathieu.utils.KeyboardInputUtil;
import fr.kata.losange.griffoul.mathieu.validator.InputValidator;

/**
 * Created by mathieu_griffoul on 16/05/2018.
 */
public class ApplicationRunner {

	public static void main(String[] args) throws IOException {

		//Injections
		KeyboardInputUtil keyboardInputUtil = new KeyboardInputUtil();
		InputValidator inputValidator = new InputValidator();
		ConsoleDisplayerUtil consoleDisplayerUtil = new ConsoleDisplayerUtil();
		DiamondService diamondService = new DiamondService();

		consoleDisplayerUtil.giveInstruction();

		String input = keyboardInputUtil.askForInput();

		//Validation de la saisie pour n'accepter qu'un seul caractère en minuscule
		while (!inputValidator.isInputValid(input)) {
			consoleDisplayerUtil.sayInputIsInvalid();
			consoleDisplayerUtil.giveInstruction();
			input = keyboardInputUtil.askForInput();
		}

		//Cas de la saisie égale à "a"
		if ("a".equals(input)) {
			consoleDisplayerUtil.aCasePrint();
		}

		//construction et affichage du losange
		consoleDisplayerUtil.printDiamond(diamondService.BuildDiamond(input.charAt(0)));

		keyboardInputUtil.close();
	}


}
