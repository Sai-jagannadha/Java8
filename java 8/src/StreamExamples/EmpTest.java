package StreamExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EmpTest {

public static void main(String[] args) {
Employee e=new Employee(" Sai Bhavya", 75000, "Hyderabad");
Employee e1=new Employee("Sai", 80000, "Hyderabad");
Employee e2=new Employee("Ramya", 78000, "Banglore");
Employee e3=new Employee("Sindhu", 30000, "Chennai");

List<Employee> list=Arrays.asList(e,e1,e2,e3);
list.stream().filter(x->x.getEmpname().contains("Sai"))
.map(x->x.getEmpname().concat("Accenture Employee"))
.distinct()
.forEach(System.out::println);
Boolean anyMatch=list.stream().anyMatch(x->x.getLocation().contains("Hyderabad"));
System.out.println(" anymantch "+anyMatch);

Employee Findfirst=list.stream().findFirst().get();
System.out.println("find first "+Findfirst);

System.out.println("=====second highest=====");
list.stream().map(x->x.getEmpSalary()).distinct().sorted(Comparator.reverseOrder()).skip(1)
.limit(1).forEach(System.out::println);

Boolean allMatch=list.stream().allMatch(x->x.getEmpname().contains("Ramya"));
System.out.println("Allmatch "+allMatch);



}
}