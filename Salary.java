import java.util.*;
class Record
{
	String name;
	String d;
	boolean flag;
	double total;
	
	Scanner sc= new Scanner(System.in);
	
	Record()
	{
		name="";
		d="";
		flag=false;
	}
	
	public class Salary
	{
		double base,hra,da,bonus;
		Salary()
		{
			base=0;
			hra=3.5;
			da=5.0;
			bonus=10;
		}
	}
	
	Salary ob=new Salary();
	
	double compute()
	{
		return (ob.base+((ob.hra+ob.da)*(ob.base))/100.0);
	}
	
	double compute(double b)
	{
		b=ob.bonus*ob.base/100.0;
		return (ob.base+((ob.hra+ob.da)*(ob.base))/100.0+b);
	}
	
	void accept()
	{
		System.out.println("Enter name : ");
		name=sc.nextLine();
		System.out.println("Enter Designation : ");
		d=sc.nextLine();
		System.out.println("Enter Base Salary : ");
		ob.base=sc.nextDouble();
		System.out.println("Is "+name+" entitled to a bonus <True Or False> : ");
		flag=sc.nextBoolean();
		
		if(!flag)
			total=compute();
		else
		{
			System.out.println("Standard Bonus Entitled : "+ob.bonus+" %");
			total=compute(0);
		}
	}
	
	public String toString()
	{
		return ("Name : "+name+"\nDesignation : "+d+"\nTotal Salary: "+total);
	}
}

class MainA
{
	public static void main(String arg[])
	{
		Record ob=new Record();
		ob.accept();
		System.out.println(ob);
	}
}