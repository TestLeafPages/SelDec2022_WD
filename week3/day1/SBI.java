package week3.day1;

public class SBI extends RBI{
	
	public void fixedDeposit() {
		 super.fixedDeposit();//to call the super class/parent class
		 System.out.println("14.5% interest rate");

	}
	
	public static void main(String[] args) {
		SBI s = new SBI();
		s.fixedDeposit();
	}

}
