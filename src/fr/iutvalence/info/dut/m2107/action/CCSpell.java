package fr.iutvalence.info.dut.m2107.action;

public class CCSpell extends Spell{
	//TODO add attributes and methods
	private String skillName;
	private int castingTime;
	private Effect ccEffect;
	/**
	 * @param skillName
	 * @param castingTime
	 * @param ccEffect
	 */
    public CCSpell(String skillName, int castingTime, Effect ccEffect)
    {
	    super(skillName, castingTime);
	    this.ccEffect = ccEffect;
    }
	public Effect getCcEffect()
	{
		return ccEffect;
	}
	
    
}
