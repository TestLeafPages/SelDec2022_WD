package week1.day2;

public class LearnLogicalOperators {

	public static void main(String[] args) {
//     dataType variable assignment operator value		
		int       num1     =                 10;
		int       num2     =                  5;
		int       num3     =                 20;
		
		System.out.println(num1 > num2 && num1 > num3);//true &&  false ->false
		System.out.println("=================");
		System.out.println(num1 < num2 && num2 < num3);//false && true ->false
		System.out.println("=================");
		System.out.println(num2 < num3 || num1 < num2);//true || false ->true
		System.out.println("=================");

		

	}

}
