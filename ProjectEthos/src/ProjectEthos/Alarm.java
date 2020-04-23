package ProjectEthos;

import java.util.Date;

/**
 * 
 * This class is an alarm object that will be used as part of the schedule management class.
 * This class will notify owners that are assigned to the alarm object.
 * 
 * 
 */

public class Alarm {

	private String alarmName; //This attribute will define the Alarm Name that will be used alert owners
	private Date alarmTime; // This attribute will define when the Alarm will go off.
	/**
	 * This will notify the owners when the notifyOwners operator is called. 
	 * This alarm object is used in the schedule management class to create schedules.
	 * Each alarm is unique and must be an object.
	 */
	public void notifyOwners() {
	}

	
}
