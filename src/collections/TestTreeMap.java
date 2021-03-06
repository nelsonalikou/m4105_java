/**
 *
 */
package collections;

import java.awt.Color;
import java.util.TreeMap;

/**
 * @author ALIKOU DONGMO NELSON
 *
 */
public class TestTreeMap {

	public static void main(String [] args) {
		TreeMap<String,Color> map = new TreeMap<>();

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
