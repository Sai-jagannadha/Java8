package Test;

public class InsuffficientFunds extends RuntimeException {
public InsuffficientFunds(String msg) {
	System.out.println(msg);
}
}
