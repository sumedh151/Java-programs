class Palindrome
{
	static void pal(int i)
	{
		int n=i;
		int sum=0,t,pali=0;
		while(n!=0)
		{
			t=n%10;
			sum=sum+t;
			pali=pali*10+t;
			n=n/10;
		}
		System.out.println("Sum is "+sum);
		if (i==pali) 
		{
			System.out.println(i+" is Palindrome.");
		}
		else System.out.println(i+" is not Palindrom.");
	}
	public static void main(String[] args)
	{
		int i;
		i=Integer.parseInt(args[0]);
		pal(i);	
	}
}