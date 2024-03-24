package tm_feb24_java_selenium;

public class FibanacciSeriesDemo {
public static void main(String[] args) {
	// Fibonacci Series 
	// 0 , 1 , 1 , 2 , 3, 5, 8, 13, 21 
	
	int n1 = 0;
	int n2 = 1;
	System.out.println(n1);
	System.out.println(n2);

	// sum = n1+n2
	// n1 = n2;
	// n2 = sum
	
	for(int i = 1; i < 20 ; i++) {
		int sum = n1 + n2;
		n1 = n2;
		n2= sum;
		System.out.println(sum);
	}
	
	
}
}
