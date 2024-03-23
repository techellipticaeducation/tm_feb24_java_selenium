package tm_feb24_java_selenium;


public class ConditionalStatement {
	public static void main(String[] args) {

		// 0-18    = child
		// 19 - 30 = adult
		// 31-45   = Mature
		// > 45    = old
		
		int age = 56;

		String ageGroup = "";
		if(age < 0) {
			System.out.println("Invalid input.");
		}else {
			if(age <= 18) {
				ageGroup = "Child";
			}else if(age > 18 && age <= 30) {
				ageGroup = "Adult";
			}else if(age > 31 && age <= 45) {
				ageGroup = "Mature";
			}else {
				ageGroup = "Old";
			}

			System.out.println(ageGroup);
		}
	}
}
