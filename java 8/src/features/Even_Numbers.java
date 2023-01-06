package features;

import java.util.Scanner;

public class Even_Numbers {
	public  static final Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the number");
		int range=sc.nextInt();
		int factor=0;
		for(int i=1; i<=range; i++){
			i=i/i;
			if(i%2==0) {
				factor++;
				if(factor<2) {
					System.out.println("the prime numbers are"+i);
					
				}
				
				
			}
			
			
		}
		
	}

}
