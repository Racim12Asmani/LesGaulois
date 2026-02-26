package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion;
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "les gaulois " + nom + " : ";
	}
	
	
}
