package LinkedList.tester;
import LinkedList.app.*;
public class Tester {
	public static void main(String[] args) {
		
		SinglyLinkedList myLinkedList  = new SinglyLinkedList();
		
		myLinkedList.add(100);
		myLinkedList.add(20);
		myLinkedList.add(30);
		myLinkedList.add(500);
//		myLinkedList.add(13);
//		myLinkedList.add(25);
		
		System.out.println("---------");
		myLinkedList.to1String();
		System.out.println();
//		System.out.println(myLinkedList.find(5));
//		System.out.println(myLinkedList.isSorted());
		myLinkedList.reverse();
		myLinkedList.to1String();
	}
}
