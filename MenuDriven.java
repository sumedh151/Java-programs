import java.util.Scanner;
class MenuDriven
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the required option: ");
		System.out.println("1.Factorial\n2.Reverse\n3.Armstrong\n4.Palindrome\n5.Prime\n6.Fibonacci\n");
		
		System.out.print("Enter choice:");
		n=sc.nextInt();
		switch(n)
		{
			case 1:
				factorial();
				break;
			case 2:
				reverse();
				break;
			case 3:
				armstrong();
				break;
			case 4:
				palindrome();
				break;
			case 5:
				prime();
				break;
			case 6:
				fibonacci();
				break;
			default:
				System.out.print("Wrong choice");
				return;
		}
		
	}
	public static void factorial()
	{
		int a,i,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		a=sc.nextInt();
		for(i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of"+a+"is:" +fact);
	}
	
	public static void reverse()
	{
		int a,rev=0,temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		a=sc.nextInt();
		while(a>0)
		{
			temp=a%10;
			rev=rev*10+temp;
			a=a/10;
		}
		System.out.println("The reversed number is: "+rev);
	}
	
	public static void armstrong()
	{
		int a,temp,b,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		a=sc.nextInt();
		temp=a;
		while(a>0)
		{
			b=a%10;
			a=a/10;
			c=c+(b*b*b);
		}
		if(temp==c)
			System.out.println("It is an armstrong number");
		else
			System.out.println("It is not an armstrong number");
	}
	
	public static void palindrome()
	{
		int a,r,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		a=sc.nextInt();
		temp=a;
		while(a>0)
		{
			r=a%10;
			sum=(sum*10)+r;
			a=a/10;
		}
		if(temp==sum)
			System.out.print("It is a palindrome");
		else
			System.out.print("It is not a palindrome");
	}
	
	public static void prime()
	{
		int a,i=2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		a=sc.nextInt();
		while(a%i!=0)
		{
			i++;
		}
		if(a==i)
			System.out.print("It is a prime number");
		else
			System.out.print("It is not a prime number");
	}
	
	public static void fibonacci()
	{
		int no,a=0,b=1,c,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		no=sc.nextInt();
		System.out.println("The fibonacci series is:");
		if(no==1)
			System.out.print(a);
		else if(no==2)
			System.out.print(a+"\n"+b);
		else
		{
			System.out.println(a+"\n"+b);
			for(i=2;i<no;i++)
			{
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
		}
		
	}
}