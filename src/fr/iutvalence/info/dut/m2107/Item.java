package fr.iutvalence.info.dut.m2107;
import java.util.ArrayList;
/**
 * create call item
 */
public class Item {
 
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
	
	
}
