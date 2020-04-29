package assignment_14;

import java.util.Scanner;

public class Q_12_PhoneTest {

	public static void main(String[] args) {
		
		System.out.print("Please enter your phone memory size (Gigabytes) : ");
		
		Scanner sc = new Scanner(System.in);
		
		int memorySize = sc.nextInt();
		
		System.out.print("Please enter your picture quality (Megapixel) : ");
		
		int imageSize = sc.nextInt();
		
		sc.close();
		
		System.out.println();
		
		Q_12_CameraPhone c1 = new Q_12_CameraPhone(imageSize, memorySize);
		
	
	}

}
