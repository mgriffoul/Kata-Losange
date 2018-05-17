package fr.kata.losange.griffoul.mathieu.bo;

import java.util.List;

/**
 * Created by mathieu_griffoul on 16/05/2018.
 */
public class Diamond {

	/**
	 * Liste contenant chacune des lignes du losange dans l'ordre d'affichage
	 */
	private List<String> lines;

	public Diamond(List<String> lines) {
		this.lines = lines;
	}

	public List<String> getLines() {
		return lines;
	}

	public void setLines(List<String> lines) {
		this.lines = lines;
	}

}
