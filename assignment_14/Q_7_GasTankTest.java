package assignment_14;

public class Q_7_GasTankTest {

	public static void main(String[] args) {
	
		Q_7_GasTank tank1 = new Q_7_GasTank(50);
		
		tank1.addGas(30);
		tank1.addGas(30);
		
		System.out.println(tank1.toString());
		
		tank1.useGas(25);
		System.out.println(tank1.fillUp());
		System.out.println(tank1.isFull());
		System.out.println(tank1.isEmpty());
		
		tank1.useGas(24.91);
		System.out.println(tank1.fillUp());
		System.out.println(tank1.isFull());
		System.out.println(tank1.isEmpty());
		System.out.println(tank1.getGasLevel());
		
		System.out.println(tank1.toString());
		
		

	}

}
