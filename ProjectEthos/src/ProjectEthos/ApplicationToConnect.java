package ProjectEthos;


/**
 * 
 * This class will allow external and third party applications to connect to Project Ethos.
 * 
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ApplicationToConnect {

	private String applicationAccount; //This attribute will detail the application that is connecting to Ethos
	private String applicationPassword; //This attribute will store the password used to authenticate with Ethos
	private ArrayList sysCommands; //This array will list commands that can be used against Ethos
	
	/**
	 *The connect operator will allow for a connection to be established between Ethos and the connecting application 
	 */
	public void connect() {
	}
	/**
	 *The disconnect operator will allow for the connection to be terminated between Ethos and the connecting application 
	 */
	public void disconnect() {
	}
	
	/**
	 * The appCommand operator will use the commands within ArrayList to generate commands based on what is supported by the connected application.
	 */
	public void appCommand() {
	}
	
	/**
	 * The sendCommand operator will allow for two way communication between Ethos and the connected application
	 */
	public void sendCommad() {
	}
	
	/**
	 *The getSystemLicenses will validate the application connecting to Ethos.
	 *It will also verify that the application has the appropriate permissions within Ethos to connect.
	 */
	
	public void getSystemLicenses() {
	}
	
	
}
