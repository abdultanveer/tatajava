package basics.operators;
class Student{  
	int rollno;  
	String name;  
	float fee;  
	
	Student(int rollno,String name,float fee){  //params
		this.rollno = rollno;  
		this.name = name;  
		this.fee = fee;  
	}  
	
	public void showStudent() {
		System.out.println("name ="+name);
	}
}