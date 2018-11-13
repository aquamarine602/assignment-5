package cspik3.assignment_5;

import java.util.Scanner;
import static java.lang.System.out;

public class Dec_to_hex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		out.println("Enter a hex digit 0-9 or A-F:");
		String hex_string = input.nextLine();
    
		if (hex_string.length() != 1) {
			out.println("You must enter exactly one character.");
			System.exit(1);
		}
    
		char ch = Character.toUpperCase(hex_string.charAt(0));
		if (ch <= 'F' && ch >= 'A') {
			int value = ch - 'A' + 10;
			out.println("The decimal value for hex digit " + ch + " is " + value);
			
		} else if (Character.isDigit(ch)) {
			out.println("The decimal value for hex digit " + ch + " is " + ch);
    
		} else {	
			out.println(ch + " is invalid input.");
      
		}
  
  }

}