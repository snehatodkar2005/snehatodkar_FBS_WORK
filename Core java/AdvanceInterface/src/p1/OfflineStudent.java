package p1;

public class OfflineStudent implements PayFees{

	@Override
	public void PayOnline() {
		System.out.println("pay online");
		
	}

	@Override
	public void PayOffline() {
			System.out.println("offline student pay");
		}
		
	}
