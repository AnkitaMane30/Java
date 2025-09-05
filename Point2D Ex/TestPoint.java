package tester;
import com.app.geometry.Point2D;
import java.util.*;
public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter x-coordinate for point 1:");
		double x1=sc.nextDouble();
		System.out.println("Enter y-coordinate for point 1:");
		double y1=sc.nextDouble();
		
		System.out.println("Enter x-coordanate for point 2:");
		double x2=sc.nextDouble();
		System.out.println("Enter y-coordinate for point 2:");
		double y2=sc.nextDouble();
		
		Point2D p1=new Point2D(x1,y1);
		Point2D p2=new Point2D(x2,y2);
		
		System.out.println("Details of point 1:"+p1.getDetails());
		System.out.println("details of point 2:"+p2.getDetails());
		
		if(p1.isEqual(p2))
		{
			System.out.println("The points are same");
		}
		else {
			System.out.println("points are not same ");
			System.out.println("The distance between points are:"+p1.calcDistance(p2));
		}
		
	}

}
