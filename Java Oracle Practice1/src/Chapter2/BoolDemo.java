package Chapter2;

public class BoolDemo {

	public BoolDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		boolean b;
		
		b = false;
		System.out.println("b is " + b);
		
		b = true;
		System.out.println("b is " + b);
		
		if(b) System.out.println("This is not executed");
		
		System.out.println("10 > 9 is " + (10 > 9));

	}

}
