package edu.wit.cs.comp1000;

// Lily Salman

import java.util.Scanner;
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		
		// variables for code
		Scanner input = new Scanner(System.in);
		int a, b, c, d, e;
		int numPos = 0;
		int numNeg = 0;
		int numFull = 5;
		int sumPos = 0;
		int sumNeg = 0;
		int sumFull = 0;
		double avrPos;
		double avrNeg;
		double avrFull;
		
		// allows user to input 5 numbers
		System.out.printf("Enter five whole numbers: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		e = input.nextInt();
		
		// determines if inputs are positive or negative
		if (a > 0) {
			numPos++;
			sumPos = sumPos + a;
		}
		else {
			numNeg++;
			sumNeg = sumNeg + a;
		}
		if (b > 0) {
			numPos++;
			sumPos = sumPos + b;
		}
		else {
			numNeg++;
			sumNeg = sumNeg + b;
		}
		if (c > 0) {
			numPos++;
			sumPos = sumPos + c;
		}
		else {
			numNeg++;
			sumNeg = sumNeg + c;
		}
		if (d > 0) {
			numPos++;
			sumPos = sumPos + d;
		}
		else {
			numNeg++;
			sumNeg = sumNeg + d;
		}
		if (e > 0) {
			numPos++;
			sumPos = sumPos + e;
		}
		else {
			numNeg++;
			sumNeg = sumNeg + e;
		}
		
		// equation for sum of all numbers
		sumFull = sumFull + a + b + c + d + e;
		
		// calculations for averages positives/negatives
		if (numPos == 0) {
			avrPos = 0.0;
		}
		else {
			avrPos = 1.0*sumPos / numPos;
		}
		
		if (numNeg == 0) {
			avrNeg = 0.0;
		}
		else {
			avrNeg = 1.0*sumNeg/numNeg;
		}
		
		// equation for full average
		avrFull = 1.0*sumFull / numFull;
		
		// outputs answers based on number of numbers
		if (numPos == 1) {
			System.out.printf("The sum of the %d positive number: %d%n", numPos, sumPos);
		}
		else {
			System.out.printf("The sum of the %d positive numbers: %d%n", numPos, sumPos);
		}
		
		if (numNeg == 1) {
			System.out.printf("The sum of the %d non-positive number: %d%n", numNeg, sumNeg);
		}
		else {
			System.out.printf("The sum of the %d non-positive numbers: %d%n", numNeg, sumNeg);
		}
		
		System.out.printf("The sum of the 5 numbers: %d%n", sumFull);
		
		if (numPos == 1) {
			System.out.printf("The average of the %d positive number: %.2f%n", numPos, avrPos);
		}
		else {
			System.out.printf("The average of the %d positive numbers: %.2f%n", numPos, avrPos);
		}
		
		
		if (numNeg == 1) {
			System.out.printf("The average of the %d non-positive number: %.2f%n", numNeg, avrNeg);
		}
		else {
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", numNeg, avrNeg);
		}
		
		System.out.printf("The average of the 5 numbers: %.2f%n", avrFull);
	}

}
