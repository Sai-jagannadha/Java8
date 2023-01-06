package logical;

public class FibonacciSeries {
public static void main(String[] args) {
	
	int count=10;
	int a=0;
	int b=1;
	int c=1;
	/*
	 * for (int i = 1; i<=count; i++) { ); a=b; b=c; c=a+b; }
	 */
	int i=1;
	while(i<=count) {
		i++;
		
		System.out.println(a);
		a=b;
		b=c;
		c=a+b;
		
	}
}

}
