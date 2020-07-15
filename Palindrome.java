import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		String a,b="";
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		a=sc.nextLine();
		int n=a.length();
		for(i=n-1;i>=0;i--)
		{
			 b = b + a.charAt(i);
		}
		if(a.equals(b))
		{
			System.out.println("The entered string is a palindrome");
		}
		else
		{
			System.out.print("The entered string is not a palindrome");
		}
	}
}