package s1;

public class MyStack {
	private int top=0;
	private Node[] stackarr=new Node[10];
	private static MyStack ref=new MyStack();
	
	public MyStack() {
		super();
	}

	private MyStack(Node[] ref) {
		stackarr=ref;
	}
	
	public void insert(Node ref)
	{
		MyStack stack1=new MyStack(stackarr);
		
	}

}
