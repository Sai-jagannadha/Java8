package Test;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String str1="Harika";
	String str2="Akhira";
	str1=str1.toLowerCase();
	str2=str2.toLowerCase();
	if (str1.length()==str2.length()) {
		char[]chrArray1=str1.toCharArray();
		char[]chrArray2=str2.toCharArray();
		Arrays.sort(chrArray1);
		Arrays.sort(chrArray2);
		boolean result= Arrays.equals(chrArray1, chrArray2);
		if (result) {
			System.out.println("its an anagram");
		}else {
			System.out.println("not an anagram");
		}
	}else {
		System.out.println("not an anagram");
	}
}
}
