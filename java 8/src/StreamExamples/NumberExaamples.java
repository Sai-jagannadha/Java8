package StreamExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.management.openmbean.OpenDataException;


public class NumberExaamples {
public static void main(String[] args) {
	//sequential will excute in order looks like synchronus.
	
	//IntStream.range(1, 20).forEach(s->System.out.println("value is..."+s)); // seq
	
	//parallel method will excute multiple threads parallely looks like asynchronus
	// IntStream.range(1, 20).parallel().forEach(s->System.out.println("value is..."+s)); // parallel
	
	IntStream.range(1, 20).filter(t->t%2==0).forEach(System.out::println); // to get even nmbers
	
	IntStream.range(1, 20).filter(t->t%2!=0).forEach(System.out::println);// to get odd numbers
	
	List<Integer> list=Arrays.asList(2,4,6,8,10,20,22,29,10,19,17);
	list.stream()
	.filter(x->x%2==0)// filter the data based on condition.
	.map(t->t*5) // to apply a logic/condition. // function interface
	.distinct()// it will remove the duplicate data
	.sorted(Comparator.reverseOrder()) // to sort the data in reverse order
	.skip(1)// skip the given elements
	.limit(4)// it will display the numbers of objcts that are given
	.forEach(System.out::println);//iterate the elements and print
	
			//className::MethodName==Method Reference
			//Integer::value of
	System.out.println("=================");
	List<Integer>distList=list.stream().distinct().collect(Collectors.toList());
	distList.stream().filter(x->x%2==0).forEach(System.out::println);
	
	System.out.println("========AGGRIGATE VALUES========");
	
	Optional<Integer> max=list.stream().max(Integer::compare);
	System.out.println("max value...."+max.get());
	
	Long count=list.stream().count();
			System.out.println("count is..."+count);
			
			OptionalDouble avg=list.stream().mapToInt(x->x+5).average();
			System.out.println("avg value is..."+avg.getAsDouble());
	
int sum=list.stream().mapToInt(x->x*3).sum();
System.out.println("sum is..."+sum);

	
Optional<Integer>findAny=list.stream().findAny();
	System.out.println("find any...."+findAny.get());
	
	Integer findFirst=list.stream().findFirst().get();
	System.out.println("findFirst..."+findFirst);
	
	Boolean anyMatch=list.stream().anyMatch(x->x==20);
	System.out.println("any match...."+anyMatch);
	
	Boolean allMatch=list.stream().allMatch(x->x<25);
	System.out.println("all match..."+allMatch);
	
	Boolean nonMatch=list.stream().noneMatch(x->x==15);
	System.out.println("noneMatch ..."+nonMatch);
	
	System.out.println("==========SECOND==========");
	
	list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
   
Integer secondnd=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println(secondnd);
}
}
