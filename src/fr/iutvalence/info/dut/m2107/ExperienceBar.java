package fr.iutvalence.info.dut.m2107;
/**
 * class experience bar
 * @author delarbrm
 *
 */
public class ExperienceBar {
	//TODO add attributes and methods 
	private int currentExperienceAmount;
	private int maxExperienceAmount;
	private static final int Empty_currentExperienceAmount=0;
	/**
	 * create empty bar 
	 */
	public void emptyBar()
	{
		this.currentExperienceAmount=Empty_currentExperienceAmount;
	}
	/**
	 * create bar with number of experience and max experience of bar
	 * @param currentExperienceAmount
	 * @param maxExperienceAmount
	 */
	public ExperienceBar(int currentExperienceAmount, int maxExperienceAmount)
	{
		this.currentExperienceAmount = currentExperienceAmount;
		this.maxExperienceAmount = maxExperienceAmount;
	}
/**
 * add experiences to a bar
 * @param Experience
 */
	public void addExperience(int Experience)
	{
		this.currentExperienceAmount=this.currentExperienceAmount+Experience;
	}
	/**
	 *up level of the player
	 * @param player
	 */
	public void Levelup(Character player){
		if(this.currentExperienceAmount>=this.maxExperienceAmount){
			this.currentExperienceAmount=Empty_currentExperienceAmount+(this.maxExperienceAmount-this.currentExperienceAmount);
			player.setCharacterLevel(getCharacterLevel() + 1);		
		}
		
	
	}
/**
 * show character level
 * @return
 */
	private int getCharacterLevel() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
