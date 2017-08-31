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
	Node root;//root of binary tree
	public BinaryTree(int data){
		root=new Node(data); 
	}
	public BinaryTree(){
		root=null;
	}
	public static void main(String [] args){
		BinaryTree bt=new BinaryTree();//root declared with null value
		bt.root=new Node(1);//root node with data or key as 1
		System.out.println("Root Node is:->"+bt.root.data);
		System.out.println("Address of left child is:->"+bt.root.left);
		System.out.println("Address of right child is:->"+bt.root.right);
		bt.root.left=new Node(2);
		bt.root.right=new Node(3);
		System.out.println("Address of left child is:->"+bt.root.left);
		System.out.println("Address of right child is:->"+bt.root.right);
		System.out.println("Left child is:->"+bt.root.left.data);
		System.out.println("Right child is:->"+bt.root.right.data);
		System.out.println("Address of left sub child is:->"+bt.root.left.left);
		System.out.println("Address of right sub child is:->"+bt.root.left.right);
		
	}
	
}