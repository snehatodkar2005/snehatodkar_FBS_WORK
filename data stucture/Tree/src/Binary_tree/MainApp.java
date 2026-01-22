package Binary_tree;

public class MainApp {
	Node root;
	String value;
	
	
	public static void main(String[] args) {
		MainApp ma=new MainApp();
		
		private void insert(String value)
		{
			root=insertValue(root,value);
		} 
		
		public Node insertValue(Node root,String value)
		{
			if(root==null)
			{
				root=new Node(value);
				return root;
			}
			if(value.compareTo(root.data)>0)
			{
				root.right=insertValue(root.right,value);
			}
			else
			{
				if(value.compareTo(root.data)<0)
				{
					root.left=insertValue(root.left,value);
				}
			}
		}
}
}