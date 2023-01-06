package features;
@FunctionalInterface
public interface FunInterface {

	void student(String name);
	public static void main(String[] args) {
		FunInterface fi=new FunInterface() {
			
			@Override
			public void student(String name) {
				System.out.println("student name..."+name);
				
			}
		};
		fi.student("chinnu");
		
		FunInterface fi1=name ->
				System.out.println("student name..."+name);
				
				fi1.student("Kousthubha");
			
		
	}
}
