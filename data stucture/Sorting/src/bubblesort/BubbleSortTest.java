package bubblesort;

import java.util.Scanner;

public class BubbleSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enetr size of array: ");
		size=sc.nextInt();
		
//		int arr[];array decalration 1
//		arr=new int[2];
//		System.out.println(arr);
//		
//		int [] brr;array declaration 2
//		brr=new int[3];
//		System.out.println(brr);
		
		//int crr[]=new int[size] memory allocate in heap because new keyword;
		//int crr[]= {5,4,3,2,1};//using this  also memory allocate in heap because 
								//in java string and array are first class array
		
		int [] arr=new int[size];
		System.out.println("Enter "+size+" elements : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("arr["+i+"] = ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Before sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("\t"+arr[i]);
		}
		bubbleSort(arr);
		
		System.out.print("\nAfter Sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("\t"+arr[i]);
		}
		
		
	}
	
	public static void bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
