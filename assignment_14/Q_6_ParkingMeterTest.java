package assignment_14;

public class Q_6_ParkingMeterTest {

	public static void main(String[] args) {
		
		
		Q_6_ParkingMeter park1 = new Q_6_ParkingMeter(120);
		
		System.out.println(park1.toString());
		
		park1.add(25);
	
		System.out.println(park1.toString());
		
		park1.tick();
		
		System.out.println(park1.toString());
	}

}
