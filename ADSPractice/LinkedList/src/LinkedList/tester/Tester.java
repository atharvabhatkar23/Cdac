package LinkedList.tester;
import java.util.Scanner;

import LinkedList.app.*;
public class Tester {
	public static void main(String[] args) {
		
		SinglyLinkedList myLinkedList  = new SinglyLinkedList();
		
//		myLinkedList.add(100);
//		myLinkedList.add(20);
//		myLinkedList.addSorted(30);
//		myLinkedList.add(500);
////		myLinkedList.add(13);
////		myLinkedList.add(25);
////		myLinkedList.addSorted(49);
//		System.out.println("---------");
////		myLinkedList.to1String();
//		System.out.println();
////		System.out.println(myLinkedList.find(5));
////		System.out.println(myLinkedList.isSorted());
////		myLinkedList.reverse();
//		myLinkedList.display();
//		myLinkedList.addAt(3, 45);
//
//		myLinkedList.addSorted(49);
//		myLinkedList.display();
//		myLinkedList.reverse();
//		myLinkedList.display();
//		
		try(Scanner sc = new Scanner(System.in)){
				
			boolean exit = false;
			
			
			while(!exit) {
				
				System.out.println("ENter your choice");
				try {
				switch(sc.nextInt()) {
				
				case 1:
					System.out.println("add the element tp add at last");
					myLinkedList.add(sc.nextInt());
					break;
				case 2:
					System.out.println("display the list");
					myLinkedList.display();
					break;
				}
				}
				catch(Exception e) {
					System.out.println(e);
//					e.printStackTrace();
					sc.nextLine();
					
				}
				
			}
			
		
		
		}
	}
}
