class reversestring {
  public static void main(String[] args)
  {
	String str="this is a string fbs";
	String sarr[]=str.split(" ");
	for(int i=sarr.length-1;i>=0;i--)
	{
		System.out.print(sarr[i]+" ");
	}
	
  }
}
