package assignment_14;

public class Q_5_TVTest {

	public static void main(String[] args) {
		/*	
		TV tv1 = new TV();
		
		System.out.println(tv1.toString());
		
		tv1.turnOn();
		tv1.channelUp();
		tv1.volumeUp();;
		System.out.println(tv1.toString());
		
		tv1.turnOn();
		tv1.setBrand("Sony");
		tv1.setVolumeLevel(5);
		tv1.setChannel(119);
		
		tv1.getBrand();
		tv1.getChannel();
		tv1.getVolumeLevel();
		tv1.channelDown();
		tv1.channelUp();
		tv1.volumeUp();
		tv1.volumeDown();
		
		System.out.println(tv1.toString());
	 */
		
	Q_5_TV tv2 = new Q_5_TV("LG");
	System.out.println(tv2.toString());
	
	tv2.turnOn();
	tv2.channelUp();
	tv2.volumeUp();
	tv2.isOn();
	tv2.turnOn();
	tv2.setBrand("SAMSUNG");
	System.out.println(tv2.toString());
	
		
	}

}
