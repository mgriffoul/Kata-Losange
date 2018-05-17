package fr.kata.losange.griffoul.mathieu.service;

import fr.kata.losange.griffoul.mathieu.bo.Diamond;
import fr.kata.losange.griffoul.mathieu.builder.DiamondBuilder;
import fr.kata.losange.griffoul.mathieu.builder.VerticalStringBuilder;

/**
 * Created by mathieu_griffoul on 17/05/2018.
 */
public class DiamondService {

	private VerticalStringBuilder verticalStringBuilder = new VerticalStringBuilder();

	private DiamondBuilder diamondBuilder = new DiamondBuilder();

	public Diamond BuildDiamond(char c) {
		//construction de la première moitiée du losange
		String verticalCharLine = verticalStringBuilder.buildVerticalString(c);
		Diamond diamond = diamondBuilder.leftDiamondBuilder(verticalCharLine);
		//construction de la seconde moitiée
		diamondBuilder.rightDiamondBuilder(diamond);
		return diamond;
	}

}
