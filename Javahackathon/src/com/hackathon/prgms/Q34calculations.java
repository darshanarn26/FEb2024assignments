package com.hackathon.prgms;
//Write a method to implement *, - , / operations. You should use only the + operator
public class Q34calculations {
	
	 // Multiplication using repeated addition
    public static int multiply(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        boolean isNegative = (a < 0 && b > 0) || (a > 0 && b < 0);
        a = Math.abs(a);
        b = Math.abs(b);
        
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }

        return isNegative ? negate(result) : result;
    }

    // Subtraction using addition and negation
    public static int subtract(int a, int b) {
        return a + negate(b);
    }

    // Division using repeated subtraction
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }

        if (a == 0) {
            return 0;
        }

        boolean isNegative = (a < 0 && b > 0) || (a > 0 && b < 0);
        a = Math.abs(a);
        b = Math.abs(b);
        
        int result = 0;
        while (a >= b) {
            a = subtract(a, b);
            result++;
        }

        return isNegative ? negate(result) : result;
    }

    // Negation using two's complement
    public static int negate(int a) {
        return ~a + 1;
    }


	public static void main(String[] args) 
	{
		 // Example usage
        int a = 10;
        int b = 3;

        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Division: " + divide(a, b));
		

	}

}
