package StreamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StringExamples {
public static void main(String[] args) {
	List<String> list=Arrays.asList("bhavya","sai","harika","ramya","samee","bhavya");
				list.stream()
				.filter(x->x.startsWith("s"))
				.map(x->x.concat(" accenture employee"))
				.distinct()
				.skip(1)
				.limit(1)
				.forEach(System.out::println);
				
				List<String> diststr=list.stream().distinct().collect(Collectors.toList());
				diststr.stream().filter(x->x.equals("bhavya")).forEach(x->System.out.println("value is"+diststr));
				
				Optional<String>findAny=list.stream().findAny();
				System.out.println("find any...."+findAny.get());
				
				String findFirst=list.stream().findFirst().get();
				System.out.println("findFirst..."+findFirst);
				
				Boolean anyMatch=list.stream().anyMatch(x->x.equals("sai"));
				System.out.println("any match...."+anyMatch);
				
				Boolean allMatch=list.stream().anyMatch(x->x.equals(diststr));
				System.out.println("all match..."+allMatch);
				
				Boolean nonMatch=list.stream().noneMatch(x->x.equals("sindhu"));
				System.out.println("noneMatch ..."+nonMatch);
				
				
				
}
}
