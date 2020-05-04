package com.calculator;

import java.util.Scanner; 

public class Calculator {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in); 

		System.out.println("Welcome to Calculator v0.1");
		System.out.println("");
		while(true) {
			System.out.println("What operation would you like to do ?");
			System.out.println("1) Addition");
			System.out.println("2) Subtraction");
			System.out.println("3) Multiplication");
			System.out.println("4) Division");
			System.out.println("5) Exit");

			System.out.print("Enter option number [1-5]: ");
			int opt = in.nextInt(); 
			if(opt < 1 || opt > 5) System.out.println("Option should be between 1 and 5. Try again!");
			else if(opt == 5)break;
			else {
				System.out.print("Enter operand 1: ");
				int op1 = in.nextInt(); 
				System.out.print("Enter operand 2: ");
				int op2 = in.nextInt(); 
				if(opt == 1) {
					int result = add(op1, op2);
					System.out.println(op1 + " + " + op2 + " = " + result);
				}
				else if(opt == 2) {
					int result = subtract(op1, op2);
					System.out.println(op1 + " - " + op2 + " = " + result);
				}
				else if(opt == 3) {
					long result = multiply(op1, op2);
					System.out.println(op1 + " x " + op2 + " = " + result);
				}
				else if(opt == 4) {
					double result = divide(op1, op2);
					System.out.println(op1 + " / " + op2 + " = " + result);
				}
			}
		}
		
	}

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}

	public static long multiply(int a, int b) {
		return a * b;
	}

	public static double divide(int a, int b) {
		double result;
		if (b == 0) {
			throw new IllegalArgumentException("Divisor cannot divide by zero");
		} else {
			result = Double.valueOf(a)/Double.valueOf(b);
		}
		return result;
	}
}
