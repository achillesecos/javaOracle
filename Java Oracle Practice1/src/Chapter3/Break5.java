package Chapter3;

public class Break5 {

	public Break5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		done:
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < 10; j++) {
					for(int k = 0; k < 10; k++) {
						System.out.println(k + " ");
						if(k == 5) break done;
					}
					System.out.println("After k loop");
				}
				System.out.println("After j loop");
			}
			System.out.println("After i loop");
	}

}
