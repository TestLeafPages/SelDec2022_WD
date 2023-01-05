package week2.day4;

public class MYVehicle {

	public static void main(String[] args) {
		Audi audi = new Audi();
		audi.airConditioning();
		audi.fourSeater();
		audi.applyBrake();
		audi.soundHorn();
		
		BMW bm = new BMW();
		bm.autoGear();
		bm.fourSeater();
		bm.soundHorn();
		bm.applyBrake();
	
		Bajaj b = new Bajaj();
		b.autoStart();
		b.threeTier();
		b.applyBrake();
		b.soundHorn();
		
		

	}

}
