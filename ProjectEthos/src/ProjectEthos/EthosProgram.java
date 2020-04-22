package ProjectEthos;

/**
 * 
 * The ProjectEthos class will act as a master class. 
 * 
 * All classes will pass and receive commands from this class
 *
 */

public class EthosProgram {
	
	private String instanceName; //This attribute will detail the instance of Ethos that has been deployed.
	private String serverHost; //This attribute will detail the server Ethos is connected to
	private int serverPort; //This attribute will detail the port used by Ethos to connect to a server
	
	/*
	 * This operator will display the system status of Ethos. 
	 * All subsystems and connections will be reviewed and validated. 
	 */
	public void displayStatus() {
	}
	
	/*
	 * This operator will start Ethos
	 */
	public void Start() {
	}
	
	/*
	 * This operator will stop Ethos. 
	 * All connections to the Ethos will be terminated. 
	 */
	public void Stop() {
	}
	
}
