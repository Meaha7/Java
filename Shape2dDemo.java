abstract class Shape2d       // Meaha 
{
	double base,height;
	abstract double area();
	abstract void display();     // Abstract Class
}

class Rectangle extends Shape2d 
{
	double area()
	{
		double Shape2d_area;
		Shape2d_area=base*height;   // Area of Rectangle Calculation
		return Shape2d_area;
	}
	void display()  // For Displaying
	{
		System.out.println("Base of Rectangle is     :"+base);
		System.out.println("Height of Rectangle is   :"+height);
		System.out.println("The area of Rectangle is :"+area());
		System.out.println();
	}
}
class Triangle extends Shape2d
{
	double area()          // Area of Rectangle Calculation
	{

		double Shape2d_area;
		Shape2d_area=0.5*base*height;
		return Shape2d_area;
	}
	void display()   // For Displaying
	{
		System.out.println("Base of triangle is    :"+base);
		System.out.println("Height of triangle is  :"+height);
		System.out.println("The area of triangle isz:"+area());
	
	}

}
class Shape2dDemo
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		r.base=10.0;                     //Assigning values of rectangle
		r.height=20.0;
		
		Triangle t=new Triangle();
		t.base=10.0;
		t.height=40.0;			//Assigning Values of Triangle
		
		r.display();
		t.display();
	}
}
