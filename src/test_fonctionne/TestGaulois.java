package test_fonctionne;

import personnages.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix", 8);
		Gaulois obelix = new Gaulois("obelix", 16);
		asterix.parler("Bonjour" + obelix.getNom());
		obelix.parler("Bonjour" + asterix.getNom() + "Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée");
	}
}
