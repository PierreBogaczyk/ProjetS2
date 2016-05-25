package fr.iutvalence.info.dut.m2107;
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
	/**
	 * job by default
	 */
	public final static String DEFAULT_JOB=null;
/**
 * allow a job
 */
	public Job(){
		this.jobName=DEFAULT_JOB;
		}
	/**
	 * allow a define Job
	 * @param Job
	 */
	public Job(String jobName){
		this.jobName=jobName;
	}
	
	public String getJobName()
	{
		return this.jobName;
	}
}
