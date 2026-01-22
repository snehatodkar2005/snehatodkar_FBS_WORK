package s1;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainApp mq=new MainApp();
		
		mq.insert(10);
        mq.insert(20);
        mq.insert(30);
        mq.insert(40);
        mq.insert(50);
        
        mq.show();
        mq.delete();
        mq.delete();
        mq.delete();
        mq.insert(70);
        mq.show();
        

	}
	
	 public void insert(int i) {
		 MyQueue st = MyQueue.getObject(); 
	        st.push(i);
	       
	    }
	    
	    public void delete() {
	    	MyQueue st = MyQueue.getObject();
	    	st.pop();
	    }
	    
	    public void show()
	    {
	    	MyQueue st = MyQueue.getObject();
	    	st.display();
	    }

}