abstract class shape
{
	abstract double area();
}
class square extends shape
{
	double side;
	square(double side)
{
	this.side=side;
}
double area()
{
	double areas=side*side;
	 return areas;
}
}
class rectangle extends shape
{
	double length;
	double breadth;
	rectangle(double length,double breadth)
{
	this.length=length;
	this.breadth=breadth;
}
double area()
{
	double arear=length*breadth;
	 return arear;
	
}
}
public class AbstractClass
{
	public static void main(String[]args)
{
	square s=new square(5);
		
	System.out.println("Area of square:"+s.area());
	 rectangle r =new rectangle(5,6);
	System.out.println("Area of rectangle:"+r.area());
}
}
	                                                                       


