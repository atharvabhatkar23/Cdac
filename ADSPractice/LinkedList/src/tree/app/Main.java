package tree.app;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree(5);
		
		tree.insert(10);
		tree.insert(21);
		tree.insert(5);
		tree.insert(16);
		tree.insert(76);
		tree.insert(43);
		tree.insert(0);
		tree.inorder();
		System.out.println();
		tree.printOddlevels();
	}
	
	 /*
	  *               5
	  * 		  10	 21		
	  * 		5       
	  * 
	  * 
	  * */

}
