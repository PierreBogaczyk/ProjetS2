package fr.iutvalence.info.dut.m2107.action;
/**
 * class skill
 * @author delarbrm
 *
 */
public class Skill {
	//TODO add attributes and methods
	/**
	 * name of the skill
	 */
	private String skillName;

	/**
	 * @param skillName
	 */
    public Skill(String skillName)
    {
	    this.skillName = skillName;
    }
    /**
     * get a name of the skill
     * @return skillName
     */
	public String getSkillName()
	{
		return this.skillName;
	}
	
}
