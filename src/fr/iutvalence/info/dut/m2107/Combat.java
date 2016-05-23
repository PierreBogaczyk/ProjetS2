package fr.iutvalence.info.dut.m2107;

import fr.iutvalence.info.dut.m2107.action.Skill;

public class Combat
{
	private Character character;
	private Enemy[] enemyTeam;
	private Area fightArea;
	
	public Combat(Character character,Enemy[] enemyTeam,Area fightArea)
	{
		this.character = character;
		this.enemyTeam = enemyTeam;
		this.fightArea = fightArea;
	}

	public void launchCombat()
    {
		//TODO set the HCI to combat mode
		boolean isPlayerTurn = true;
		while(this.isCombatOver())
		{
			Skill chosenSkill = null;
			if(isPlayerTurn)
			{
				chosenSkill = character.chooseAction();
			}
			else
			{
				for(int i = 0;  i < this.fightArea.getNPCCount(); i++)
				{
					enemyTeam[i].performAction(this.character,chosenSkill);
				}
			}
			isPlayerTurn = !(isPlayerTurn);
		}
		//TODO set back the HCI to exploration mode
    }
	private boolean isCombatOver()
	{
		for(int i = 0;i < this.fightArea.getAreaNPC().size();i++)
		{
			if(this.enemyTeam[i].getEnemyHealth() > 0) return false;
		}
		if(this.character.getCharacterHealth() > 0) return false;
		return true;
	}

}
