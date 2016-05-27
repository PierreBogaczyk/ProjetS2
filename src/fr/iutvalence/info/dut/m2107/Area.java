package fr.iutvalence.info.dut.m2107;
import java.util.ArrayList;

public class Area {
	//TODO add attributes and methods 
	private AreaType areaType;
	
	private String areaName;
	
	private NPC areaNPC;
	
	private int connectedAreaCount;
	public Area(AreaType type, String name,NPC npc)
	{
		this.areaType = type;
		this.areaName = name;
		switch(name){
			case("Tavern"):{this.areaNPC = new NPC()}
		}
		this.areaNPC = npc;
	}
	
	public NPC getAreaNPC()
	{
		return this.areaNPC;
	}
	
	public int getConnectedAreaCount()
	{
		return this.connectedAreaCount;
	}
	
}
