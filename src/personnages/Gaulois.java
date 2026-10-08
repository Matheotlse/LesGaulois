package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force, int effetPotion) {
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+ "\"" + texte+ "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}
	
	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
		int forceCoup = force*effetPotion / 3;
		if(effetPotion > 1) {
			effetPotion--;
		}
		romain.recevoirCoup(forceCoup);
		}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix", 8, 1);
		System.out.println(asterix);
		System.out.println(asterix.getNom());
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}

	
}
