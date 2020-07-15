import java.util.Scanner;
class Count
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s;
		
		int i;
		int alp=0;
		int dig=0;
		int space=0;
		int other=0;
		System.out.print("Enter the string:");
		s=sc.nextLine();
		char[] ch = s.toCharArray();
		int n=s.length();
		for(i=0;i<n;i++)
		{
			if(Character.isLetter(ch[i])){
				alp ++ ;
			}
			else if(Character.isDigit(ch[i])){
				dig ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				other ++;
			}
		}
		System.out.println("The number of alphabets are " +alp);
		System.out.println("The number of digits are " +dig);
		System.out.println("The number of white spaces are " +space);
		System.out.println("The number of other characters are " +other);
		
	}
}