package edu.wit.cs.comp1000;

// Lily Salman

import java.util.Scanner;
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// variables for code
		double a, b, c;
		double d = 0;
		double r1 = 0;
		double r2 = 0;
		System.out.printf("Enter a b c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		//  discriminant equation
		d = (b*b) - (4*a*c);
		
		// if imaginary root
		if (d < 0) {
			System.out.printf("Roots: imaginary%n");
		}
		// if one root
		else if (d == 0) {
			r1 = -b/(2*a);
			System.out.printf("Root: %.2f%n", r1);
		}
		// if two roots
		else {
			r1 = (-b + Math.sqrt(d)) / (2*a);
			r2 = (-b - Math.sqrt(d)) / (2*a);
			
			// if first root < second root
			if (r1 < r2) {
				System.out.printf("Roots: %.2f, %.2f%n", r1, r2);
				}
				else {
				System.out.printf("Roots: %.2f, %.2f%n", r2, r1);
				}
		}


	}
}


	
		




