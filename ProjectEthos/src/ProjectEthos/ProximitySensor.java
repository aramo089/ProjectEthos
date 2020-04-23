package ProjectEthos;

/**
 * 
 * The ProximitySendor class will detail the proximity sensor that is assigned to a Door class.
 *
 */

public class ProximitySensor {
	
	private String sensorType;//This attribute will detail the type of Proximity sensor assigned to a Door class.
	private String sensorName;//This attribute will detail the name of Proximity Sensor assigned to a Door class.
	
	
	/**
	 * The open class will allow a door object to open when the proximity sensor is tripped.
	 */
	public void open() {
	}
	
	/**
	 * The close operator will send a close command to a door class once the proximity sensor is no longer detects motion.
	 */
	public void close() {
	}

}
