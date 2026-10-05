package personnages;



public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	private Druide druide;
	
	public void remplirChaudron(int quantite, int forcePotion) {
		quantitePotion+=quantite;
		forcePotion+=forcePotion;
		;
	}
	
	public boolean resterPotion(int quantite) {
		return quantite != 0;
	}
	
	public int prendreLouche() {
		if(quantitePotion == 0) {
			forcePotion = 0;
		} else {
			quantitePotion --;
		}
		return quantitePotion;
	}
}
