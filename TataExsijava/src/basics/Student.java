package basics;

//Student as a user defined data type
class Student{
	String name; //partition -- instance variable
	int age;
	static String COLLEGE_NAME = "IIT"; //static variables -- created in class memory
	
	
	public Student(){}
	
	//divya constructor -- parameterized constructors
	public Student(String sName, int sAge) {
		name = sName;
		age = sAge;
	}
	
	//function -- method
	void calculateElgibility() {
		int a = 20; //a is my local variable
		System.out.println("abdul's marks are--"+a);
		System.out.println("printing a new line");
	}
}