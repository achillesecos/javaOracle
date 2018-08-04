package Chapter3;

public class BreakDemo {

	public BreakDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		num = 100;
		
		for(int i = 0; i < num; i++) {
			if(i * i >= num) break;
			System.out.print(i + " ");
		}
		System.out.println("Loop complete.");
	}

}
