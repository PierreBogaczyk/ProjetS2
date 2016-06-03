package fr.iutvalence.info.dut.m2107;

/**
 * class experience bar
 * 
 * @author delarbrm
 *		
 */
public class ExperienceBar
{
	// TODO add attributes and methods
	private int currentExperienceAmount;
	private int maxExperienceAmount;
	private static final int DEFAULT_EXPERIENCE_AMOUNT = 0;
	
	/**
	 * create bar default expereience and max experience of bar
	 * 
	 * @param currentExperienceAmount
	 * @param maxExperienceAmount
	 */
	public ExperienceBar(int maxExperienceAmount)
	{
		this.currentExperienceAmount = DEFAULT_EXPERIENCE_AMOUNT;
		this.maxExperienceAmount = maxExperienceAmount;
		
	}
	
	/**
	 * create bar with number of experience and max experience of bar
	 * 
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
	 * 
	 * @param Experience
	 */
	public void addExperience(int Experience)
	{
		this.currentExperienceAmount = this.currentExperienceAmount + Experience;
	}
	
	/**
	 * up level of the player
	 * 
	 * @param player
	 */
	public void Levelup(Character player)
	{
		if (this.currentExperienceAmount >= this.maxExperienceAmount)
		{
			this.currentExperienceAmount = DEFAULT_EXPERIENCE_AMOUNT
					+ (this.maxExperienceAmount - this.currentExperienceAmount);
			player.setCharacterLevel(player.getCharacterLevel() + 1);
		}
		this.currentExperienceAmount = 0;
		this.maxExperienceAmount = this.maxExperienceAmount * 2;
		
	}
	
	public int getCurrentExperienceAmount()
	{
		return currentExperienceAmount;
	}
	
	public void setCurrentExperienceAmount(int currentExperienceAmount)
	{
		this.currentExperienceAmount = currentExperienceAmount;
	}
	
}
