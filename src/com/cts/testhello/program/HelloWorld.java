package com.cts.testhello.program;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello,world!");

		// print the content and then go to the next line
		System.out.println("hello,Prashant!");

		// print the content in same line
		System.out.print("Prashant");
		System.out.print(" Anand Jadhav");
		System.out.print(" From ,Belgaum");
		System.out.println();

		// Print formated content and then stay on same line
		System.out.printf("%s is completed BE, USNO  %d and graduation  academy status is %b", "Prashant", 25, false);
		System.out.println();

		// Formated the digitd and then print the formated content and then stay on same
		// line
		System.out.format("total bill is%.2f", 500.988888);
		System.out.println();

		// join multiple print statements together
		System.out.append("my name is Prashant Jadhav").append(" ,im from belgaum");
		System.out.println();

		// Print the char based on ASCII value
		System.out.write(65);
		System.out.println();

		// adding break point when we are getting an error
		System.out.println("step 1" + 5 /(4 + 7 + 3));

	}

}
