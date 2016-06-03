package fr.iutvalence.info.dut.m2107;
import junit.framework.*;
/**
 * characteristic test class
 * @author MorganDelarbre
 *
 */
public class CharacteristicTest extends TestCase
{
public CharacteristicTest(String name){
	super(name);

}
/**
 * test methods set characteristic
 */
public	void SetcharacteristicTest(){
	Characteristic chara = new Characteristic("skill",20);
	chara.Setcharacteristic("attaque",10);
	assertNotSame(chara.getcharacteristicValue(),20);
	assertNotSame(chara.getcharacteristicName(),"skill");
	Characteristic cha = new Characteristic("skill",20);
	cha.Setcharacteristic("attaque",10);
	assertNotSame(cha.getcharacteristicValue(),"attaque");
	assertNotSame(cha.getcharacteristicName(),10);
	Characteristic charac = new Characteristic("skill",20);
	charac.Setcharacteristic("attaque",10);
	assertSame(charac.getcharacteristicValue(),10);
	assertSame(charac.getcharacteristicName(),"attaque");
	
}

public static Test suite() {
	  TestSuite suite= new TestSuite();
	  suite.addTest(new CharacteristicTest("SetcharacteristicTest"));
	  return suite;
	}

}
