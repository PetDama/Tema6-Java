
public class Mig extends AvioaneDeLupta {

	public Mig(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
	}

	public void highSpeedGeometry() {
		System.out.println("PlaneID: " + this.planeID + "High speed geometry selected");
	}
	
	public void normalGeometry() {
		System.out.println("PlaneID: " + this.planeID + "Normal geometry selected");
	}
}
