package fr.iutvalence.info.dut.m2107;
import java.util.ArrayList;

public class Area {
	//TODO add attributes and methods 
	private AreaType areaType;
	
	private String areaName;
	
	private ArrayList<NPC> areaNPC;
	
	public Area(AreaType type, String name,ArrayList<NPC> npcList)
	{
		this.areaType = type;
		this.areaName = name;
		this.areaNPC = npcList;
	}
	
	public void endCombat()
	{
		
	}
	
	public void startCombat()
	{
		
	}
}
