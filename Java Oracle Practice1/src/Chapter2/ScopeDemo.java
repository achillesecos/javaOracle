package Chapter2;

public class ScopeDemo {

	public ScopeDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int x;
		
		x = 10;
		if(x == 10) {
			int y = 20;
			System.out.println("x and y: " + x + " " + y);
		}
		//y= 100;
		System.out.println("x is " + x);
	}

}
