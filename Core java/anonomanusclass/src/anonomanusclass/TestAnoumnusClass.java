package anonomanusclass;

interface Discounts{
	void discount();
}
class Mall implements Discounts
{

	@Override
	public void discount() {
		System.out.println("30% discount given");
		
	}
	
}
public class TestAnoumnusClass {
	public static void main(String[] args) {
//		Mall m1=new Mall();
//		m1.discount();
//		Mall m2=new Mall();
//		m2.discount();
		
		Discounts m1=new Mall();
		m1.discount();
		
		new Discounts()
		{

			@Override
			public void discount() {
				System.out.println("80% discount");
				
			}
			
		}.discount();
	}

}
