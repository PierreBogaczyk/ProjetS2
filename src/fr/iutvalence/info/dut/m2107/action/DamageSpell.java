package fr.iutvalence.info.dut.m2107.action;
/**
 * class Spell Damage
 * @author delarbrm
 *
 */
public class DamageSpell extends Spell{
	//TODO add attributes and methods
	/**
	 * name of the spell
	 * 
	 */
	private String skillName;
	/**
	 * damage of the spell
	 */
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

   /**
    * get Damage of spell
    * @return spellDamage
    */
	public int getSpellDamage()
	{
		return this.spellDamage;
	}
}
