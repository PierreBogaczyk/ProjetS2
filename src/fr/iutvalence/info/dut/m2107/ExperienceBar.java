package fr.iutvalence.info.dut.m2107;

public class ExperienceBar {
	//TODO add attributes and methods 
	private int currentExperienceAmount;
	private int maxExperienceAmount;
	private static final int Empty_currentExperienceAmount=0;
	
	public void emptyBar()
	{
		this.currentExperienceAmount=Empty_currentExperienceAmount;
	}
	
	public ExperienceBar(int currentExperienceAmount, int maxExperienceAmount)
	{
		this.currentExperienceAmount = currentExperienceAmount;
		this.maxExperienceAmount = maxExperienceAmount;
	}

	public void addExperience(int Experience)
	{
		this.currentExperienceAmount=this.currentExperienceAmount+Experience;
	}
	
	public void Levelup(Character player){
		if(this.currentExperienceAmount>=this.maxExperienceAmount){
			this.currentExperienceAmount=Empty_currentExperienceAmount+(this.maxExperienceAmount-this.currentExperienceAmount);
			player.setCharacterLevel(getCharacterLevel() + 1);			
		}
		
	
	}
	
	
}
