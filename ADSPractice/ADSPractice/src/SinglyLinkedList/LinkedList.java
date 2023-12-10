package SinglyLinkedList;

import java.util.List;

public class LinkedList {

	private Node head;
	static int size=0;

	LinkedList() {
		head = null;
	}

	class Node {
		public Node next;
		int data;

		Node(int data) {
			next = null;
			this.data = data;
		}

	}

	private void add(int x) {

		Node newNode = new Node(x);
		// Node temp;
		if (head == null) {
			head = newNode;
		} else {
			Node curNode = head;
			while (curNode.next != null) {
				curNode = curNode.next;
			}
			curNode.next = newNode;
		}
	}


	public void addSorted(int x) {
		++size;
		Node newNode = new Node(x);
		if(head==null) {
			head = newNode;
			return;
		}
		Node currentNode = head;
		while(currentNode.next!=null) {
			if(currentNode.data > newNode.data)
				break;
			currentNode = currentNode.next;
		}
		if(currentNode==head) {
			newNode.next = currentNode;
			head = newNode;
			return;
		}
		if(currentNode.next==null) {
			currentNode.next = newNode;
			return;
		}
		Node temp = head;
		while(temp.next!=currentNode)
			temp=temp.next;
		temp.next = newNode;
		newNode.next = currentNode;
	}
	
	public void addAll(List<Integer> x) {
		for(int i = 0; i < x.size(); i++)
			addSorted(x.get(i));
	}
	

	public void display() {

		if (head == null) {
			System.out.println("Empty list");
		} else {
			Node curNode = head;

			while (curNode.next != null) {
				System.out.print(  curNode.data +  " --> ");
				curNode = curNode.next;
			}
			
			System.out.println(curNode.data);
		}
	}
	
	public int remove(int index) {
		if(index<0 || index>=size)
			throw new ArrayIndexOutOfBoundsException();
		Node prevNode = head;
		//Node nextNode = head;
		if(index==0) {
			int data = head.data;
			head=head.next;
			return data;
		}
		for(int i=0; i<index -1 ; i++)
			prevNode = prevNode.next;
		int data = prevNode.next.data;
		prevNode.next=prevNode.next.next;
		return data;
	}


	@Override
	public String toString() {
		
			Node curNode = head;
			StringBuilder str = new StringBuilder();
			while (curNode.next != null) {
				str.append(curNode.data +  " --> ")  ;
				curNode = curNode.next;
			}
			str.append(curNode.data);
			return str.toString();
		
	}
	
	

}
