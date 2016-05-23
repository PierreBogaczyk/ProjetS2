package fr.iutvalence.info.dut.m2107.action;

public class DamageSpell extends Spell{
	//TODO add attributes and methods 
	private String skillName;
	private int spellDamage;
	
	
	/**
	 * @param skillName
	 * @param castingTime
	 * @param spellDamage
	 */
    public DamageSpell(String skillName, int spellDamage)
    {
	    super(skillName);
	    this.spellDamage = spellDamage;
    }


	public int getSpellDamage()
	{
		return this.spellDamage;
	}
}
