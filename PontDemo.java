import java.util.*;
                                  // Done By Meaha
class Point
{
	private double x;         // Data Members
	private double y;

	public Point()            //Default Constructor                
	{
		x=0;
		y=0;
	}
	 
	public Point(double a,double b)   // Parameterised Constructor
	{
		x=a;
		y=b;
	}
	
	public Point(Point p)             //Copy Constuctor
	{
		x=p.x;
		y=p.y;
	}
	
	public double find_distance(double a, double b)  //Method With double parameters
	{
		double dist= Math.sqrt((x-a)*(x-a) + (y-b)*(y-b));
		return dist;
	}

	public double find_distance(Point p) // Method with  Parameter of type Point
	{
		double dist= Math.sqrt((p.x-x)*(p.x-x) + (p.y-y)*(p.y-y));
		return dist;
	}

	public void displayPoint()   // Method to display Point
	{
		System.out.println("("+x+","+y+")");
	}
}  

public class PointDemo
{
	public static void main(String[] args)   //Main function
	{
		Point p1=new Point(3.25,7.89);    // Points
		Point p2=new Point(5.37,18.12);
		Point p3=new Point(p2);

		System.out.println();
		System.out.println("================================================================");
	
		System.out.println(" The Three Points Are :");
		System.out.println();

		System.out.print(" Point P1 is ");
		p1.displayPoint(); 	

		System.out.print(" Point P2 is ");   
		p2.displayPoint(); 	

		System.out.print(" Point P3 is ");
		p3.displayPoint(); 	

		double r1=p1.find_distance(7.9,16.25);
		System.out.println(" Distance between Point 1(3.25,7.89) & Point 2(7.9,16.25)) = "+r1);
		double r2=p1.find_distance(p3);

		System.out.println(" Distance Between Point 1(3.25,7.89) & Point 3(5.37,18.12) = "+r2);
		System.out.println("================================================================");
	}
}
