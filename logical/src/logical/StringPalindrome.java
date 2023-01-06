package logical;

public class StringPalindrome {
public static void main(String[] args) {
	String str="wow";
	String reverse="";
	for (int i = str.length()-1; i >=0; i--) {
		reverse=reverse+str.charAt(i);
	
	}
	if (str.equals(reverse)) {
		System.out.println("it's a palindrome");
	}else {
		System.out.println("not a palindrome");
	}
}
}
