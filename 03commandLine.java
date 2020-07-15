import java.util.*;
class Arithematic
{
	public static void main(String[] args) 
	{
		int i,j;
		if (args.length!=2) 
		{
			System.out.println("Invalid input");
		}
		else
		{
			i=Integer.parseInt(args[0]);
			j=Integer.parseInt(args[1]);

			System.out.println(("Sum is: ")+(i+j));
			System.out.println(("Difference is: ")+(i-j));
			System.out.println(("Product is: ")+(i*j));
			System.out.println(("Quotient is: ")+((double)i/(double)j));
			System.out.println(("Remainder is: ")+(i%j));
		}
	}
}