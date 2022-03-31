
public class F14 extends AvioaneDeLupta {

	public F14(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
	}
		
		public void refuel() {
			System.out.println("PlaneID: " + this.planeID
					+ "Initiating refueling procedure - Locating refueller - Catching up - Refueling - Refueling complete.");
		}
	}