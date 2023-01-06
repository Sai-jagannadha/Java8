package Test;

public class PrintWithOutLoop {
private static void PrintNum(int i) {
	System.out.println(i);
	if (i<100) {
		PrintNum(i+1);
	}
	
}
public static void main(String[] args) {
	PrintNum(1);
}
}
