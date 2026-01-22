package merge_sort;

public class MergeSortTest {

    public static void main(String[] args) {
        int[] arr1 = {3, 8, 1, 9, 10};
        
        sort(arr1, 0, arr1.length - 1);
        
        display(arr1);
    }

    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
//            System.out.println("Split: left=" + left + ", mid=" + mid + ", right=" + right);

            
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            
            mergedSort(arr,left,right,mid);
        }
    }
    
    public static void mergedSort(int[]arr,int left,int right,int mid) 
    {
//    	int ctr;
    	int leftsize = mid - left+1;
    	int rightsize = right - mid;
    	
    	int [] leftarray = new int[leftsize];
    	int [] rightarray = new int[rightsize];
    	
    	int[] merged;
    	
    	for(int ele = 0;ele < leftsize ;ele++) 
    	{
    		leftarray[ele] = arr[left+ele];
    	}
    	
    	for(int ele = 0;ele < rightsize ;ele++) 
    	{
    		rightarray[ele] = arr[mid+1+ele];
    	}
    	
    	int rightctr = 0;
    	int leftctr = 0;
    	int merge = left;
    	
    	while(leftctr < leftsize && rightctr < rightsize) 
    	{
    		if(leftarray[leftctr] <= rightarray[rightctr] ) 
    		{
    			arr[merge] = leftarray[leftctr];
    			leftctr++;
    		}
    		else
    		{
    			arr[merge] = rightarray[rightctr];
    			rightctr++;
    	    }
    		
    		merge++;
         }
    	
    	while(leftctr < leftsize && rightctr < rightsize) 
    	{
    		if(leftarray[leftctr] <= rightarray[rightctr] ) 
    		{
    			arr[merge] = rightarray[rightctr];
    			leftctr++;
    		}
    		else
    		{
    			arr[merge] = rightarray[rightctr];
    			rightctr++;
    	    }
    		
    		merge++;
         }
    
      }
 
    static void display(int[] arr) 
    {
    	for(int num = 0 ;num < arr.length;num++ ) 
    	{
    		System.out.println(num + " ");
    	}
    }
    
 }


