package ProjectEthos;

/**
 * 
 * The RFIDScanner class will detail the proximity sensor that is assigned to a Door class.
 *
 */

public class RFIDScanner {
	
	private String sensorType; //This attribute will detail the type of RFIDScanner  assigned to a Door class.
	private String sensorName; //This attribute will detail the name of the RFIDScanner assigned to a Door class.
	private String sensorMode; //This attribute will detail the mode the RFIDScanner assigned to a Door class is operating in.
	
	
	/**
	 * The open class will allow a door object to open when the RFIDScanner validates an ID Card.
	 */
	public void open() {
	}
	
	/**
	 * The close operator will send a close command to a door class once the RFIDScanner no longer detects a signal.
	 */
	public void close() {
	}


}
