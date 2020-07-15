import java.util.*;
import java.lang.*;

class Quadratic
{
	static void quadratic(int a,int b,int c)
	{
		int d;
		d=b*b-4*a*c;
		if (d<0)
		{
			System.out.println("No real solutions");
		}
		else 
		{
			System.out.println("Solution 1:"+((-b+d)/4*a));
			System.out.println("Solution 2:"+((-b-d)/4*a));
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a,b and c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		quadratic(a,b,c);
	}
}