package Chapter2;

public class SelfTest10 {

	public SelfTest10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int x, y;
		boolean isPrime;
		
		for(x = 2; x < 100; x++) {
			isPrime = true;
			
			for(y = 2; y <= x/y; y++) {
				if(x % y == 0) {
					isPrime = false;
				}
				
			}
			
			if(isPrime) System.out.println(x +  " is prime.");
		}

	}

}
