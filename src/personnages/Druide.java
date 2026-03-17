package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "le Druide " + nom + " : ";
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concoté" + quantite + "doses de potion magique. Elle a une force de " + forcePotion + ".");
	}

	public void booster(Gaulois gaulois) {
		String nomGaulois = gaulois.getNom();
		if (chaudron.resterPotion()) {
			if (nom == "Obélix") {
				parler("Non," + nomGaulois + "Non !... Et tu le sais tres bien");
			} else {
				int forcePotion = chaudron.prendreLouche();
				gaulois.boirePotion(forcePotion);
				parler("Tiens " + nomGaulois + " un peu de potion magique.");
			}
		} else {
			parler ("Désolé, " + nomGaulois + "il n'y a plus une seule goiute de potion ");
		}

	}
}
