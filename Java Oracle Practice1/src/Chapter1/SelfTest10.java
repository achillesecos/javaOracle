package Chapter1;

public class SelfTest10 {

	public SelfTest10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		double inches, meters;
		//int counter;
		
		//counter = 0;
		
		for(inches = 1; inches <= 144; inches++) {
			meters = inches/39.37;
			
			System.out.println(inches + " inches is " + meters + " meters.");
			
			if(inches % 12 == 0) {
				System.out.println();
			}
		}

	}

}
