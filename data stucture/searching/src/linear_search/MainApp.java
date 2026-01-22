package linear_search;

public class MainApp {
	public static void main(String[] args) {
		
		String ele="red";
		String[] arr= {"white","red","yellow","black","blue"};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				System.out.println("element found at index: "+i);
				return;
			}
		}
		System.out.println("element not found");
		
	}//linear search

}
