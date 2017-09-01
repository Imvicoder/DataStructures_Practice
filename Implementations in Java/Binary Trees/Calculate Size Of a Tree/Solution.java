class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int key){
		this.data=key;
		this.left=null;
		this.right=null;
	}
}
class Binarytree{
	Node root=null;
	public int count(Node node){
		if(node==null)
			return 0;
		return (count(node.left)+1+count(node.right));
	}
	public static void main(String [] args){
		Binarytree bt=new Binarytree();		
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.right=new Node(3);
		bt.root.left.left=new Node(4);
		bt.root.left.right=new Node(5);
		
		System.out.println("Size of tree:->"+bt.count(bt.root));
	}
}