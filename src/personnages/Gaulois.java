package personnages;

import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;

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
		return "le gaulois " + nom + " : ";
	}

	@Override
	public String toString() {
		return nom;
	}

	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + "envoie un grand coup dans la mâchoire de " + nomRomain);
		int forceCoup = (force * effetPotion) / 3;
		romain.recevoirCoup(forceCoup);

		if (effetPotion > 1) {
			effetPotion -= effetPotion;
		}
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
		System.out.println("Le Gaulois" + nom + " : \"Bonjour, je m'appel " + nom +".");
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
