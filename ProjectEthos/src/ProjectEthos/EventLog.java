package ProjectEthos;

import java.util.ArrayList;


/**
 * 
 *	This object will contain the Event Log information for all the changes occurring in the system.
 *  This will also contain the log for any event that may occur such as adding a user, removing a user, 
 *  adding groups, removing groups, employees accessing the building. This will be the central source of events
 *  which will then be used for the reporting in the application.
 *  
 */

public class EventLog {
	
	private ArrayList  eventLog;  //This will contain the event log information.
	private ArrayList  systemLog; //This will contain the system log information.
	
	/**
	 * This operator will record the log information into the event or system log.
	 */
	public void recordLog() {
	}
	
	/**
	 * This operator will reset the log information for the event log or system log.
	 */
	public void resetLog() {
	}
	
}
