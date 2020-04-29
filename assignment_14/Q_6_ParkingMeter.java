package assignment_14;

public class Q_6_ParkingMeter {
	
	private int timeLeft;
	private int maxTime;
	
	
	public Q_6_ParkingMeter(int maxTime) {
		this.timeLeft = 0;
		this.maxTime = maxTime;
	}

	
	public boolean add (int quarter) {

		boolean isAdd=false;
		
		if ((quarter==25) && ((timeLeft+30)<=maxTime)) {
			
			setTimeLeft(timeLeft+30);
			
			isAdd=true;
		}
		return isAdd;
	}
	
	
	public void tick() {
		
		if (timeLeft>0) {
		setTimeLeft(timeLeft-1);
		}
	}
	
	public boolean isExpired() {
		
		if (timeLeft==0) {
			return true;
			
		} else {
			return false;
		}
	}
	
	
	public int getTimeLeft() {
		return timeLeft;
	}


	public void setTimeLeft(int timeLeft) {
		this.timeLeft = timeLeft;
	}


	@Override
	public String toString() {
		return "ParkingMeter [timeLeft=" + timeLeft + ", maxTime=" + maxTime + "]";
	}

	

}
