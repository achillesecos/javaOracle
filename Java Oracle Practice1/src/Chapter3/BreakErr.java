package Chapter3;

public class BreakErr {

	public BreakErr() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one: for(int i = 0; i < 3; i++) {
			System.out.println("Pass " + i + ": ");
		}
		for(int j = 0; j < 100; j++) {
			if(j == 10) break one;
			System.out.println(j + " ");
		}
	}

}
