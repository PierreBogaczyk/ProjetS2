package fr.iutvalence.info.dut.m2107;
import java.util.ArrayList;

import fr.iutvalence.info.dut.m2107.action.Attack;
import fr.iutvalence.info.dut.m2107.action.Defense;
import fr.iutvalence.info.dut.m2107.action.Skill;
import fr.iutvalence.info.dut.m2107.action.Spell;
import fr.iutvalence.info.dut.m2107.action.DamageSpell;
import fr.iutvalence.info.dut.m2107.action.CCSpell;

public class Enemy extends NPC{
	private String npcName;
	private int enemyHealth;
	private ArrayList<Skill> enemySkillList;
	private ArrayList<Characteristic> enemyCharacteristicList;
	
	public Enemy(String name,int health, ArrayList<Skill> skillList,ArrayList<Characteristic> charList)
	{
		super(name);
		this.enemyHealth = health;
		this.enemySkillList = skillList;
		this.enemyCharacteristicList = charList;
	}
	public void performAction(Character target,Skill targetSkill)
	{
		//TODO method for enemy's action selection
	}
	public void useSkill(Skill usedSkill,Character target)
	{
		if(usedSkill instanceof Spell)
		{
			if(usedSkill instanceof DamageSpell)
			{
				target.setCharacterHealth(target.getCharacterHealth() - ((DamageSpell)usedSkill).getSpellDamage());
			}
			if(usedSkill instanceof CCSpell)
			{
				
			}
		}
		if(usedSkill instanceof Attack)
		{
			target.setCharacterHealth(target.getCharacterHealth() - ((Attack)usedSkill).getSkillDamage());
		}
	}
	
	public int getEnemyHealth() {
		return enemyHealth;
	}
	public void setEnemyHealth(int enemyHealth) {
		this.enemyHealth = enemyHealth;
	}
}	
