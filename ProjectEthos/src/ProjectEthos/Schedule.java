package ProjectEthos;

import java.util.Date;
/**
 * 
 * This class will be used as one of many schedule objects for the schedule management for the building access.
 * Schedules will have a start and end time for each. Each employee will will be assigned a schedule, this will 
 * manage the access the employee has on his badge. Also, any access that is not part of the schedule, will be 
 * alerted to security or the owners via the Alarm class.
 * 
 * 
 */

public class Schedule {
	
	private String schedule; // This will be used as a description for the schedule.
	private Date start; // This will be used to define the start of the schedule object.
	private Date end; //This will be used to define the end of the schedule object.
	/**
	 * This operator will be called to restrict a schedule based on the attributes defined.
	 */
	public void restrictAccess() {
	}
	/**
	 * This operator will be called to assign a schedule based on the attributes defined.
	 */
	public void assignAccess() {
	}

}
