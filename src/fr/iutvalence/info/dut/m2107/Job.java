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
	public String job;
	/**
	 * job by default
	 */
	public final static String Default_job=null;
/**
 * allow a job
 */
	public Job(){
		this.job=Default_job;
		}
	/**
	 * allow a define Job
	 * @param Job
	 */
	public Job(String Job){
		this.job=Job;
	}
	/**
	 * allow to add a job
	 * @param Job
	 */
	public void addjob(String Job){
		this.job=Job	;
	}
	/**
	 * allow to remove a job
	 */
	public void removejob(){
		this.job=Default_job;
	}
	
	
}
