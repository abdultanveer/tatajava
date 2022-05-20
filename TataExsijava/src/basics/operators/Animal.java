package basics.operators;
class Animal{  


	String color="white";  
	Animal(){System.out.println("animal is created");}  


	void eat(){System.out.println("eating...");}  

}  

//----------------------
class Dog extends Animal{  
	String color="black";  

	Dog(){  
		super();  
		System.out.println("dog is created");  
		
	} 


	void printColor(){  
		System.out.println(color);//prints color of Dog class  
		System.out.println(super.color);//prints color of Animal class  
	}  

	void eat(){System.out.println("eating bread...");}  

	void bark(){System.out.println("barking...");}  

	void work(){  
		super.eat();  
		bark();  
	}  
} 