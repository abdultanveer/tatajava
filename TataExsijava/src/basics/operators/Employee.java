package basics.operators;
//blueprint
public class Employee {
	
	int eid;
	String name;
	int age;
	
	{	age = 18;
		System.out.println("im in instance init block");
	}
	
	
	public Employee() {
		System.out.println("im in default constructor");
	}
	
	public Employee(int eid, String name) {
	
		this.eid = eid;
		this.name = name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
