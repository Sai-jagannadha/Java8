package StreamExamples;

public class Employee {

	String empname;
	int empSalary;
	String location;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Employee(String empname, int empSalary, String location) {
		super();
		this.empname = empname;
		this.empSalary = empSalary;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empSalary=" + empSalary + ", location=" + location + "]";
	}
	
	
	
}
