package fr.iutvalence.info.dut.m2107.action;
/**
 * healing spell
 * @author delarbrm
 *
 */
public class HealingSpell extends Spell{
	//TODO add attributes and methods
	/**
	 * name of the skill
	 */
	private String skillName;
	/**
	 * health Healed
	 */
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
    /**
     * get health Healed
     * @return
     */
	public int getHealthHealed()
	{
		return healthHealed;
	}
    
	
	
}
