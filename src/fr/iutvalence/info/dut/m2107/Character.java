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
	
	
	public void startCombat()
	{
		Enemy[] enemyTeam = new Enemy[this.currentArea.getNPCCount()];
		for(int i = 0; i< this.currentArea.getAreaNPC().size();i++)
		{
			enemyTeam[0] = (Enemy) this.currentArea.getAreaNPC().get(i);	
		}
		Combat combat = new Combat(this,enemyTeam,this.currentArea);
		combat.launchCombat();
	}
	
	public Skill chooseAction() {
		//TODO method allowing the player to choose an action
		return new Skill("Placeholder");
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
