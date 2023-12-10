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
}
