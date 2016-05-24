package fr.iutvalence.info.dut.m2107;
import java.util.ArrayList;
/**
 * create class inventory
 * @author delarbrm
 *
 */
public class Inventory {
	//TODO add attributes and methods
	/**
	 * number of slot for inventory
	 */
	private int inventorySlotsCount;
	private static final int DefaultinventorySlotsCount=0;
	private ArrayList<Item> itemInInventory;
	
	/**
	 * Constructor of Inventory
	 */
	public Inventory () {
		this.inventorySlotsCount=DefaultinventorySlotsCount;
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