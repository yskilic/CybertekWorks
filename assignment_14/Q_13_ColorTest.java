package assignment_14;

import java.util.Scanner;

public class Q_13_ColorTest {

	public static void main(String[] args) {
		
		System.out.print("Please enter the first number of rgb code : ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		System.out.print("Please enter the second number of rgb code : ");
		int g = sc.nextInt();
		
		System.out.print("Please enter the second number of rgb code : ");
		int b = sc.nextInt();
		
		Q_13_Color rgbColor = new Q_13_Color(r, g, b);
		
		System.out.println(rgbColor.toString());
	
	}

	@Override
	public String toString() {
		
		return super.toString();
	}

}
