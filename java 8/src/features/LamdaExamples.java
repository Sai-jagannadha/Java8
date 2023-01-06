package features;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaExamples {

	public static void main(String[] args) {
		Consumer<String> con=t-> System.out.println("name is..."+t);
		con.accept("Sai");
		
		Supplier<String> sup =()->  "Bhavya";
			System.out.println(sup.get());
	
			Predicate<String> pre =t-> t.equals("harika");
			Boolean data=pre.test("Harika");
			System.out.println(data);
			
			Function<String, Double> fun=new Function<String, Double>() {
				
				@Override
				public Double apply(String t) {
					return null;
				}
			};
	}
}
