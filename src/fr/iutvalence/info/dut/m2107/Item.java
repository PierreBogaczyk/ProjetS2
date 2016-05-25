package fr.iutvalence.info.dut.m2107;
import java.util.ArrayList;
/**
 * create call item
 * @author delarbrm
 *
 */
public class Item {
	//TODO add attributes and methods 
	/**
	 * Type of item
	 */
	private ItemType itemType;
	/**
	 * Value of item
	 */
	private int itemValue;
	/**
	 * Characteristic of item
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
	public Item (int idItem, ItemType itemType, int itemValue,ArrayList<Characteristic> itemCharacteristic) {
		
		this.idItem=idItem;
		this.itemType=itemType;
		this.itemValue=itemValue;
		this.itemCharacteristic=itemCharacteristic;	
	}
	
/**
 * allow to equip item
 * @return itemValue
 */
	public int equipItem () {
		
		return this.itemValue;		
	}
	
	/**
	 * Allow to use the item
	 * @return  itemValue
	 */
	public int useItem () {
		
		return this.itemValue;
		
	}
	
}
