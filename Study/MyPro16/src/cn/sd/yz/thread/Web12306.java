package cn.sd.yz.thread;

public class Web12306 implements Runnable 
{
	private int tickets = 99;
	
	
	
	public Web12306() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getTickets() {
		return tickets;
	}



	public void setTickets(int tickets) {
		this.tickets = tickets;
		
	}



	



	@Override
	public void run() 
	{
		while(tickets>0)
		{			
			System.out.println(Thread.currentThread().getName()+"抢到第"+tickets+"张票");
			tickets--;
		}
	}

}
