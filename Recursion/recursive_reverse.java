public class StringReverse
{
    public static void main(String args[])
    {
        System.out.println(myReverse("abcd"));
    }
static String myReverse(String str)
{
if ((str==null)||(str. length() <= 1) )
return str;
return myReverse(str. substring(1)) + str. charAt(0);
}
}