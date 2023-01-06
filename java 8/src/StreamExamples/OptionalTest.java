package StreamExamples;

import java.util.Optional;

public class OptionalTest {
public static void main(String[] args) {
	User user=new User(11, null, 22);
	//BEFORE JAVA 8
	//System.out.println(user.getUserName().concat(" from Kakinada"));
	if (user.getUserName()!=null) {
		System.out.println(user.getUserName().toUpperCase());
	}else {
//		user.setUserName("default name...");
//		System.out.println("data empty...."+user.getUserName());
	}
	Optional<String> optionalData=Optional.ofNullable(user.getUserName());
//	System.out.println(optionalData.orElse("default Name").concat("from Kakinada"));
	
	if (optionalData.isPresent()) {
		System.out.println(optionalData.get());
	}
	System.out.println(optionalData.orElseThrow(()->new IllegalArgumentException("user is not available")));
}
}
