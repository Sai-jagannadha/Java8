package StreamExamples;

public class furignr {
public static void main(String[] args) {
	int [] a= {128 ,132,98,116,100};
	int x=func(a);
	System.out.println(x);
}
	
	
	public static int func(int [] no) {
		int b=no[0];
		for (int i : no) {
			if(i>b) {
				b=i;
			}
			
		}
		return b;
	}
	
}

