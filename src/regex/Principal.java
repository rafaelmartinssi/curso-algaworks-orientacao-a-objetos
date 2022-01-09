package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {
	public static void main(String[] args) {
		
		String [] emails = {"abc@gmail.com", "def@gmail", "xyz@gmail.com"};
		
		Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
		for(String email : emails) {
			Matcher match = pattern.matcher(email);
			if(match.matches()) {
				System.out.println(email + " é um email válido!");
			}
		}
		
	}
}
