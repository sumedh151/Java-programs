import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args)
    {
        String str = "Good Morning";
        String str1=" ";
 
     //   char[] strArray = str.toCharArray();
 
         for (int j=0,i = str.length() - 1; i >= 0; i--,j++)
        {
            str1.charAt(j) = str.charAt(i);
        }
    System.out.print("The reversed string is "+str1);
    }

}