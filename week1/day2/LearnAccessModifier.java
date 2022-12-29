package week1.day2;

public class LearnAccessModifier {
	
	public void accessAtm() {
		System.out.println("Cash withdrawn");

	}
	
	private void creditCard() {
		System.out.println("Do not share it to anyone");
	}
	
	void spellCheck() {
		System.out.println("Check properly");
	}
	
	public static void main(String[] args) {
		LearnAccessModifier lam = new LearnAccessModifier();
		lam.accessAtm();
		lam.creditCard();
		lam.spellCheck();
	}
	

}
