/**
 *
 */
package enums;

/**
 * @author ALIKOU DONGMO NELSON
 *
 */
public enum Color {
	NOIR(0,0,0), BLANC(255,255,255), ROUGE(255,0,0),ORANGE(255,128,0), MARRON(91,60,17);

	private final int red, green, blue ;

	private Color(int red, int green, int blue) {
		this.red = red ;
		this.green = green ;
		this.blue = blue ;
	}

	public int getRed() {
		return this.red ;
	}

	public int getGreen() {
		return this.green ;
	}

	public int getBlue() {
		return this.blue ;
	}

	public String getDescription(Color c) {
		String res ;
		switch ( c ) {
			case NOIR : res = "Noir comme l'ébène" ;
			break ;
			case BLANC : res = "Blanc comme neige" ;
			break ;
			case ORANGE : case MARRON : res = "Couleur ou fruit ?" ;
			break ;
			default : res = "Couleur non traitée" ;
			break ;
			}
		return res ;
	}

}