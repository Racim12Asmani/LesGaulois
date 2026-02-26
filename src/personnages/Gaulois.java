package personnages;

public class Gaulois {
	private String nom;
	private int force;
	
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
		return "les gaulois " + nom + " : ";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 16);
		
		
	}
}
