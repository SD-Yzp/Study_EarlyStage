package RealTest;

public class Invoice {
	public void printInvoice() {
		System.out.println("This is the content of the invoice!");
	}
}

class Decorator extends Invoice{
	protected Invoice ticket;

	public Decorator(Invoice invoice) {
		super();
		this.ticket = invoice;
	}
	
	@Override
	public void printInvoice() {
		if(ticket!=null) {
			ticket.printInvoice();
		}
	}
	
}

class HeadDecorator extends Decorator{

	public HeadDecorator(Invoice invoice) {
		super(invoice);
//		super.ticket = invoice; 这种方式不对
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printInvoice() {
		System.out.println("This is the header of the invoice!");
		ticket.printInvoice();
	}
	
}

class FootDecorator extends Decorator{

	public FootDecorator(Invoice invoice) {
		super(invoice);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printInvoice() {
		ticket.printInvoice();
		System.out.println("This is the footnote of the invoice!");
	}
}