package LinkedList.app;
//PAper4
/*1. add(X) — Add element X at the end of the list.
2. find(X) – Returns the position of X in the list. Returns -1 if X
does not exists in the list.
3. toString() — Returns comma separated elements from start to end.
4. isSorted() – Returns true if the list is sorted else false.*/
//. reverse() — Reverse the linked list.
public class SinglyLinkedList {
	private Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int x){
			this.data = x;
			this.next=null;
		}
	}
	
	public void add(int x) {
		Node newNode = new Node(x);
		
		if(head==null)
			head=newNode;
		else
		{
			Node currentNode = head;
			while(currentNode.next!=null) {
				currentNode = currentNode.next;
			}
			currentNode.next=newNode;
		}
		
	}
	
	public int find(int data) {

		if(head==null)
			return -1;
		Node currentNode = head;
		int position = 0;
		
		while(currentNode != null) {

			if(currentNode.data==data) {
				return position;
			}
			
			currentNode = currentNode.next;
			position++;
		}
		
		return -1;
	}
	public boolean isSorted() {
		if(head==null)
		{	System.out.println( "Empty List");
			return false;
		}
		Node currentNode = head;
		
		while(currentNode.next != null) {

			if(currentNode.data > currentNode.next.data) {
				return false;
			}
			
			currentNode = currentNode.next;
			
		}
		return true;
	}
	
	public void display() {
		if(head==null) {
			throw new LinkedListException("Mist is Empty");
		}
		
		System.out.println("SinglyLinkedList : ");
		Node trav = head;
		while(trav!=null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	public String to1String() {
		StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }
        return result.toString();
	}
	
	public void reverse() {

		if(head==null) {
			return;
		}
		Node curNode = head;
		Node prevNode= null;
		Node nextNode;
		
		while(curNode !=null) {
			nextNode = curNode.next;
			curNode.next = prevNode;
			prevNode = curNode;
			curNode = nextNode;
		}
			head=prevNode;
	}
	
	public void addAt(int position,int data) {
		Node newNode = new Node(data);
		if(head==null || position==1) {
			newNode.next=head;
			head=newNode;
		}
		else {
			Node trav = head;
			
			for(int i=1;i<position-1;i++) {
				if(trav.next==null) {
					System.out.println("invalid postion");
					return;
				}
				trav = trav.next;
				
			}
			Node temp = trav.next;
			trav.next = newNode;
			newNode.next=temp;
			
		}
		
	}
	
	
	public void addSorted(int x) {
		Node newNode = new Node(x);
		if(head==null || x<=head.data) {
			newNode.next = head;
			head=newNode;
		}
		else {
			Node trav = head; //1,3,5    : 2
			while(trav.next!=null && trav.next.data<x) {
				trav=trav.next;
			}
			Node temp /*3*/ = trav.next;
			trav.next /*1->2*/ = newNode;
			newNode.next/**/ = temp;
			
			
		}
		
	}
}
