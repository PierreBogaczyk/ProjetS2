package fr.iutvalence.info.dut.m2107;
import java.util.ArrayList;

public class Item {
	//TODO add attributes and methods 
	/**
	 * Type of item
	 */
	private String itemType;
	/**
	 * Value of item
	 */
	private int itemValue;
	/**
	 * I don't know
	 */
	private ArrayList<Characteristic> itemCharacteristic;
	/**
	 * Id of item
	 */
	private int idItem;
	
	/**
	 * This is the constructor of Item
	 * @param idItem identificator of item 
	 * @param itemType type of item
	 * @param itemValue value of item
	 */
	public Item (int idItem, String itemType, int itemValue) {
		
		this.idItem=idItem;
		this.itemType=itemType;
		this.itemValue=itemValue;
		
	}
	
	/**
	 * Allow to equip the item	 
	 */
	public void equipItem () {
		
		
		
	}
	
	/**
	 * Allow to use the item
	 */
	public void useItem () {
		
		
		
	}
	
}
