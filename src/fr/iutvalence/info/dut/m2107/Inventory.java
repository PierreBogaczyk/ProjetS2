package fr.iutvalence.info.dut.m2107;
import java.util.ArrayList;
/**
 * create class inventory
 */
public class Inventory {
	
	/**
	 * number of slot for inventory
	 */
	private int inventorySlotsCount;
	/**
	 * number of slot by default in inventory
	 */
	private static final int DEFAULT_INVENTORY_SLOT_COUNT=0;
	/**
	 * List of item in inventory
	 */
	private ArrayList<Item> itemInInventory;
	
	/**
	 * Constructor of Inventory
	 */
	public Inventory () {
		this.inventorySlotsCount=DEFAULT_INVENTORY_SLOT_COUNT;
	}
	/**
	 * define inventory
	 * @param inventorySlotsCount
	 * @param itemInInventory
	 */
	public Inventory(int inventorySlotsCount, ArrayList<Item> itemInInventory){
		this.inventorySlotsCount=inventorySlotsCount;
		this.itemInInventory=itemInInventory;	
	}
	/**
	 * allow to throw item
	 * @param Item
	 */
	public void throwItem (Item Item) {
		for(int i=0;i<(this.itemInInventory.size()+1);i=i+1){
			if(Item==this.itemInInventory.get(i)) this.itemInInventory.remove(i);	
		}	
	}
	/**
	 * allow to add item
	 * @param Item
	 */
	
	public void AddItem(Item Item) {
			this.itemInInventory.add(Item);	
		}	
	/**
	 * allow to see inventory
	 */
	public void seeInventory(){
		for(int i=0;i<(this.itemInInventory.size()+1);i=i+1){
			System.out.println("Slots"+" "+i+" "+this.itemInInventory.get(i));
	}	
}
	/**
	 * allow to see a number of slots
	 * @return inventorySlotsCount
	 */
	public int getSlots(){
		return this.inventorySlotsCount;	
	}
}