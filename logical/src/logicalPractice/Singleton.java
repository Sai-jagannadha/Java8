package logicalPractice;

public class Singleton {
private static Singleton singleton;
private Singleton() {
	
}
private static Singleton getInstance() {
	if (singleton==null) {
		singleton =new Singleton();
	}
	return singleton;
}
public static void main(String[] args) {
	System.out.println(Singleton.getInstance());
	Singleton s1= Singleton.getInstance();
	Singleton s2= Singleton.getInstance();
	Singleton s3=Singleton.getInstance();

}
}
