package shapes;

public interface Shape extends Comparable<Shape>{

	/**
	 * Dessin de la figure avec le mode de remplissage défini.
	 */
	void draw();

	/**
	 * Calcul du périmètre de la figure
	 * @return le prérimètre de la figure
	 */
	double getPerimeter();

	/**
	 * Calcul de la surface de la figure
	 * @return la surface de la figure
	 */
	double getSurface();

}