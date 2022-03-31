
public class Main {

	public static void main(String[] args) {

		Avion normalPlane = new Avion ("31NP", 2000);
		AvioaneComerciale comercial = new AvioaneComerciale ("32CP", 1800, 300);
		Concorde CNCRD = new Concorde("33CC", 12000, 1050);
		Boeing BoeingPlane = new Boeing("34BO", 3200, 45);
		AvioaneDeLupta militaryPlane = new AvioaneDeLupta("35MP", 3500);
		Mig mig = new Mig("36MG", 6500);
		F14 TomCat = new F14("37", 8500);
		TomCat.launchMissile();
		militaryPlane.launchMissile();
		System.out.println(normalPlane.getPlaneID());
	}

}
