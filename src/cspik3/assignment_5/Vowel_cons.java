package cspik3.assignment_5;

import static java.lang.System.out;

import java.util.Scanner;

public class Vowel_cons {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		out.print("Enter a letter: ");
		String letter_ = input.next();
		char let = letter_.charAt(0);
		String letter = let + "";
		
		String vow = "aeiou";
		String up_vow = vow.toUpperCase();
		String cons = "bcdfghjklmnpqrstvwxyz";
		String up_cons = cons.toUpperCase();
		
		String vowels = vow + up_vow;
		String consonants = cons + up_cons;
		
		out.println("\n\n");
		
		if (vowels.contains(letter)) {
			out.println(letter + " is a vowel.");
		} else if (consonants.contains(letter)) {
			out.println(letter + " is a consonant.");
		} else {
			out.println(letter + " is invalid.");
		}
		

	}

}
