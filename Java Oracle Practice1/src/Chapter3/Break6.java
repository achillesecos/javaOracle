package Chapter3;

public class Break6 {

	public Break6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 0;
		
	stop1: for(x = 0; x < 5; x++) {
		for(y = 0; y < 5; y++) {
			if(y == 2) break stop1;
			System.out.println("x and y: " + x + " " + y);
		}
	}
		System.out.println();
		
			for(x = 0; x < 5; x++) 
	stop2:		{
				for(y = 0; y < 5; y ++) {
					if(y == 2) break stop2;
					System.out.println("x and y: " + x + " " + y);
				}
			}
		}

	}