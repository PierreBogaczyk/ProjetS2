package fr.iutvalence.info.dut.m2107.action;

public class Spell extends Skill{
	private String skillName;
	private int castingTime;
	/**
	 * @param skillName
	 * @param castingTime
	 */
    public Spell(String skillName, int castingTime)
    {
    	super(skillName);
	    this.castingTime = castingTime;
    }
	public int getCastingTime()
	{
		return castingTime;
	}
	
}
