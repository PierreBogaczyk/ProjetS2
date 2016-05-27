package fr.iutvalence.info.dut.m2107.action;
/**
 * class Defense 
 * @author delarbrm
 *
 */
public class Defense extends Skill{
	//TODO add attributes and methods
	/**
	 * name of the skill
	 */
	private String skillName;
	/**
	 * reduction of defense 
	 */
	private int defenseReduction;
	/**
	 * @param skillName
	 * @param defenseReduction
	 */
    public Defense(String skillName, int defenseReduction)
    {
	    super(skillName);
	    this.defenseReduction = defenseReduction;
    }
    /**
     * get defense reduction
     * @return defenseReduction
     */
	public int getDefenseReduction()
	{
		return this.defenseReduction;
	}
	
    
}
