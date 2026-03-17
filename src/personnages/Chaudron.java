package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;

	public boolean resterPotion() {
		return quantitePotion > 0;
	}

	public void remplirChaudron(int quantite, int forcePotion) {
		this.forcePotion = forcePotion;
		this.quantitePotion = quantite;
	}

	public int prendreLouche() {
		if (quantitePotion > 1) {
			quantitePotion -= quantitePotion;
			return forcePotion;
		} else {
			return 0;
		}
	}
}
