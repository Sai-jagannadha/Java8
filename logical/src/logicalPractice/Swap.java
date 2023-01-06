package logicalPractice;

public class Swap {
public static void main(String[] args) {
	int i=10;
	int j=20;
	
	i=i+j;
	j=i-j;
	i=i-j;
	System.out.println("Swapped values are "+i+" "+j);
}
}