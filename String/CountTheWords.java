import java.util.Scanner;

class CountTheWords
{
    public static void main(String[] args)
    {
        System.out.println("Enter the string");
 
        Scanner sc = new Scanner(System.in);
 
        String s=sc.nextLine(); // reading a sentence with whitespace

        int count = 1; // to accomodate the first word's count

        String s1=s.trim(); // strings are immutable, so store in another

         for (int i = 0; i < s1.length()-1; i++) // untill the end
        {  

           if((s1.charAt(i) == ' ') && (s1.charAt(i+1) != ' '))
            {
                count++;
            }

         }

       System.out.println("Number of words in a string = "+count);
  
     }
}





