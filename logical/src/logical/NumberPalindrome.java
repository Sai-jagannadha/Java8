package logical;

public class NumberPalindrome {

	public static void main(String[] args) {
		int num=1001;
		int reversednum=0;
		int remainder;
		int reversedval=num;
		
		
		while (num!=0) {
			remainder=num%10;
			reversednum=reversednum*10+remainder;
			num=num/10;
			
		}
		if (reversednum==reversedval) {
		System.out.println("its palindrome");	
		}else {
			System.out.println("not palindrome");
		}
	}
}
