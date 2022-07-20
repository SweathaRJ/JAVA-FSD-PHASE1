package practiceProject10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		String regex="^(?=().*[A-Za-z]).{10,}";
		 
		String input="Sweatharj@1701";
		
		Pattern pattern= Pattern.compile(regex);
		
		Matcher match= pattern.matcher(input);
		
		if (match.matches()) {
			System.out.println("Password is valid");
		}
		else {
			System.out.println("Invalid Password");
		}
	}

}
