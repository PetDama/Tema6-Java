
public class AvioaneComerciale extends Avion {
	
	protected int maxNumberOfPassengers;
	
	public AvioaneComerciale(String planeID, int totalEnginePower, int maxNumberOfPassengers) {
		super(planeID, totalEnginePower);
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
	
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}

	
}
