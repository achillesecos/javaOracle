package Chapter3;

public class DWDemo {

	public DWDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		char ch;
		
		do {
			System.out.print("Press a key follwed by ENTER: ");
			ch = (char)System.in.read();
		}
		while(ch != 'q');
	}

}
