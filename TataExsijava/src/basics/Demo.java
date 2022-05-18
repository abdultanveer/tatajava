package basics;

public class Demo {
	public static void main(String[] args) {
		
		  Student abdul; //stack memory
		  abdul = new Student(); //new -- allocate memor		  in RAM -- create a student box //abdul is an instance -- instances are
		 // created on heap memory 
		 abdul.age = 123;
		 abdul.name = "ansari";
		  //abdul.calculateElgibility();
		 
		 /*Student tataStudent = new Student();
		 tataStudent.name = "nischita";
		 tataStudent.age = 234;*/
		 
		 Student tataStudent = new Student("nischita", 234); //declaration,instantiation and initialization
		 
		 System.out.println(tataStudent.name);
			/*
			 * System.out.println(Student.COLLEGE_NAME); System.out.println(abdul.age);
			 */
		
	}
}

//name of the instance is abdul
//type of the instance is Student
//new Student() = instantiation