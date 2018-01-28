package Chapter1;

public class ForDemo {

	public ForDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int count;
		
		for(count = 0; count < 5; count = count + 1) 
			System.out.println("This is count: " + count);
		System.out.println("Done!");
	}

}
