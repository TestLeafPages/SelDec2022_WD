package week1.day1;

public class Car {
	
	//how to create a method
	//type method name-ctrl+space-enter
	public void driveCar() {
		 System.out.println("Drive the Car Carefully");

	}
	
	public void applyBrake() {
		System.out.println("Stop the Car");

	}
	
	public static void main(String[] args) {
		//ClassName objectname=new ClassName();
		Car obj = new Car();
		obj.applyBrake();
		obj.driveCar();
		
	}

}
