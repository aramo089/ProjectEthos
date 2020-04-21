package ProjectEthos;

/**
 * 
 * This class is an door object that will be used as part of the panel switch class.
 * This class is representative of a door object and will be used for security type doors.
 * 
 * @Group1
 */
public class Door {
	
	private String door; //This attribute will be named after a door that is located in the building.
	private String doorLocation; // This attribute will be used locate where this object belongs in the building.
	/*
	 * The swithOn operator will be called when passes validation. 
	 * This will open the door for the person that needs to pass through the door.
	 */
	public void switchOn() {
	}
	
	/*
	 * This switchOff operator occurs when the person has passed through the door. 
	 * This will cause the door to lock behind them. 
	 * This prevents an unauthorized personnel to enter.
	 */
	public void switchOff() {
	}
	

}
