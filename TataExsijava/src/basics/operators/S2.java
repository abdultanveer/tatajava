package basics.operators;
class S2{  
	
	int myData;
	
	public S2(int mD) {
		myData = mD;
		System.out.println("in s2 constructor\n");
	}
	void m(S2 obj){  
		System.out.println("M method is invoked\n");
		System.out.println("mydata ="+ obj.myData);
	}  
	void p(){ 
		System.out.println("P method is invoked\n");  
		//S2 mS2 = new S2();
		m(this);  
	

	}  
	 
}  