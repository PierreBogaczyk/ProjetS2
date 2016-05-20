package fr.iutvalence.info.dut.m2107;
import java.util.ArrayList;

public class Area {
	//TODO add attributes and methods 
	private AreaType areaType;
	
	private String areaName;
	
	private ArrayList<NPC> areaNPC;
	
	private int NPCCount;

	private ArrayList<Area> connectedArea;
	
	private int connectedAreaCount;
	public Area(AreaType type, String name,ArrayList<NPC> npcList,ArrayList<Area> connectedArea)
	{
		this.areaType = type;
		this.areaName = name;
		this.areaNPC = npcList;
		this.NPCCount = areaNPC.size();
		this.connectedArea = connectedArea;
		this.connectedAreaCount = connectedArea.size();
	}
	
	public void endCombat()
	{
		
	}
	
	public ArrayList<NPC> getAreaNPC()
	{
		return this.areaNPC;
	}
	
	public int getNPCCount()
	{
		return this.NPCCount;
	}
	
	public int getConnectedAreaCount()
	{
		return this.connectedAreaCount;
	}
}
