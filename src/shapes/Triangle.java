/**
 *
 */
package shapes;

/**
 * @author ALIKOU DONGMO NELSON
 *
 */
public class Triangle extends Shape{

	/**
	 * Taille du triangle
	 */
	private int size;

	/**
	 * Constructeur de la classe Triangle, vérifie si la taille est positive.
	 * @param size taille du rectangle
	 * @throws IllegalArgumentException
	 */
	public Triangle(int size) throws IllegalArgumentException{
		if(size < 0)
			throw new IllegalArgumentException("la hauteur est négative" + size);
		this.size = size;
	}

	/**
	 * Retourne le caractère utilisé pour le dessin
	 * @return le caractère de dessin
	 */
	public char getPen() {
		return super.getPen();
	}

	/**
	 * Assigne le caractère défini en paramètre comme nouveau caractère de dessin.
	 * @param pen nouveau caractère de dessin
	 */
	public void  setPen(char pen) {
		super.setPen(pen);
	}

	/**
	 * Retourne le mode de remplissage du triangle lors du dessin.
	 * @return boolean designant l'état de remplissage
	 */
	public boolean isFilled() {
		return super.isFilled();
	}

	/**
	 * Change le mode de remplissage du rectangle lors du dessin.
	 * @param filled nouveau mode de remplissage du triangle
	 */
	public void setFilled(boolean filled) {
		super.setFilled(filled);
	}


	/**
	 * Dessin du triangle avec le mode de remplissage défini.
	 */
	@Override
	public void draw() {
		String draw = "";

		//pour chaque point de hauteur
		for(int hauteur = 0; hauteur <= this.size; hauteur++) {
			//pour chaque point de largeur
			for(int largeur = 0; largeur < hauteur; largeur++) {
				//Si le mode de remplissage est sur plein on dessine juste le caractère, sinon il faut verifier si on est au défut ou à la fin du triangle ou à la première et dernière colonne à l'interieur du triangle et là on dessine le caractère (autrement on dessine un espace)
				if(isFilled()){
					draw += getPen();
				}else{
					if((hauteur == 0 || hauteur == this.size) ){
						draw += getPen();
					}else{
						if(largeur == 0 || largeur == hauteur-1){
							draw += getPen();
						}else{
							draw += " ";
						}
					}
				}

			}
			//retour à la ligne
			draw += "\n";
		}
	System.out.println(draw);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Triangle triangle = new Triangle(7);
		triangle.draw();
		triangle.setPen('*');
		triangle.setFilled(true);
		System.out.println();
		triangle.draw();

	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getSurface() {
		// TODO Auto-generated method stub
		return 0;
	}

}
