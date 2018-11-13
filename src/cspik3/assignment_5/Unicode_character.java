package cspik3.assignment_5;

import java.util.Scanner;
import static java.lang.System.out;

public class Unicode_character {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		// gets user input
		
		// gets char user wants to convert
		out.println("Enter a character:");
		String chara = input.nextLine();
		char character = chara.charAt(0);	// translates string input
											// into char
		// converts character into unicode
		int unicode = (int)character;
		out.println("\nUnicode for the character " + chara + ":");
		out.print(unicode);

	}

}
