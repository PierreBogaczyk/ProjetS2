package fr.iutvalence.info.dut.m2107;

import fr.iutvalence.info.dut.m2107.action.Skill;

public class Combat
{
	private Character character;
	private Enemy enemy;
	private Area fightArea;
	
	public Combat(Character character, Enemy enemy, Area fightArea)
	{
		this.character = character;
		this.enemy = enemy;
		this.fightArea = fightArea;
	}
	
	public void launchCombat()
	{
		// TODO set the HCI to combat mode
		boolean isPlayerTurn = true;
		while (this.isCombatOver())
		{
			Skill chosenSkill = null;
			if (isPlayerTurn)
			{
				chosenSkill = character.chooseAction(null);
			} else
			{
				enemy.performAction(this.character, chosenSkill);
			}
			isPlayerTurn = !(isPlayerTurn);
		}
		// TODO set back the HCI to exploration mode
	}
	
	private boolean isCombatOver()
	{
		if (this.enemy.getEnemyHealth() > 0)
			return false;
		if (this.character.getCharacterHealth() > 0)
			return false;
		return true;
	}
	
}
