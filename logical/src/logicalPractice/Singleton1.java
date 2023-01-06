package logicalPractice;

public class Singleton1 {
private static Singleton1 singleton;
private Singleton1() {
	
}
private static Singleton1 getInstance() {
	if(singleton==null) {
		singleton= new Singleton1();
		
	}
	return singleton;
}
public static void main(String[] args) {
	System.out.println(Singleton1.getInstance());
	Singleton1 s1= Singleton1.getInstance();
	Singleton1 s2= Singleton1.getInstance();
	Singleton1 s3= Singleton1.getInstance();
	
}
}
