package basics.inheritance;

public class Demo {
	
	public static void main(String[] args) {
		IncomeTax incomeTax = new IncomeTax(1000);
		System.out.println("income tax ="+incomeTax.calculateTax());
		
		Gst gst = new Gst(1000);
		System.out.println("gst ="+ gst.calculateTax());
		
	}

}
