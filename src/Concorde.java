
public class Concorde extends AvioaneComerciale {

	

	public Concorde(String planeID, int totalEnginePower, int maxNumberOfPassengers) {
		super(planeID, totalEnginePower, maxNumberOfPassengers);
	
	}
	public void goSuperSonic() {
		System.out.println("PlaneID: " + this.planeID + " - Super-Sonic mode activeted");
	}
	public void goSubSonic() {
		System.out.println("PlaneID: " + this.planeID + " - Super-Sonic mode activeted");
	}
}
