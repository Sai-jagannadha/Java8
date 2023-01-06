package logicalPractice;

public class CustomException {
 double bill=2000;
 double balance=1000;
 public void balanceChecker() {
	 if (balance>bill) {
		System.out.println("payment done");
	}else {
		throw new InsufficientFunds("Add more funds");
	}
 }
 public static void main(String[] args) {
	CustomException ce= new CustomException();
	ce.balanceChecker();
}
}
