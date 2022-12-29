package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		//Find the factorial for 5
		//Ouput=5!=5*4*3*2*1=120
		int input=5;
		int fact=1;
		for (int i = input; i >=1; i--) {
			fact=fact*i;//5*4=20*3=60*2=120*1=120
			
		}
 
		System.out.println(fact);
		

	}

}
