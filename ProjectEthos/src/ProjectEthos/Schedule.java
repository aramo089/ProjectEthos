package ProjectEthos;

import java.util.Date;
/**
 * 
 * This class will manage every schedule object which will be used for the building access.
 * Schedules will be assigned to an employee via his badge. Also, any access that 
 * is not part of the schedule, will be alerted to security or the owners.
 * 
 * @Group1
 */

public class Schedule {
	
	private String schedule; // This will be used as a description for the schedule.
	private Date start; // THis will be used to define the start of the schedule object.
	private Date end; //This will be used to define the end of the schedule object.
	/*
	 * This operator will be called to restrict a schedule based on the attributes defined.
	 */
	public void restrictAccess() {
	}
	/*
	 * This operator will be called to assign a schedule based on the attributes defined.
	 */
	public void assignAccess() {
	}

}
