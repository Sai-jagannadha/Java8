package Test;

public class Stringrev {
  String str="Sai";
  String rev="";
  
 public void Stringreverse() {
	 for (int i = str.length()-1; i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	 System.out.println(rev);
 }
 public static void main(String[] args) {
	Stringrev sr=new Stringrev();
	sr.Stringreverse();
}
}
