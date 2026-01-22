package s1;

public class MyQueue {
	
	 static MyQueue mq = new MyQueue();
	   private Node[] queue = new Node[5];
	   private int head = 0;
	   private int tail = 0;
	   private int count = 0;
	   
	   private MyQueue()
	   {
		   
	   }
	   
	   private MyQueue(Node[] queue) {
		super();
		this.queue = queue;
	   }
	   
	   
	   public static MyQueue getObject() {
	        return mq;
	    }

	   

	   public Node[] getStack() {
		   return queue;
	   }

	   public void setStack(Node[] stack) {
		   this.queue = stack;
	   }
	   
	   
	   public void push(int i) {
	        
	    	if(tail+head==queue.length)
	    	{
	    		System.out.println("queue is full for value"+i);
	    	}
	    	else
	    	{
	    		if(tail==queue.length && head!=0)
	    		{
	    			tail=0;
	    		}
	    		queue[tail]=new Node(i);
	    		tail++;
	    	}
	    }
	   
	   public void pop() {
	    	
		   if(tail==head)
	    	{
	    		System.out.println("queue is empty");
	    	}
	    	else
	    	{
	    		if(head==queue.length && tail != queue.length)
	    		{
	    			head=0;
	    		}
	    		
	    		head++;
	    	}
		  
	        
	    }
	   
	   public void display() {
	        if (tail==head) {
	            System.out.println("Stack is empty");
	            return;
	        }
	        System.out.print("Stack elements: ");
	        if(tail>head)
	        {
	        	for (int i = head; i < tail; i++) {
		            System.out.print(queue[i].getData() + " ");
		        }
	        }
	        else
	        {
	        	for (int i = head; i < queue.length; i++) {
		            System.out.print(queue[i].getData() + " ");
		        }
	        	for (int i = 0; i < tail; i++) {
		            System.out.print(queue[i].getData() + " ");
		        }
	        	
	        }
	        
	        System.out.println();
	    }
}