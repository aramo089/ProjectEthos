package ProjectEthos;

/**
 * 
 * This class is a SystemAPIGateWay object, this will hold all the system so Ethos 
 * can interface with other systems.This will contain the name if the application, 
 * the server address, the aAdmin account and Admin password for the systems.
 * 
 * @Group1
 */

public class SystemAPIGateWay {
	
	private String systemName; // This attribute will be the descriptor for the system to be connected to.
	private String serverAddress; //This attribute will be used to hold the server address for the system to connect.
	private String adminAccount; //This attribute will contain the account UserName information for Ethos to interface with.
	private String adminPassword;//This attribute will contain the account password for Ethos to interface with.
	
	/**
	 * This operator will contain the protocol information to interface with the other systems API. Each system 
	 * has it's own set of commands. This is where the logic for the application will be built to then be sent via the
	 * sendCommand operator.
	 */
	public void interfaceCommand() {
	}
	
	/**
	 * This operation will send the interfaceCommand to the system. This is crucial for 
	 * Ethos to then interface with the system. The sendcommand operator will contain the 
	 * interface command information to connect, enter the username and password. It will ensure that the system is connected.
	 */
	public void sendCommand() {
	}

}
