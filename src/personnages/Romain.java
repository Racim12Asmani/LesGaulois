package personnages;

public class Romain {
	private int force;
	private String nom;
	public Romain(int force, String nom) {
		this.force = force;
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Les gaullois " + nom + " : ";
	}
}
