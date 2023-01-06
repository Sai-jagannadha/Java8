package features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentListToMap {

	public static void main(String[] args) {
		Student s1=new Student(221, "sara", 20);
		Student s2=new Student(211, "cavin", 21);
		Student s3=new Student(213, "anj", 22);
		Student s4=new Student(212, "siddhi", 24);
		Student s5=new Student(222, "sara", 23);
		
		List<Student> list= Arrays.asList(s1,s2,s3,s4,s5);
		Map<Integer, Student> map=new HashMap<>();
		//before java8
		for (Student student : list) {
		map.put(student.getRollno(), student);
		}
		// IN JAVA8
		Map<Integer, Student> map1=list.stream()
				.collect(Collectors.toMap(Student::getRollno,Function.identity()));
		map1.forEach((k,v)->System.out.println("key"+k+" value" +v));
		//foreach(x->system.out.println("pass values"))
	}

}
