public class MyClass {	
	public static void main(String[] args) {
		Car car = new Car(6,"BMW");
		System.out.println(car);
	}
}

class Car {
	private int gear; 
	private String name;

	public Car() {
		this (0, "");
	}

	public Car(int gear, String name) {
		this.gear = gear;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Manufacturer: " + name + " \nGear: " + gear;
	}

}