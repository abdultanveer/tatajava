package basics.operators;
class A{  
	A(){
		this(10);
		System.out.println("hello a");
		}  //empty constructor
	
	
	A(int x){   //parameterized constructor
		//this();  //invoking an empty constructor
		System.out.println(x);  
	}  
}  
