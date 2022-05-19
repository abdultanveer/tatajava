package basics.operators;
class A5{  
	void m(){  
		//print the address of object pointed by this pointer
		System.out.println(this);//prints same reference ID  
	}  
	public static void main(String args[]){  
		A5 obj=new A5();  
		//hey print the address of obj
		System.out.println(obj);//prints the reference ID  
		obj.m();  
	}  
} 