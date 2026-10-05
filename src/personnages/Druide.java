package personnages;


public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	public String getNom() {
		return nom;
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+ "\"" + texte+ "\"");
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté" + quantite + "doses de potions magiques. Elle a une force de " + forcePotion + ".");
	}
	
	public void booster(Gaulois gaulois) {
		
	}
	
}
