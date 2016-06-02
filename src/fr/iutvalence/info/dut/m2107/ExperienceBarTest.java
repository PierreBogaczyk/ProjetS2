package fr.iutvalence.info.dut.m2107;
import junit.framework.*;
/**
 * experience bar test class
 * @author SekaiHaru
 *
 */
public class ExperienceBarTest extends TestCase
{
	
public ExperienceBarTest(String name){
	super(name);

}
/**
 * test methods add experience
 */
public void addExperienceTest(){
	ExperienceBar expbar =new ExperienceBar(0,100);
	expbar.addExperience(10);
	assertNotSame(expbar.getCurrentExperienceAmount(),0);
	ExperienceBar expbar2 =new ExperienceBar(0,100);
	expbar2.addExperience(10);
	assertSame(expbar.getCurrentExperienceAmount(),10);
	
}

public static Test suite() {
	  TestSuite suite= new TestSuite();
	  suite.addTest(new ExperienceBarTest("addExperienceTest"));
	  return suite;
	}


}
