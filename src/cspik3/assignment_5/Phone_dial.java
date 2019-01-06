package cspik3.assignment_5;

import java.util.Scanner;
import static java.lang.System.out;

public class Phone_dial {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		out.print("Enter a letter: ");
		String letter_ = input.next();
		letter_ = letter_.toLowerCase();
		char let = letter_.charAt(0);
		String letter = let + "";
		
		String two = "abc";
		String three = "def";
		String four = "ghi";
		String five = "jkl";
		String six = "mno";
		String seven = "pqrs";
		String eight = "tuv";
		String nine = "wxyz";
		
		out.print("The corresponding number is ");
		
		if (two.contains(letter)) {
			out.println("2.");
		} else if (three.contains(letter)) {
			out.println("3.");
		} else if (four.contains(letter)) {
			out.println("4.");
		} else if (five.contains(letter)) {
			out.println("5.");
		} else if (six.contains(letter)) {
			out.println("6.");
		} else if (seven.contains(letter)) {
			out.println("7.");
		} else if (eight.contains(letter)) {
			out.println("8.");
		} else if (nine.contains(letter)) {
			out.println("9.");
		} else {
			out.println("invalid.");
		}
		
		
		
	}

}
