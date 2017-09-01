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

class BinaryTree{
	Node root1=null;
	Node root2=null;
	
	public boolean checkSimilarity(Node node1,Node node2){
		if(node1==null && node2==null){
			return true;
		}else if((node1!=null && node2==null)||(node1==null && node2!=null)){
			return false;
		}else
			return (node1.data==node2.data) && checkSimilarity(node1.left,node2.left) && checkSimilarity(node1.right,node2.right);
	}
	public static void main(String [] args){
		BinaryTree bt=new BinaryTree();
		bt.root1 = new Node(1);
        bt.root1.left = new Node(2);
        bt.root1.right = new Node(3);
        bt.root1.left.left = new Node(4);
        bt.root1.left.right = new Node(5);
  
        bt.root2 = new Node(1);
        bt.root2.left = new Node(2);
        bt.root2.right = new Node(563);
        bt.root2.left.left = new Node(4);
        bt.root2.left.right = new Node(5);
		if(bt.checkSimilarity(bt.root1,bt.root2))
			System.out.println("Identical");
		else
			System.out.println("Not Identical");
	}
}