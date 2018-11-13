package cspik3.assignment_5;

import java.util.Scanner;
import static java.lang.System.out;

public class Ascii_code {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		// import input
		
		// input ascii to translate to char
		out.println("Enter an ASCII code:");
		int asciinum = input.nextInt();
		
		// char of ascii translation
		char letter = (char)asciinum;
		
		// print translation
		out.println("\nThe character for your ASCII code is:");
		out.print(letter);

	}

}
