package week1.day1;

public class Browser {
	//Global Variable
	String name="Subraja";
	
	public void launchChrome() {
		//Local variable
		char logo='A';
		System.out.println("Chrome Browser is launched");
		System.out.println(logo);
		System.out.println(name);
	}
	public void launchEdge() {
		
		System.out.println("Edge browser is launched");
		//System.out.println(logo);
		System.out.println(name);

	}
	
	public static void main(String[] args) {
		Browser br = new Browser();
		br.launchEdge();
	}

}
