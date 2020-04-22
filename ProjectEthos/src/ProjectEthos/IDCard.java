package ProjectEthos;

import java.util.ArrayList;

/**
 * 
 * This class will is representative of a physical ID card.
 * 
 *
 */

public class IDCard {

	private String name; //This will be used to provide a description to the badge.
	private int idNumber;  //This will be used to register the physical ID number to the system.
	private ArrayList accessType; //This array will contain all the access and ID can contain.
	private ArrayList system; // This array will contain all the systems assigned to the ID card.
	private Boolean isActive; // This will identify if an ID is still active or inactive. If Inactive, an employee can't use it to access any building door.
	
	/**
	 * This operator will be used to call back to Ethos to validate if the badge and the access type.
	 * Validating the access will determine where and when the employee can access the physical doors.
	 * If the system can't validate the access, the employee must see security to be vetted and reassigned.
	 */
	public void validateAccess() {
	}
	
	
}
