import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		ASCII_converter ascii = new ASCII_converter();
		Binary_converter binary = new Binary_converter();
		Scanner std = new Scanner(System.in);
		
		// getting one character from the keyboard
		System.out.println("Please enter a character: ");
		char c = std.next().charAt(0);
		
		ascii.convert_character(c);
		binary.convert_character(c);
		
		// getting a text from the keyboard
		System.out.println("Please enter a small text: ");
		String text;
		do {
			text = std.nextLine();
		} while (text.length() < 1);
		
		ascii.convert_paragraph(text);
		binary.convert_paragraph(text);	
		
	}

}
