class Node{
	int data;
	Node left;
	Node right;
	public Node(int item){
		this.data=item;
		this.left=null;
		this.right=null;
	}
}
class BinaryTree{
	Node root1;
	Node root2;
	public boolean IsIsomorphic(Node n1,Node n2){
		if(n1==null && n2==null){//definition
			return true;
		}else if((n1!=null && n2==null )||(n1==null & n2!=null)){
			return false;
		}else if(n1.data!=n2.data){
			return false;
		}else{
			return ((IsIsomorphic(n1.left,n2.left) && IsIsomorphic(n1.right,n2.right))||(IsIsomorphic(n1.left,n2.right) && IsIsomorphic(n1.right,n2.left)));
		}
	}
	public static void main(String args[]) 
    {
        BinaryTree tree = new BinaryTree();         
        tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);
        tree.root1.right.left = new Node(6);
        tree.root1.left.right.left = new Node(7);
        tree.root1.left.right.right = new Node(8);
  
        tree.root2 = new Node(1);
        tree.root2.left = new Node(3);
        tree.root2.right = new Node(2);
        tree.root2.right.left = new Node(4);
        tree.root2.right.right = new Node(5);
        tree.root2.left.right = new Node(6);
        tree.root2.right.right.left = new Node(8);
        tree.root2.right.right.right = new Node(7);
  
        if (tree.IsIsomorphic(tree.root1, tree.root2) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
	
	
	
}