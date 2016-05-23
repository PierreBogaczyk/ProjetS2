package fr.iutvalence.info.dut.m2107.action;

public class HealingSpell extends Spell{
	//TODO add attributes and methods 
	private String skillName;
	private int healthHealed;
	/**
	 * @param skillName
	 * @param castingTime
	 * @param healthHealed
	 */
    public HealingSpell(String skillName, int healthHealed)
    {
	    super(skillName);
	    this.healthHealed = healthHealed;
    }
	public int getHealthHealed()
	{
		return healthHealed;
	}
    
	
	
}
