package fr.iutvalence.info.dut.m2107;
/**
 * class characteristic
 * @author delarbrm
 *
 */
public class Characteristic {
	//TODO add attributes and methods 
	private String characteristicName;
	private int characteristicValue;
	
	
	/**
	 * characteristic name and value
	 * @param characteristicName
	 * @param characteristicValue
	 */
 public Characteristic(String characteristicName, int characteristicValue)
	{
		this.characteristicName = characteristicName;
		this.characteristicValue = characteristicValue;
	}

   /**
    * set characteristic values
    * @param characteristicName
    * @param characteristicValue
    */
public	void Setcharacteristic(String characteristicName,int characteristicValue){
	 this.characteristicName=characteristicName;
	 this.characteristicValue=characteristicValue;
 }
/**
 * 
 * @return name characteristic
 */
public String getcharsteristicName(){
	
	return this.characteristicName;
	
}
/**
 * 
 * @return value characteristic
 */
public int getcharacteristicValue(){
	
	return this.characteristicValue;
	
}



	
}

