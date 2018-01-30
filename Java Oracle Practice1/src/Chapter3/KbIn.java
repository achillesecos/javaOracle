package Chapter3;

public class KbIn {

	public KbIn() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
		throws java.io.IOException {
			char ch;
			System.out.print("Press a key followed by ENTER: ");
			
			ch = (char) System.in.read();
			
			System.out.println("Your key is: " + ch);
		}

}
