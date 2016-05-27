package fr.iutvalence.info.dut.m2107.action;
/**
 * class ccSpell
 * @author delarbrm
 *
 */
public class CCSpell extends Spell{
	//TODO add attributes and methods
	/**
	 * name of the skill
	 */
	private String skillName;
	/**
	 * cc effect
	 */
	private Effect ccEffect;
	/**
	 * @param skillName
	 * @param castingTime
	 * @param ccEffect
	 */
    public CCSpell(String skillName, Effect ccEffect)
    {
	    super(skillName);
	    this.ccEffect = ccEffect;
    }
    /**
     * get effect of cc 
     * @return ccEffect
     */
	public Effect getCcEffect()
	{
		return this.ccEffect;
	}
	
    
}
