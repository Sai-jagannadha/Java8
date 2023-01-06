package features;

public class Employee implements Teamlead,Manager{

	@Override
	public String Project() {
		
		return Manager.super.Project();
	}

	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.Project());
		System.out.println(Teamlead.role());
		System.out.println(Manager.role());
	}
}
