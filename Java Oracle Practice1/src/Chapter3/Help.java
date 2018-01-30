package Chapter3;

public class Help {

	public Help() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
		throws java.io.IOException {
		
		char choice;
		
		System.out.println("Help on:");
		System.out.println("  1. if");
		System.out.println("  2. switch");
		System.out.println("Choose one: ");
		
		choice = (char)System.in.read();
		
		System.out.println("\n");
		
		switch(choice) {
		case '1': 
			System.out.println("The if:\n");
			System.out.println("if(condition) statement;");
			System.out.println("else statement;");
		}
		
		

	}

}
