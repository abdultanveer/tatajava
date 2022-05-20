package basics.inheritance;

public class Gst extends IncomeTax{

	public Gst(int income) {
		super(income);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int calculateTax() {
		int oldTax = super.calculateTax();
		int gst = oldTax /10;
		return oldTax + gst;
	}

	

}
