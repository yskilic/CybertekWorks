package assignment_14;

public class Q_12_CameraPhone extends Q_12_Phone{

	
	private int imageSize;
	private int memorySize;
	
	
	public Q_12_CameraPhone(int imageSize, int memorySize) {
		super.setPhoneMemory(memorySize);
		this.imageSize = imageSize;
		System.out.println(super.toString());
		System.out.println("Your phone can hold " + numPictures() + " pictures (each of them " + imageSize + " megapixel)");
	}
	
	public int numPictures() {
		
		int numPictures;
		
		numPictures = ((super.getPhoneMemory()*1000)/imageSize);
		
		return numPictures;
	}
	
}
