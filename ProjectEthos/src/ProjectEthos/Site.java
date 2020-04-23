package ProjectEthos;

/**
 * 
 * This class is a site object, it is representative of a physical location.
 * This object will be use for Ethos to manage door security, schedules, and access.
 * Every site and location has a unique security, schedules, and access.
 * 
 * 
 */

public class Site {
	
	private String buildingName; //This will define the name of the building.
	private String nameLocation; // This will define the name of the building's locations.
	private int locationID; //This will be used identify the building.
	
	/**
	 * This operator will list all the locations that belong to the building object.
	 * A building can have multiple locations. This will be useful when assigning  
	 * schedules, doors, and access types.
	 */
	public void listLocations() {
	}

}
