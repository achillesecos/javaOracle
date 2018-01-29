package Chapter2;

public class Inches {

	public Inches() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		long ci;
		long im;
		
		im = 5280 * 12;
		ci = im * im * im;
		
		System.out.println("There are " + ci + " cubic inches in cubic mile.");

	}

}
