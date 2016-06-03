package fr.iutvalence.info.dut.m2107;

import java.util.ArrayList;

public class Area
{
	// TODO add attributes and methods
	private AreaType areaType;
	
	private String areaName;
	
	private NPC areaNPC;
	
	public Area(String name)
	{
		this.areaName = name;
		switch (name)
		{
			case ("Tavern"):
			{
				this.areaNPC = new NPC("Tavern Keeper");
				this.areaType = areaType.TOWN;
			}
			case ("Shop"):
			{
				this.areaNPC = new Merchant("Merchant", new ArrayList<Item>());
				this.areaType = areaType.TOWN;
			}
			case ("Dungeon"):
			{
				this.areaNPC = new Enemy("Foe", 200);
				this.areaType = areaType.DUNGEON;
			}
		}
	}
	
	public NPC getAreaNPC()
	{
		return this.areaNPC;
	}
	
	public String getAreaName()
	{
		return this.areaName;
	}
}
