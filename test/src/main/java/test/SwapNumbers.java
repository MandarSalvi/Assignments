package test;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int firstNumber = scanner.nextInt();
		
		System.out.println("Enter Second number: ");
		int secondNumber = scanner.nextInt();
		
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		
		System.out.println("After Swapping");
		
		System.out.println("FirstNumber: " + firstNumber);
		System.out.println("SecondNumber: " + secondNumber);

	}

}
