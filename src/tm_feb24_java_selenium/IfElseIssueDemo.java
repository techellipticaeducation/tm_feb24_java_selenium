package tm_feb24_java_selenium;

public class IfElseIssueDemo {
public static void main(String[] args) {
	
	// day number , provide day name
	
	int dayNumber = 2;
	String dayName = "";
	if(dayNumber ==  1) {
		dayName = "Monday";
	}else if(dayNumber ==  2) {
		dayName = "Tuesday";
	}else if(dayNumber ==  3) {
		dayName = "wed";
	}else if(dayNumber ==  2) {
		dayName = "thu";
	}else if(dayNumber ==  5) {
		dayName = "fri";
	}else if(dayNumber ==  6) {
		dayName = "sat";
	}else if(dayNumber ==  7) {
		dayName = "sun";
	}
	System.out.println(dayName);
	
	
}
}
