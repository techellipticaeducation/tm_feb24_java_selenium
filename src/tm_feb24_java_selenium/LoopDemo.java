package tm_feb24_java_selenium;

public class LoopDemo {
public static void main(String[] args) {
	// loops = action goes on until condition satisfies
	
	// while , dowhile , for
	// while - when you dont know how many times you have to execute your loop
	// always check condition first then execute
	
	
//	int i = 20;
//	while(i <= 10) {
//		System.out.println(i);
//		i++;
//	}
	
	// dowhile - first execution then condition
	// execute atleast once
	
//	int j = 0;
//	do {
//		System.out.println(j);
//		j++;
//	}while(j <= 10);
	
	// For loop
	
	for(float k = 1;k <= 10;k++) {
		if(k == 6) {
			continue;
		}
		System.out.println(k);
	}
	
	// Jump Statement
	
	// break - loop break
	// continue
	
}
}
