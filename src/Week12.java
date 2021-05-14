import java.util.Scanner;

public class Week12 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
						
		System.out.println("Please Enter Side 1:");
		double side1 = in.nextDouble();
		
		System.out.println("Please Enter Side 2:");
		double side2 = in.nextDouble();
		
		System.out.println("Please Enter Side 3:");
		double side3 = in.nextDouble();
		
		Triangle tri = new Triangle(side1,side2,side3);
		
		System.out.println("Please Enter Color Of The Triangle");
		tri.color = in.next();
		
		System.out.println("Please Enter true If Triangle Is Filled Or Enter false If Triangle is Not Filled");
		tri.isFilled = in.nextBoolean();
		
		in.close();
		
		System.out.println("Area Of The Triangle is :"+ tri.getArea());
		System.out.println("Perimeter Of The Triangle is :"+ tri.getPerimeter());
		System.out.println("Color of The Triangle is:" + tri.color);
		System.out.println("Is The Triangle Filled? :"+ tri.isFilled);
		
		
	}
}
