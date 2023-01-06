package logicalPractice;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1="Harika";
		String str2="Akhira";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if (str1.length()==str2.length()) {
			char[]chrArr1=str1.toCharArray();
			char[]chrArr2=str2.toCharArray();
			Arrays.sort(chrArr1);
			Arrays.sort(chrArr2);
			Boolean result=Arrays.equals(chrArr1, chrArr2);
			if (result) {
				System.out.println("it's an anagram");
			}else {
				System.out.println("its not anagram");
			}
		}else {
			System.out.println("not anagram");
		}
		
	}
	}