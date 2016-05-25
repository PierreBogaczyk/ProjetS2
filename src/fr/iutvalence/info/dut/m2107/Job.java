package fr.iutvalence.info.dut.m2107;
import fr.iutvalence.info.dut.m2107.action.Skill;
import fr.iutvalence.info.dut.m2107.action.Attack;
import fr.iutvalence.info.dut.m2107.action.DamageSpell;
import fr.iutvalence.info.dut.m2107.action.HealingSpell;
import java.util.ArrayList;

/**
 * create class job
 * @author delarbrm
 *
 */
public class Job {
	//TODO add attributes and methods
	/**
	 * job attribute
	 */
	public String jobName;
	private ArrayList<Skill> jobSkill;
	/**
	 * job by default
	 */
	public final static String DEFAULT_JOB=null;
/**
 * allow a job
 */
	public Job(String jobName){
		
		this.jobName=DEFAULT_JOB;
		this.jobSkill=null;
		
			switch (jobName){
				
				case "Warrior" :
					jobSkill.add(new Attack ("Head breaker",20));
					jobSkill.add(new Attack ("Slice",15));
					jobSkill.add(new Attack ("Cut",10));
					break;
					
				case "Rogue" :
					jobSkill.add(new Attack ("Flame arrow",15));
					jobSkill.add(new Attack ("Clean shot",20));
					jobSkill.add(new Attack ("Vital point",30));
					break;
					
				case "Wizard"	:
					jobSkill.add(new DamageSpell ("Ice gun",15));
					jobSkill.add(new HealingSpell ("Health giver",15));
					jobSkill.add(new Attack ("Lightning strike",30));
					break;
			} 
	}
	
	public String getJobName()
	{
		return this.jobName;
	}
}
