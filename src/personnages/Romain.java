package personnages;

public class Romain {
	private int force;
	private String nom;
	
	private boolean isInvariantVerified() {
		return force >= 0;
	}

	public Romain(String nom,int force) {
		this.nom = nom;
		this.force = force;
		isInvariantVerified();
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force < 1) {
			force = 0;
			parler("J'abanadonne !");
		} else {
			parler("Aïe");
		}

	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", -6);
	}
}
