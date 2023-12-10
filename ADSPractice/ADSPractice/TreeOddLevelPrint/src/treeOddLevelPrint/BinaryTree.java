package treeOddLevelPrint;



class BinaryTree {
    Node root=null;

    BinaryTree(int item){
    	Node newNode = new Node(item);
    	root=newNode;
    }
    
    void printOddNodes(Node node, int level) {
        if (node == null) {
            return;
        }

        if (level % 2 != 0) {
            System.out.print(node.data + " ");
        }

        printOddNodes(node.left, level + 1);
        printOddNodes(node.right, level + 1);
    }

    void printOddNodes() {
        printOddNodes(root, 1);
    }
}
