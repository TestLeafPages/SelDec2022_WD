package week1.day2;

public class LearnReturnType {

	public void addTwoNumbers() {
		int num1=10;
		int num2=20;
		System.out.println("Addition");
		System.out.println(num1+num2);
		
	}
	
	public int subTwoNumbers(int num1,int num2) {
		//System.out.println("Subtraction of numbers");
	     return num1-num2;

	}
	
	   public boolean switchOff() {
		   return true;
	}
	   
	   public String getPhoneColor() {
		   return "pink";
	}
	
	
	
	public static void main(String[] args) {
		LearnReturnType lr = new LearnReturnType();
		lr.addTwoNumbers();
		int result = lr.subTwoNumbers(55, 35);//ctrl+2,L
		System.out.println("Subtraction :"+result);
		System.out.println(lr.switchOff());
		System.out.println(lr.getPhoneColor());
		
	}
}
