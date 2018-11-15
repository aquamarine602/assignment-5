package cspik3.assignment_5;

import java.util.Scanner;
import static java.lang.System.out;

public class Hex_to_bin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// initialize some variables
		final int A = 128;
		final int B = 64;
		final int C = 32;
		final int D = 16;
		final int E = 8;
		final int F = 4;
		final int G = 2;
		final int H = 1;
		
		int inputnum = 0;
		int whats_left;
		

		String biannum = "";		// string for binary
			
		// gets hex digit from user
		out.println("Enter a hex digit 0-9 or A-F:");
		String input_thing = input.nextLine();
			
		// if not valid hex digit
		if (input_thing.length() != 1) {
			out.println("You must enter exactly one character.");
			System.exit(1);
		}
			
		// char for hex digit
		char ch = Character.toUpperCase(input_thing.charAt(0));
		
		// if hex is a letter
		if (ch <= 'F' && ch >= 'A') {
			inputnum = ch - 'A' + 10;
		
		// if hex is digit	
		} else if (Character.isDigit(ch)) {
			inputnum = Integer.parseInt(input_thing);
		
		// if hex is letter past F
		} else {	
			out.println(ch + " is invalid input.");
			System.exit(1);
		}

		whats_left = inputnum;

		// gets binary number of the hex digit
		if (inputnum >= A) {
			whats_left = whats_left - A;
			biannum = biannum + "1";
		} else {
			biannum = biannum + "0";
		}
		
		if (whats_left >= B) {
			whats_left = whats_left - B;
			biannum = biannum + "1";
		} else {
			biannum = biannum + "0";
		}
		
		if (whats_left >= C) {
			whats_left = whats_left - C;
			biannum = biannum + "1";
		} else {
			biannum = biannum + "0";
		}
		
		if (whats_left >= D) {
			whats_left = whats_left - D;
			biannum = biannum + "1";
		} else {
			biannum = biannum + "0";
		}
			
		
		if (whats_left >= E) {
			whats_left = whats_left - E;
			biannum = biannum + "1";
		} else {
			biannum = biannum + "0";
		}
		
		if (whats_left >= F) {
			whats_left = whats_left - F;
			biannum = biannum + "1";
		} else {
			biannum = biannum + "0";
		}
		
		if (whats_left >= G) {
			whats_left = whats_left - G;
			biannum = biannum + "1";
		} else {
			biannum = biannum + "0";
		}
		
		if (whats_left >= H) {
			whats_left = whats_left - H;
			biannum = biannum + "1";
		} else {
			biannum = biannum + "0";
		}
		
		// displays binary number of hex digit
		out.println("\nThe binary number for " + input_thing + " is " + biannum);
			
		


	}

}
