package p1;

public class DoublyLikedList {
	
	Node start,end;
	static int count=0;
	
	public void insertAtBeginning(int data)
	{
		Node temp=new Node(data);
		if(start==null)
		{
			start=temp;
			end=temp;
		}
		else
		{
			temp.next=start;
			start.prev=temp;
			start=temp;
		}
		count++;
		System.out.println("----- Node Added at Beiginning! -----");
	}
	public void insertAtEnd(int data)
	{
		Node temp=new Node(data);
		if(start==null)
		{
			start=temp;
			end=temp;
		}
		else
		{
			temp.prev=end;
			end.next=temp;
			end=temp;
		}
		count++;
		System.out.println("----- Node Added at end! -----");
	}
	
	
	public void insertAtPosition(int data,int pos)
	{
		Node temp=new Node(data);
		Node itr=null;
		if(pos <= 0 && pos > count+1)
			return;
		
		if(pos==1)
		{
			insertAtBeginning(data);
			return;
		}
		
		if(pos==count+1) {
			insertAtEnd(data);
			return;
		}
		int tempCount;
		if(pos<count/2)
		{
			itr=start;
			tempCount=1;
			while(pos-1>tempCount)
			{
				itr=itr.next;
				tempCount++;
			}
//			temp.prev=itr;
//			temp.next=itr.next;
//			itr.next.prev=temp;
//			itr.next=temp;
		}
		else
		{
			itr=end;
			tempCount=count;
			while(pos<tempCount)
			{
				itr=itr.prev;
				tempCount--;
			}
//			temp.prev=itr;
//			temp.next=itr.next;
//			itr.next.prev=temp;
//			itr.next=temp;
		}
		
//		Node itr=start;
//		
		temp.prev=itr;
		temp.next=itr.next;
		itr.next.prev=temp;
		itr.next=temp;
	}
	
	public void deletefirst()
	{
		if(start==null)
		{
			System.out.println("list is empty");
			return;
		}
		if(start==end)
		{
			start=null;
			end=null;
		}
		else
		{
			start.next=start;
			start.prev=null;
		}
		count--;
	}
	public void deleteAtEnd()
	{
		if(start==null)
		{
			System.out.println("list is empty");
			return;
		}
		if(start==end)
		{
			start=null;
			end=null;
		}
		else
		{
			end=end.prev;
			end.next=null;
		}
		count--;
	}
	public void deleteAtPosition(int pos)
	{
		if(start==null)
		{
			System.out.println("List is empty");
		}
		if(pos<=0 || pos>count)
		{
			System.out.println("invalid position");
			return;
		}
		if(pos==1)
		{
			deletefirst();
			return;
		}
		if(pos==count)
		{
			deleteAtEnd();
			return;
		}
		Node itr;
		if(pos<=count/2)
		{
			itr=start;
			for(int i=1;i<pos-1;i++)
			{
				itr=itr.next;
			}
		}
		else
		{
			itr=end;
			for(int i=count;i>pos-1;i--)
			{
				itr=itr.prev;
			}
		}
		itr.next=itr.next.next;
		itr.next.prev=itr;
		
	}
	public void displayForward()
	{
		if(start==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node itr=start;
			while(itr.next!=null)
			{
				System.out.print(itr.getData()+"<-->");
				itr=itr.next;
			}
			System.out.print(itr.getData()+"<--> Null\n");
		}
	}
}
