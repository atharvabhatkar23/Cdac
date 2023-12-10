package treeOddLevelPrint;

import treeOddLevelPrint.BinaryTree;


public class Tester {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(11);
        
        tree.root.left = new Node(12);
        tree.root.right = new Node(13);
        tree.root.left.left = new Node(14);
        tree.root.left.right = new Node(15);
        tree.root.right.right = new Node(16);
        tree.root.left.left.left = new Node(17);
        tree.root.left.left.right = new Node(18);
        tree.root.right.right.left = new Node(19);
        System.out.println("Nodes at odd levels are: ");
        tree.printOddNodes();
    }
}
