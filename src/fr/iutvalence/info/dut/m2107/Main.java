package fr.iutvalence.info.dut.m2107;

import fr.iutvalence.info.dut.m2107.HCI.HCI;



public class Main {
	/*
	Algorithm:
	
	initialiser interface
	si (nouvelle partie) alors
		afficher creation perso
		tant que(creation non finie)
			demander remplissage champs
		fin tantque
		initialiser zones
		afficher taverne
		tant que(vrai):
			tant que (typeZone == TOWN):
				selon (bouton appuyé):
					-parler : parlerPNJ()
					-commercer : commercerMarchand()
					-voyager : changerZone()
				finselon
			fintantque
			tant que (typeZone == DUNGEON):
				selon (bouton appuyé):
					-interagir : interactionZone()
					-combattre : debutCombat()
					-voyager : changerZone()
				finselon
			fintantque
			si(isGameOver) break
		fintantque
	finsi
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HCI window = new HCI();
		
	}

}
