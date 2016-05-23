package fr.iutvalence.info.dut.m2107.action;

public class Attack extends Skill{
	//TODO add attributes and methods 
	private String skillName;
	
	private int skillDamage;
	
	
	
	/**
	 * Create a new attack skill
	 * @param skillName name of the skill
	 * @param skillDamage damage of the attack
	 */
    public Attack(String skillName, int skillDamage)
    {
	    super(skillName);
	    this.skillDamage = skillDamage;
    }



	/**
	 * @return The damage done by an attack skill
	 */
	public int getSkillDamage()
	{
		return this.skillDamage;
	}
}
