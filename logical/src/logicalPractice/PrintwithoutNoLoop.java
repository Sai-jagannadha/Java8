package logicalPractice;

public class PrintwithoutNoLoop {
private static void Printnum(int i) {
	System.out.println(i);
	if (i<100) {
		Printnum(i+1);
	}
}
public static void main(String[] args) {
	Printnum(1);
}
}
