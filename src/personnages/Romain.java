package personnages;

public class Romain {
	private int force;
	private String nom;

	public Romain(String nom,int force) {
		this.nom = nom;
		this.force = force;
		isInvariantVerified();
	}
	
	private boolean isInvariantVerified() {
		return force >= 0;
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
		assert forceCoup >= 0 ;
		int forceAvantCoup = this.force;
		force -= forceCoup;
		if (force < 1) {
			force = 0;
			parler("J'abanadonne !");
		} else {
			parler("Aïe");
		}
		assert this.force <= forceAvantCoup;
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
	}
}
