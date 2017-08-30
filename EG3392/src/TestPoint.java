import java.text.DecimalFormat;
import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat two = new DecimalFormat("#.00");
	//	  String angleFormated = two.format(g);
		//  System.out.println(angleFormated);
		

		
		System.out.println("Program will calculate the distance between two points.");
		
		System.out.println("Enter x value for point 1:");
		int x1 = keyboard.nextInt();
		System.out.println("Enter y value for point 1:");
		int y1 = keyboard.nextInt();
		System.out.println("Enter x value for point 2:");
		int x2 = keyboard.nextInt();
		System.out.println("Enter y value for point 2:");
		int y2 = keyboard.nextInt();
		
		ThePoint p1 = new ThePoint(x1,y1);
		ThePoint p2 = new ThePoint(x2,y2);
		
		System.out.print("The points are ");
		ThePoint.CombinedPoint(x1,y1);
	    System.out.print(" and ");
	    ThePoint.CombinedPoint(x2,y2);
	    System.out.println(".");
	    
	    System.out.println("The Distance is " + two.format(ThePoint.getDistance(p1,p2)));
		
	}
}

	
