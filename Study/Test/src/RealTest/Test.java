package RealTest;

public class Test {
	public static void main(String[] args) {
		Invoice t = new Invoice();
		Invoice ticket = new Invoice();
		
		ticket = new FootDecorator(new HeadDecorator(new Decorator(null)));
		ticket.printInvoice();
	}
}
