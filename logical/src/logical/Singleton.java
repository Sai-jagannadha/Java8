package logical;

public class Singleton {
 private static Singleton obj =new Singleton();
 public Singleton() {
	 
 }
 public static  Singleton getinstance() {
	 return obj;
 }
	public static void main(String[] args) {
		System.out.println(Singleton.getinstance());
		Singleton s1=Singleton.getinstance();
		Singleton s2=Singleton.getinstance();
		Singleton s3=Singleton.getinstance();
	}
}
