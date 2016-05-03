package fr.iutvalence.info.dut.m2107.action;

public class Defense extends Skill{
	//TODO add attributes and methods 
	private String skillName;
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
	public int getDefenseReduction()
	{
		return defenseReduction;
	}
	
    
}
