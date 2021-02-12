/**
 *
 */
package collections;

import java.awt.Color;
import java.util.HashMap;

/**
 * @author ALIKOU DONGMO NELSON
 *
 */
public class TestHashMap {

	public static void main(String [] args) {
		HashMap<String,Color> map = new HashMap<>();

		map.put("bleu",  Color.BLUE);
		map.put("rouge", Color.RED);
		map.put("vert",  Color.GREEN);

		System.out.println("Map :              " + map);
		System.out.println("Taille :           " + map.size());

		System.out.println("Elément pour vert :" + map.get("vert"));
		System.out.println("Elément pour noir :" + map.get("noir"));

		for (String key : map.keySet())
			System.out.println("Clé : " + key);

		for (Color color : map.values())
			System.out.println("Valeur : " + color);

		map.remove("bleu");
		System.out.println("Elément pour bleu :" + map.get("bleu"));

	}

}
