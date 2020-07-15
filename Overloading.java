
import java.util.*;
class Overloading
{
	public static void main(String args[])
	{
		float a,b,c;
		//float pi=3.14;
		Scanner x = new Scanner(System.in);
		a=x.nextFloat();
		b=x.nextFloat();
		c=x.nextFloat();
		area(a,b,c);
		area(a,b);
		area(a);
	}
	public static void area(float a)
	{
		double area;
		area=3.14*a*a;
		System.out.println("area of circle="+area);
	}
	public static void area(float a,float b)
	{
		float area;
		area=a*b;
		System.out.println("area of square="+area);
	}
	public static void area(float a,float b,float c)
	{
		double area,s,o;
		s=(a+b+c)/2;
		area=s*(s-a)*(s-b)*(s-c);
		o=Math.sqrt(area);
		System.out.println("area of triangle="+o);
	}
}	
