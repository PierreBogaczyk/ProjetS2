package fr.iutvalence.info.dut.m2107;
import java.util.ArrayList;

import fr.iutvalence.info.dut.m2107.action.Skill;
/**
 * create class character
 * @author delarbrm
 *
 */
public class Character {
	private String characterName;
	private int characterLevel;
	private Area currentArea;
	private ArrayList<Characteristic> characterCharacteristicList;
	private ExperienceBar characterExperience;
	private Job characterJob;
	private Inventory characterInventory;
	private int characterHealth;
	/**
	 * create character
	 * @param characterName
	 * @param characterLevel
	 * @param currentArea
	 * @param characterCharacteristicList
	 * @param characterExperience
	 * @param characterJob
	 * @param characterInventory
	 * @param characterHealth
	 */
	public Character(String characterName, int characterLevel, Area currentArea,
			ArrayList<Characteristic> characterCharacteristicList, ExperienceBar characterExperience, Job characterJob,
			Inventory characterInventory, int characterHealth)
	{
		this.characterName = characterName;
		this.characterLevel = characterLevel;
		this.currentArea = currentArea;
		this.characterCharacteristicList = characterCharacteristicList;
		this.characterExperience = characterExperience;
		this.characterJob = characterJob;
		this.characterInventory = characterInventory;
		this.characterHealth = characterHealth;
	}
	
	
	public void startFight()
	{
		Enemy[] enemyTeam = new Enemy[currentArea.getNPCCount()];
		for(int i = 0; i< currentArea.getAreaNPC().size();i++)
		{
			if(currentArea.getAreaNPC().get(i) instanceof Enemy)
			{
				enemyTeam[0] = (Enemy) currentArea.getAreaNPC().get(i);
			}
		}
		while(this.isFightOver(enemyTeam))
		{
			Skill chosenSkill = this.chooseAction();
			for(int i = 0;  i < currentArea.getNPCCount(); i++)
			{
				enemyTeam[i].performAction(this,chosenSkill);
			}
		}
	}
	
	private Skill chooseAction() {
		//TODO method allowing the player to choose an action
		return new Skill("Default");
	}


	private boolean isFightOver(Enemy[] enemyTeam) {
		for(int i = 0;i < currentArea.getAreaNPC().size();i++)
		{
			if(enemyTeam[i].getEnemyHealth() > 0) return false;
		}
		if(this.getCharacterHealth() > 0) return false;
		return true;
	}


	/***
	 * show Health of character
	 * @return CharacterHealth
	 */
	public int getCharacterHealth()
	{
		return this.characterHealth;
	}
	/**
	 * set character health
	 * @param health
	 */
	public void setCharacterHealth(int health)
	{
		this.characterHealth = health;
	}
	/**
	 * show Character level
	 * @return character level
	 */
	public int getCharacterLevel()
	{
		return this.characterLevel;
	}
	/**
	 * set character level
	 * @param i
	 */
	public void setCharacterLevel(int i) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * show character name
	 * @return characterName
	 */
	public String getCharacterName()
	{
		return this.characterName;
	}
	/**
	 * set CharacterName
	 * @param characterName
	 */
	public void setCharacterName(String characterName)
	{
		this.characterName = characterName;
	}
	/**
	 * show current area
	 * @return currentArea
	 */
	public Area getCurrentArea()
	{
		return this.currentArea;
	}
	/**
	 * set current area
	 * @param currentArea
	 */
	public void setCurrentArea(Area currentArea)
	{
		this.currentArea = currentArea;
	}
	/**
	 * 
	 * @return characterCharacteristicList
	 */
	public ArrayList<Characteristic> getCharacterCharacteristicList()
	{
		return this.characterCharacteristicList;
	}
	/**
	 * set characteristic list
	 * @param characterCharacteristicList
	 */
	public void setCharacterCharacteristicList(ArrayList<Characteristic> characterCharacteristicList)
	{
		this.characterCharacteristicList = characterCharacteristicList;
	}
	/**
	 * show Character experience
	 * @return characterExperience
	 */
	public ExperienceBar getCharacterExperience()
	{
		return this.characterExperience;
	}
	/**
	 * set Character Experience
	 * @param characterExperience
	 */
	public void setCharacterExperience(ExperienceBar characterExperience)
	{
		this.characterExperience = characterExperience;
	}
	/**
	 * show character job
	 * @return characterJob
	 */
	public Job getCharacterJob()
	{
		return this.characterJob;
	}
	/**
	 * set CharacterJob
	 * @param characterJob
	 */
	public void setCharacterJob(Job characterJob)
	{
		this.characterJob = characterJob;
	}
	/**
	 * show Character inventory
	 * @return characterInventory
	 */
	public Inventory getCharacterInventory()
	{
		return this.characterInventory;
	}
	/**
	 * set Character Inventory
	 * @param characterInventory
	 */
	public void setCharacterInventory(Inventory characterInventory)
	{
		this.characterInventory = characterInventory;
	}
	
}	
