package tm_feb24_java_selenium;

public class AssignmentDemo {
	public static void main(String[] args) {
		
		// Sum of Digit
		// Reverse number
		// Fibonacci Series
		// Factors
		// Palindrom
		// Prime Number
		
		
		// Sum of Digit
		// 245 = 2 + 4 + 5 = 11
		
		// Top down Approach
		// Step 1 = how to segregate every digit of a number
		// Step 2 = sum
		// Step 3 = Refactor
		
		int number = 45678;
		
		int sum = 0;
		while(number != 0) {
			sum+=(number % 10);
			number/=10;
		}
		
		System.out.println("Sum of Digit : " + sum);
		
		// 245 % 10 = 5 (if we will use % operator with a number, we will always get last digit)
		// 245 / 10 = 24 
		
		// 24 % 10 = 4 
		// 24 / 10 = 2
		
		// 2 % 10 = 2
		// 2 / 10 = 0
		
		// 0 % 10 = 0
		// 0 / 10 = 0
		
	}
}
