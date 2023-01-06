package Test;

public class CustomException {
 double bill=2000;
 double balance=1000;
 public void balanceChecker() {
	 if (bill>balance) {
		System.out.println("tranasaction successfull");
	}else {
		throw new InsuffficientFunds("Add more funds");
	}
 }
 public static void main(String[] args) {
	CustomException ce=new CustomException();
	ce.balanceChecker();
}
}
