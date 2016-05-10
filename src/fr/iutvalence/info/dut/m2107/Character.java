package fr.iutvalence.info.dut.m2107;
import java.util.ArrayList;

public class Character {
	//TODO add attributes and methods 
	private String characterName;
	private int characterLevel;
	private Area currentArea;
	private ArrayList<Characteristic> characterCharacteristicList;
	private ExperienceBar characterExperience;
	private Job characterJob;
	private Inventory characterInventory;
	private int characterHealth;
	
	public int getCharacterHealth()
	{
		return this.characterHealth;
	}
	public void setCharacterHealth(int health)
	{
		this.characterHealth = health;
	}
	public void setCharacterLevel(int i) {
		// TODO Auto-generated method stub
		
	}
}	
