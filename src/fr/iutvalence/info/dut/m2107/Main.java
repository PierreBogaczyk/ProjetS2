package fr.iutvalence.info.dut.m2107;

import fr.iutvalence.info.dut.m2107.HCI.MenuHCI;

/**
 * This class is the main class, allows to launch and uses application
 * 
 * @author MickaelPrades
 *		
 */

public class Main
{
	/*
	 * Algorithm:
	 * 
	 * initialiser interface si (nouvelle partie) alors afficher creation perso
	 * tant que(creation non finie) demander remplissage champs fin tantque
	 * initialiser zones afficher taverne tant que(vrai): tant que (typeZone ==
	 * TOWN): selon (bouton appuy�): -parler : parlerPNJ() -commercer :
	 * commercerMarchand() -voyager : changerZone() finselon fintantque tant que
	 * (typeZone == DUNGEON): selon (bouton appuy�): -interagir :
	 * interactionZone() -combattre : debutCombat() -voyager : changerZone()
	 * finselon fintantque si(isGameOver) break fintantque finsi
	 */
	public static void main(String[] args)
	{
		
		MenuHCI window = new MenuHCI();
		
	}
	
}
