package week3.day1;

public class LearnOverLoading {
int sum=0;
	//Overloading with 1 argument
	public void sum(int a) {
        System.out.println(a);
	}
		//Overloading with 2 arguments
	public void sum(int a,int b) {
       System.out.println(a+b);
	}

	//Overloading with 2 arguments with different datatype
	public void sum(int a,float b) {
          System.out.println(a+b);
	}
	public static void main(String[] args) {
		LearnOverLoading  ol = new LearnOverLoading();
		ol.sum(23, 34);
	}

}
