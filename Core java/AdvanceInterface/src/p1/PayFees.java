package p1;


interface PayFees{
	
	public void PayOnline();
	public default void PayOffline()
	{
		System.out.println("only offline student can pay og=ffline not onilne and demo student");
		this.PayOnline();
	}
}
