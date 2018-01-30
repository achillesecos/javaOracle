package Chapter2;

public class PromDemo {

	public PromDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		byte b;
		int i;
		
		b = 10;
		i = b* b;
		
		b = 10;
		b = (byte)(b * b);
		
		System.out.println("i and b: " + i + " " + b);

	}

}
