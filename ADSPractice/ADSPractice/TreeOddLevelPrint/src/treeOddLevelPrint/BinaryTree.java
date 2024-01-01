package treeOddLevelPrint;


	
class BinaryTree {
	static final int COUNT=10;
    Node root=null;

    BinaryTree(int item){
    	Node newNode = new Node(item);
    	root=newNode;
    }
    
    void printOddNodes(Node node, int level) {
        if (node == null) {
            return;
        }

//        if (level % 2 != 0) {
            System.out.print(node.data + " ");
//        }

        printOddNodes(node.left, level + 1);
        printOddNodes(node.right, level + 1);
    }

    static void print2DUtil(Node root, int space)
    {
        // Base case
        if (root == null)
            return;
 
        // Increase distance between levels
        space += COUNT;
 
        // Process right child first
        print2DUtil(root.right, space);
 
        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.data + "\n");
 
        // Process left child
        print2DUtil(root.left, space);
    }
 
    // Wrapper over print2DUtil()
    public void print2D(Node root)
    {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }
    void printOddNodes() {
        printOddNodes(root, 1);
    }
    
    public void add(int x) {
    	
    	root = add(root,x);
    }
    
    private Node add(Node root,int x) {
    	
    	if(root==null) {
    		root=new Node(x);
    		return root;
    	}
    	
    	if(x<=root.data) {
    		root.left = add(root.left, x);
    	}
    	else {
    		root.right = add(root.right,x);
    	}
    	return root;
    }
}
