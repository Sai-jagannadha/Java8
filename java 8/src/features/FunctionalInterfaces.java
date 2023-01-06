package features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {

	public static void main(String[] args) {
		//without lamda
		Consumer<String> con=new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("name is...."+t);
				
			}
			
		};
		con.accept("Sai");
		// with lamda
		Consumer<String > con1=t->System.out.println("name is..."+t);
		con1.accept("SAI JAGANNADHA");
		
		//without lamdaS
		Supplier<String> sup=new Supplier<String>() {

			@Override
			public String get() { 
				return "BHAVYA";
			}
			
			
		};
		sup.get();
		//with lamda
		Supplier<String> sup1= ()-> "BHAVYA";
			
			System.out.println(sup1.get());

			//without lamda
			Predicate<String> pre=new Predicate<String>() {
				
				@Override
				public boolean test(String t) {
					Boolean val=t.equals("harika");
					return false;
				}
			};
			Boolean data=pre.test("Harika");
			System.out.println(data);
			
			//with lamda
			
			Predicate<String> pre1= t-> t.equals("Harika");
			Boolean data1=pre1.test("Harika");
			System.out.println(data1);
	
	 //without lamda
Function<String, Double> fun=new Function<String, Double>() {
	
	@Override
	public Double apply(String t) {
		
		return 10000.50;
	}
};
	Double cost =fun.apply("saree price");
	System.out.println(cost);
	
	Function<String, Double> fun1= t-> 15000.50;
		Double cost1=fun1.apply("Lehenga Price");
		System.out.println(cost1);
	
}
}