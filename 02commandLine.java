// import java.util.*;
class Sum
{
	public static void main(String[] args) 
	{
		int i,j,sum=0;
		if (args.length==0) 
		{
			System.out.println("No input is given to command line");
		}
		else
		{
			for (i=0;i<args.length;i++ )
			{
				j=Integer.parseInt(args[i]);
				sum=sum+j;
			}
			System.out.println("Sum is "+sum);
		}

	}
}