package fr.iutvalence.info.dut.m2107;

import fr.iutvalence.info.dut.m2107.action.Attack;
import fr.iutvalence.info.dut.m2107.action.HealingSpell;
import fr.iutvalence.info.dut.m2107.action.Skill;
import fr.iutvalence.info.dut.m2107.action.Spell;
import fr.iutvalence.info.dut.m2107.action.DamageSpell;

/**
 * @author bogaczpi
 *		
 */
public class Enemy extends NPC
{
	private int enemyHealth;
	
	/**
	 * @param name
	 *            Name of the enemy
	 * @param health
	 *            Health of the enemy
	 */
	public Enemy(String name, int health)
	{
		super(name);
		this.enemyHealth = health;
	}
	
	/**
	 * Choice of a skill by an enemy
	 * 
	 * @param target
	 *            Target of the enemy
	 * @param targetSkill
	 *            Skill used by the target
	 */
	public void performAction(Character target, Skill targetSkill)
	{
		if (targetSkill instanceof Spell)
		{
			if (targetSkill instanceof DamageSpell)
			{
				useSkill(new HealingSpell("First Aid", 5), target);
			}
			if (targetSkill instanceof HealingSpell)
			{
				useSkill(new DamageSpell("Fireball", 15), target);
			}
		}
		if (targetSkill instanceof Attack)
		{
			useSkill(new Attack("Strike", 10), target);
		}
	}
	
	/**
	 * Use of a skill by an enemy
	 * 
	 * @param usedSkill
	 *            Skill used by the enemy
	 * @param target
	 *            Target of the skill
	 */
	public void useSkill(Skill usedSkill, Character target)
	{
		if (usedSkill instanceof Spell)
		{
			if (usedSkill instanceof DamageSpell)
			{
				target.setCharacterHealth(target.getCharacterHealth() - ((DamageSpell) usedSkill).getSpellDamage());
			}
			if (usedSkill instanceof HealingSpell)
			{
				this.enemyHealth = this.enemyHealth + ((HealingSpell) usedSkill).getHealthHealed();
			}
		}
		if (usedSkill instanceof Attack)
		{
			target.setCharacterHealth(target.getCharacterHealth() - ((Attack) usedSkill).getSkillDamage());
		}
	}
	
	/**
	 * @return The health of the current enemy
	 */
	public int getEnemyHealth()
	{
		return enemyHealth;
	}
	
	/**
	 * @param Set
	 *            the health of the current enemy;
	 */
	public void setEnemyHealth(int enemyHealth)
	{
		this.enemyHealth = enemyHealth;
	}
}
