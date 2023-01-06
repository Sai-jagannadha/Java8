package features;
@FunctionalInterface
public interface Test3Lamda {

	void myntra(String categories);
	
	public static void main(String[] args) {
		Test3Lamda t3= categories-> 
		System.out.println("welcome to myntra  "+categories);
		t3.myntra("westernwear");		
	}
	
}
