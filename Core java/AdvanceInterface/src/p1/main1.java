package p1;



public class main1 {
	
	public static void main(String[] args) 
	{
		PayFees[] student= {new DemoStudent(),new OnlineStudent(),new OfflineStudent()};
		
		for (PayFees ref : student) {
			ref.PayOffline();
		}
	}

}
