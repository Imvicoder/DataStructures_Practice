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
	Node root;
	public void inOrderTraversal(Node node){
		if(node == null)
			return;
		inOrderTraversal(node.left);
		System.out.print(node.data+" ");
		inOrderTraversal(node.right);
	}
	public void preOrderTraversal(Node node){
		if(node==null)
			return;
		System.out.print(node.data+" ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}
	
	public void postOrderTraversal(Node node){
		if(node==null)
			return;		
		postOrderTraversal(node.left);
	    postOrderTraversal(node.right);
		System.out.print(node.data+" ");
	}
	public static void main(String [] args){
		BinaryTree bt=new BinaryTree();
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.right=new Node(3);
		bt.root.left.left=new Node(4);
		bt.root.left.right=new Node(5);
		System.out.println("Inorder->");
		bt.inOrderTraversal(bt.root);
		System.out.println("\nPreOrder:->");
		bt.preOrderTraversal(bt.root);
		System.out.println("\nPostOrder:->");
		bt.postOrderTraversal(bt.root);
	}
}