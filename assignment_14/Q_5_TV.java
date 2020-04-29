package assignment_14;

public class Q_5_TV {
	
	private int channel = 1;
	private int volumeLevel = 1;
	boolean on = false;
	private String brand = "undefined";
	
	
	public Q_5_TV() {
		
		System.out.println("Creating TV object using no Args- constructor");		
	}


	public Q_5_TV(String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor");
	}

	
	public void channelUp() {
		setChannel(channel+1);
		
	}
	
	public void volumeUp() {
		setVolumeLevel(volumeLevel+1);
		
	}
	
	public void channelDown() {
		setChannel(channel-1);
		
	}
	
	public void volumeDown() {
		setVolumeLevel(volumeLevel-1);
		
	}
	
	public boolean isOn() {
	
		return on;
	}
	
	public void turnOn() {
		
		if (isOn()) {
			System.out.println("TV is already ON");
			
		} else {
			on=true;
		}
	}
	
	public void turnOff() {
		
		if (!isOn()) {
			
			System.out.println("TV is already OFF");
			
		} else {
			
			on=false;
		}
		
	}

	
	public int getChannel() {
		return channel;
	}


	public void setChannel(int channel) {
		
		if ((isOn()) && (channel>0 && channel<=120)) {
			
			this.channel = channel;
			
		} else {	
			System.out.println("ERROR : TV is either OFF or invalid Channel");
		
		}
		
	}


	public int getVolumeLevel() {
		return volumeLevel;
	}


	public void setVolumeLevel(int volumeLevel) {
		
		if ((isOn()) && (volumeLevel<=7 && volumeLevel>=1)) {
			
			this.volumeLevel = volumeLevel;
			
		} else {	
			System.out.println("ERROR : TV is either OFF or invalid Volume Level");
		
		}
	
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volumeLevel=" + volumeLevel + ", on=" + on + ", brand=" + brand + "]";
	}
	
	
	
	
	

}
