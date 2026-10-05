package test_fonctionne;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 16);
		asterix.parler("Bonjour" + obelix.getNom());
		obelix.parler("Bonjour" + asterix.getNom() + "Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée");
		
		Romain minus = new Romain("Minus", 6);
		System.out.println("Dans la forêt " + asterix.getNom() +" et " + obelix.getNom() + " tombent nez à nez sur le romain " + minus.getNom());
		for (int i = 0; i <3; i++) {
			asterix.frapper(minus);
		}
	}
}
