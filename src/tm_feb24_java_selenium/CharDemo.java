package tm_feb24_java_selenium;

public class CharDemo {
	public static void main(String[] args) {
		
		// Java => J , a , v, a
		// ASCII Characters -  1 byte
		
		char c1 = 'D';
		System.out.println(c1);
		// Keyboard char
		// binary
		// 1 byte
		// 4 byte
		
		int charAscii = c1;
		System.out.println(charAscii);
		
		
		int ascii_n1 = 104; // 4 byte
		char n = (char)ascii_n1;
		System.out.println(n);
		
		// 0915
		
		char k1 = '\u0935';
		char k2 = '\u0948';
		char k3 = '\u092D';
		System.out.println(k1+""+k2+""+k3+""+k1);
		
	}
}
