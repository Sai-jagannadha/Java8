package logical;

public class FactorialNumbers {
public static void main(String[] args) {
	
	int num=5;
	int fact=1;
	//1<=5 -true 1+1
	//2<=5 -true 2+1
	//3<=5-true  3+1
	//4<=5 -true 4+1
	for (int i=1;i<=num;i++) {
		     //1*2=2
		    //2*3=6(fact)
			//6*4=24(fact)
		    //24*5=120(fact)
		fact=fact*i;
	}
	System.out.println(fact);
}

}
