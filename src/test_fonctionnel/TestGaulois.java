package test_fonctionnel;

import java.util.Iterator;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 16);
		Romain minus = new Romain(6, "Minus");
		Romain brutus = new Romain(2, "Brutus");
		Druide panoramix = new Druide("Panoramix", 2);

		asterix.parler("Bonjour Obélix");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chassser des sangliers ?)");
		asterix.parler("Oui très bonne idée.");
		System.out.println("Dans la forêt," + asterix.getNom() + "  et " + obelix.getNom()
				+ " tombent nez à nez sur le romain " + minus.getNom());
		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}

		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);

		for (int i = 0; i < 3; i++) {
			asterix.frapper(brutus);
		}
	}
}
