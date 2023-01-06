package StreamExamples;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringwordReverse {
public static void main(String[] args) {
	String val="Welcome to Bhavya's page";
	String revData=Arrays.asList(val.split(" "))
			.stream()
			.map(x->new StringBuilder(x).reverse())
			.collect(Collectors.joining(" "));
	System.out.println(revData);
}
}
