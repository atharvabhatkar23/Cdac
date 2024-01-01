package tree.app;

public class Tree {
	
	Node root;
	
	
	public Tree(int i) {
		root = new Node(i);
	}

	public void insert(int x) {
		 root=insert(root,x);
	}

	private Node insert(Node node, int x) {
		
		//Node newNode = new Node(x);
		if(node == null) {
			
			node=new Node(x);
			return node;
		}
		
		if(x<node.data) {
			
			node.left = insert(node.left,x);
		}
		if(x>node.data){
			node.right = insert(node.right,x);
		}
		return node;
	}
	
	public void inorder() { inorderRec(root); }
	 
    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
    public void printOddlevels() {
        printOddlevels(root, 1);
    }

    private void printOddlevels(Node node, int level) {
        if (node == null) {
            return;
        }

        if (level % 2 != 0) {
            System.out.print(node.data + " ");
        }

        // Recursively call for left and right subtrees with incremented level
        printOddlevels(node.left, level + 1);
        printOddlevels(node.right, level + 1);
      }
//    public void printOddlevels() {
//    	
//    	printOddlevels(1,root);
//    	
//    }
//
//	private void printOddlevels(int level, Node root) {
//		
//		if(root==null) {
//			return;
//		}
//		
//		if(level%2 != 0 ) { 
//			System.out.println(root.data);
//			
//		}
//		
//		printOddlevels(level+1,root.left);
//
//		printOddlevels(level+1,root.right);
//	}
}
