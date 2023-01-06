package StreamExamples;

import java.util.Arrays;
import java.util.List;

public class VowelsConsonentsCount {

	public static void main(String[] args) {
		String name="Bhavya Accenture Employee";
		String input=name.toLowerCase();
		
		List<Character> vowels=Arrays.asList('a','e','i','o','u');
		long vowelscount=input.chars().filter(ch->vowels.contains((char)ch)).count();
		long Consonentscount=input.chars().filter(ch->!vowels.contains((char)ch)).filter(x->x!=' ').count();
		System.out.println(vowelscount);
		System.out.println(Consonentscount);
		
	}
}
