package logical;

import java.util.Arrays;

public class Anagram {
    //1st we have to convert to lower cases
	// we have to compare length
	//we have to convert both strings to character array.
	//then both character array need to sort.
	//compare the both character arrays using arrays.equals()
	public static void main(String[] args) {
		String str1="Harika"; //6
		String str2="akhira";//6 same string characters in different order
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if (str1.length()==str2.length()) {
			char[]chArr1=str1.toCharArray();
			char[]chArr2=str2.toCharArray();
			Arrays.sort(chArr1);
			Arrays.sort(chArr2);
			boolean result=Arrays.equals(chArr1, chArr2);
			if(result) {
				System.out.println("it's anagram");
			}else {
				System.out.println("its not anagram");
			}
					}else {
			System.out.println("it's not an anagram");
		}
	}
}
