package ProjectEthos;

import java.util.Date;

/**
 * This class will will represent an employee. This will 
 * contain information about the employee, badge information, 
 * active and termination date, and if the employee is still active. 
 * 
 */
public class User {

	private String employeeName; //This will contain the employee's name.
	private int employeeNumber; //This attribute will correspond to an employee's number within the company.
	private String userType; //This will define whether the employee is permanent, temporary, or contractor.
	private int cardID; //This contains the employee card id.
	private Date activeDate; //This information will hold the active date of the employee.
	private Date terminateDate; //This information will hold the terminate date of the employee.
	private Boolean isActive; //This attribute will detail if an employee user account is active or not. 
	
	/**
	 * This will check the access of the employee if they have valid access 
	 * to both system and physical access. This check is important to ensure
	 * that the employee has the right access.
	 */
	public void checkAccess() {
	}
	
}
