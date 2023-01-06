package logicalPractice;

public class Palindrome {
public static void main(String[] args) {
	String name="wow";
	String reverse="";
	for (int i = name.length()-1; i >=0; i--) {
		reverse=reverse+name.charAt(i);
		
	}
	if (name.equals(reverse)) {
		System.out.println("its a palindrome");
	}else {
		System.out.println("not a palindrome");
	}
}
}
