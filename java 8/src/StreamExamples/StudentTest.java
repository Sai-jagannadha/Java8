package StreamExamples;

import java.util.Arrays;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student("Sandeep", 91, "Bhashyam");
		Student s2=new Student("Bhavya Harika", 98, "Bhashyam");
		Student s3=new Student("Raja", 67, "Green field");
		Student s4=new Student("Jyothi", 88, "Oxford");
		
		
		List<Student> list=Arrays.asList(s1,s2,s3,s4);
		list.stream()
		.filter(x->x.getSchoolName().contains("Bhashyam"))
		.map(x->x.getName().concat(" From Kakinada"))
		.forEach(System.out::println);
	Boolean	anyMatch=list.stream().anyMatch(x->x.getName().contains("Raja"));
	System.out.println("anymatch "+anyMatch);
		
		
		
		
	}
	
}
