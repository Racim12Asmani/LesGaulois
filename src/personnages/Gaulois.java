package personnages;

import objets.Equipement;

import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private Village village;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] tropheesLocal = romain.recevoirCoup((force / 3) * effetPotion);
		effetPotion--;
		if (effetPotion < 1) {
			effetPotion = 1;
		}
		for (int i = 0; tropheesLocal != null && i < tropheesLocal.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = tropheesLocal[i];
		}
		return;
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix);
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	public void sePresenter() {
		System.out.println("Le Gaulois" + nom + " : \"Bonjour, je m'appel " + nom + ".");
		if (village != null) {
			if (village.getChef() != null && village.getChef().getNom().equals(this.nom)) {
				System.out.println("Je suis le chef du village " + village.getNom() + ".\"");
			} else {
				System.out.println("J'habite le village : " + village.getNom() + ".");
			}
		} else {
			System.out.println("Je voyage de villages en villages");
		}
	}
}
