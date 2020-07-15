import java.lang.*;
import java.io.*;
import java.util.*;
public class q8Vector
{
	public static void main(String args[])
	{
		Vector list = new Vector();
		int len=args.length;
		for(int i=0;i<len;i++)
		{
			list.addElement(args[i]);
		}
		int size=list.size();
		String str[]= new String[size];
		list.copyInto(str);
		for(int i=0;i<size;i++)
		{
			System.out.println ("Element of Vector at position "+i+":"+str[i]);
		}
	}
}