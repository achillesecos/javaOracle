package Chapter2;

public class NestVar {

	public NestVar() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int count;
		
		for(count = 0; count < 10; count++) {
			System.out.println("This is count: " + count);
			int count;
			for(count = 0; count < 2; count++) {
				System.out.println("This program is in error!");
			}
		}

	}

}
