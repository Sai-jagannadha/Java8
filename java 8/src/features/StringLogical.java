package features;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringLogical {
public static void main(String[] args) {
		List<String> list=Arrays.asList("Bhavin","Glitchee","BattleGod","Cheif","Bhavin","KakashiSensi");
		//find the count of elements in the list
		
		long elementsCount=list.stream().count();
		System.out.println(elementsCount);
		
		long particularElementsCount=list.stream().filter(x->x.equals("Bhavin")).count();
		System.out.println(particularElementsCount);
		
		String data="Akash";
		long characterOccurenceCount=data.chars().filter(x->x=='a').count();
		System.out.println(characterOccurenceCount);
		
		//removing duplicates
		list.stream().distinct().forEach(System.out::println);
		
		System.out.println("============");
		Set<String> set=new HashSet<>();
		list.stream().filter(x->!set.add(x)).forEach(System.out::println);
		
		String str="Welcome to Bhavya's Institute";
		long charCount=str.chars().filter(x->x!=' ').count();
		System.out.println(charCount);
}
}
