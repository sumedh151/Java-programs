public import java.util.*;
public class VectorDemo
{
public static void main(String []cd)
{
Vector v=new Vector();
v.addElement("Java");
v.addElement(57);
v.addElement("C");
v.addElement(5.7);
System.out.println("\nVector After Adding Element :"+v);

System.out.println("\nSize of Vector :"+v.size());
System.out.println("\nElement At 0th Location :"+v.elementAt(0)); v.removeElement(57);
System.out.println("\nVector After removing Element :"+v); v.removeElement(5.7);
System.out.println("\nVector After removing Element :"+v); v.removeElementAt(0);
System.out.println("\nVector After removing Element From Given Index:"+v);

v.removeAllElements();
System.out.println("\nVector After removing Element :"+v); }
}