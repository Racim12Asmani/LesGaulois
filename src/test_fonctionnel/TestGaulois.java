package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 16);
		asterix.parler("Bonjour Obélix");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chassser des sangliers ?)");
		asterix.parler("Oui très bonne idée.");
	}
}
