package ads.trees.bst;

public class MyBST {
	private Node root;
	private class Node{
		Node left;
		Node right;
		int data;
			
		public Node(int data){
			this.data = data;
			this.left = this.right =null;
		}
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(root == null) {
			root = newNode;
			return;
		}
		insert(root, newNode);
	}
	
	private void insert(Node root, Node newNode) {
		/*if(root == null) {
			root = newNode;
			return;
		}*/
		if(newNode.data <= root.data) {
			if(root.left==null)
				root.left = newNode;
			else
				insert(root.left, newNode);
		}
			
		else {
			if(root.right == null)
				root.right = newNode;
			else
				insert(root.right, newNode);
		}
			
	}
	
	public void inOrderDisplay() {
		inOrderDisplay(root);	
	}
	private void inOrderDisplay(Node root) {
		if(root == null)
			return;
		inOrderDisplay(root.left);
		System.out.print(" " + root.data);
		inOrderDisplay(root.right);
	}
}
