import java.util.*;
class Area
{
	public static void main(String[] args) 
	{
		double r,area;
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter radius of circle: ");
		r=sc.nextDouble();

		area=3.1415*r*r;
		System.out.println("Area of circle with radius "+r+" is "+area);
	}
}