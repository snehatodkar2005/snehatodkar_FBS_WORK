package Binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] arr= new int[size];
		System.out.println("enter elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Sorted array"+Arrays.toString(arr));
		System.out.println("enter the element to search");
		int target=sc.nextInt();
		MainApp m1=new MainApp();
		int result=m1.binarySearch(arr, target);
		if(result!=-1)
		{
			System.out.println("element found at index:"+result);
		}
		else
		{
			System.out.println("element not found");
		}
		sc.close();
	}
		
	public int binarySearch(int[] arr,int target)
	{
	int left=0;
	int right=arr.length-1;
	while(left<=right)
	{
		int mid =(left+right)/ 2;
		if(arr[mid]==target)
		{
			return mid;
		}
		else if(target<arr[mid])
		{
			right=mid-1;
		}
		else
		{
			left=mid+1;
		}
	}
	return -1;

}
}
