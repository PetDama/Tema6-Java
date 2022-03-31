
public class Avion {
	
	protected String planeID;
	protected int totalEnginePower;
	
	public Avion(String planeID, int totalEnginePower) {
		this.planeID = planeID;
		this.totalEnginePower = totalEnginePower;
	}
	
	public String getPlaneID() {
		return planeID;
	}
	public int getTotalEnginePower() {
		return totalEnginePower;
	}
	
	public String takeOff() {
		return "PlaneID: " +  this.planeID + " " + "Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking off - retracting gear -Takeoff complet";
		
	}
	
	public String fly() {
		return "PlaneID + " + this.planeID+ " Flying. ";
	}
	
	public String land() {
		return "PlaneID " + this.planeID + "Initiating landing procedure - Enabling airbrakes -\r\n"
				+ "Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing\r\n"
				+ "complete";
	}
}
