package logical;

public class PrintnoWithoutLoop {

	private static void PrintNum(int i) {
		System.out.println(i);
		if ( i<100) {
			PrintNum(i+1);
		}
		
	}
	
	public static void main(String[] args) {
		
		PrintNum(1);
	}
}

// we used static method cuz no need to cr8 an obj