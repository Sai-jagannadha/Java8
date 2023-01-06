package StreamExamples;

public class Student {

String name;
int marks;
String schoolName;



public Student(String name, int marks, String schoolName) {
	super();
	this.name = name;
	this.marks = marks;
	this.schoolName = schoolName;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getSchoolName() {
	return schoolName;
}
public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
}
@Override
public String toString() {
	return "Student [name=" + name + ", marks=" + marks + ", schoolName=" + schoolName + "]";
}



}
