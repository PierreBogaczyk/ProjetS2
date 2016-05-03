package fr.iutvalence.info.dut.m2107.action;

public class Attack extends Skill{
	//TODO add attributes and methods 
	private String skillName;
	
	private int skillDamage;
	
	
	
	/**
	 * @param skillName
	 * @param skillDamage
	 */
    public Attack(String skillName, int skillDamage)
    {
	    super(skillName);
	    this.skillDamage = skillDamage;
    }



	public int getSkillDamage()
	{
		return this.skillDamage;
	}
}
