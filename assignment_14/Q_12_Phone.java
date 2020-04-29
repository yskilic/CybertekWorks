package assignment_14;

public class Q_12_Phone {
	
	private String phoneName = "SAMSUNG";
	private String phoneModel = "S20";
	private int phoneMemory;

	@Override
	public String toString() {
		return "[ PHONE: " + phoneName + " | MODEL: " + phoneModel + " | MEMORY: " + phoneMemory + " GB ]";
	}

	public int getPhoneMemory() {
		return phoneMemory;
	}

	public void setPhoneMemory(int phoneMemory) {
		this.phoneMemory = phoneMemory;
	}
	
	

}
