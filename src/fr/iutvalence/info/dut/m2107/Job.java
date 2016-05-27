package fr.iutvalence.info.dut.m2107;
import fr.iutvalence.info.dut.m2107.action.Skill;
import fr.iutvalence.info.dut.m2107.action.Attack;
import fr.iutvalence.info.dut.m2107.action.DamageSpell;
import fr.iutvalence.info.dut.m2107.action.HealingSpell;
import java.util.ArrayList;

/**
 * create class job
 */
public class Job {
	/**
	 * job attribute
	 */
	public String jobName;
	private ArrayList<Skill> jobSkill;
/**
 *  Define player job and his skills available
 */
	public Job(String jobName){
		
		this.jobName = jobName;
		this.jobSkill=new ArrayList<Skill>(); 
		
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
	
	public ArrayList<Skill> getJobSkillList()
	{
		return this.jobSkill;
	}
	/**
	 * get job name
	 * @return job name
	 */
	public String getJobName()
	{
		return this.jobName;
	}
}
