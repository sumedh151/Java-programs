import java.util.*;
class Recursion
{
	int hcf(int n1, int n2)
    {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }
	
	int power(int a,int r)
	{
		if(r==0)
			return 1;
		else
			return a*power(a,r-1);
	}
	
	public static int fibonacci(int n)
	{ 
		if(n== 1|| n==2)
		{ 
			return 1; 
		} 
		
		return fibonacci(n-1) + fibonacci(n-2); 
	}
	
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		Recursion ob=new Recursion();
		
		System.out.println("Menu :\n1.HCF and LCM\n2.Power\n3.Fibonacci\nSelect a choice: ");
		int ch=sc.nextInt();
		int a,b;
		switch(ch)
		{
			case 1:
			System.out.println("Enter 2 numbers : ");
			System.out.println("a: ");
			a=sc.nextInt();
			System.out.println("b: ");
			b=sc.nextInt();
			int h=ob.hcf(a,b);
			int l=(a*b)/h;
			
			System.out.println("HCF : "+h+"\nLCM : "+l);
			
			break;
			
			case 2:
			System.out.println("Evaluates a^b :");
			System.out.println("a: ");
			a=sc.nextInt();
			System.out.println("b: ");
			b=sc.nextInt();
			
			System.out.println("a^b = "+ob.power(a,b));
			break;
			
			case 3:
			System.out.println("Enter number of terms : ");
			a=sc.nextInt();
			System.out.print("0 ");
			for(b=1;b<=a-1;b++)
				System.out.print(ob.fibonacci(b)+" ");
			break;
			
			default:
			System.out.println("Wrong choice ");
		}
	}
}
		
