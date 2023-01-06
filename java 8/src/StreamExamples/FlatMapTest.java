package StreamExamples;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {
public static void main(String[] args) {
	List<Integer>list=Arrays.asList(20,29,22,24,23,03);
	List<Integer>list1=Arrays.asList(10,19,12,14,13,13);
	List<Integer>list2=Arrays.asList(30,39,32,34,33,33);
	
List<List<Integer>> li=Arrays.asList(list,list1,list2);
List<Integer> data=li.stream().flatMap(x->x.stream()).collect(Collectors.toList());
data.stream().filter(x->x<15).forEach(System.out::println);
}
}
 // flatMap is used to achieve multiple lists as a single list