package week2.day4;

public class Audi extends Car{
	
	public void airConditioning() {
		System.out.println("Audi class");
	}

	public static void main(String[] args) {
		Audi a = new Audi();
		a.airConditioning();
		a.fourSeater();
		a.soundHorn();
		a.applyBrake();
		a.soundProof();
	}
}
