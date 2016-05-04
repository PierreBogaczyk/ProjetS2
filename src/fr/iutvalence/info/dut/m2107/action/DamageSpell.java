package fr.iutvalence.info.dut.m2107.action;

public class DamageSpell extends Spell{
	//TODO add attributes and methods 
	private String skillName;
	private int castingTime;
	private int spellDamage;
	
	
	/**
	 * @param skillName
	 * @param castingTime
	 * @param spellDamage
	 */
    public DamageSpell(String skillName, int castingTime, int spellDamage)
    {
	    super(skillName, castingTime);
	    this.spellDamage = spellDamage;
    }


	public int getSpellDamage()
	{
		return this.spellDamage;
	}
}
