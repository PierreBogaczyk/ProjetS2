package fr.iutvalence.info.dut.m2107;
import java.util.ArrayList;

public class Merchant extends NPC{

	//TODO add attributes and methods 
	private String npcName;
	private ArrayList<Item> catalog;
	
	public Merchant(String name,ArrayList<Item> catalog)
	{
		super(name);
		this.catalog = catalog;
	}
	public void performAction()
	{
		
	}
}
