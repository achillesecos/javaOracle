package Chapter3;

public class ContDemo {

	public ContDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for(i = 0; i <= 100; i++	) {
			if((i % 2) != 0) continue;
			System.out.println(i);
		}
	}

}
