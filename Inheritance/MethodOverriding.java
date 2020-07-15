class MethodOverridingExample{
	public void add(int num1,int num2){
		int result1=num1+num2;
		System.out.println("Result of parent class method is "+result1);
	}
}

class OverriddenMethod extends MethodOverridingExample{
		public void add(int num1,int	num2){
			int result2=num1-num2;
			System.out.println("Result of overridden method is "+result2);
	}
}

class MainMethodOverriding{
	public static void main(String[] args){
	
	OverriddenMethod obj2=new OverriddenMethod();
	obj2.add(7,5);
	}
}