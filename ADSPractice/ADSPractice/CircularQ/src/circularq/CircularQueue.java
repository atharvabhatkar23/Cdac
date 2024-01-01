/*Write a Circular Queue using array in Java which implements the following interface:  
public interface ICircularQueue {
	
	// Add the given element at the REAR of the queue
	// Returns false if queue is full otherwise true is returned
	boolean add(String element);
	
	// Remove element from the FRONT of the queue
	// Returns null if the queue is empty
	String remove();
	
	// Returns the total number of elements stored in the queue
	// Returns 0 if the queue is empty
	int size();
	
	// Returns comma separated elements from FRONT to REAR
     // Returns empty string if queue is empty
	String toString();
}
Verify each functionality either in Main class or by writing Junit test cases.

Marks distribution: 
1.	Basic structure of class                      [5]
2.	Logic for isEmpty() and isFull()              [10]
3.	Implementation of add()                       [5]
4.	Implementation of remove()                    [5]
5.	Implementation of size()                      [5]
6.	Implementation of toString()                  [5]
7.	Main driver class or Junit                    [5]

*/

package circularq;

public class CircularQueue implements ICircularQueue {

	int[] cQueue;
	int size;
	int front;
	int rear;
	static int count=0;
	
	public CircularQueue(int size) {
		this.size = size;
		cQueue = new int[size];
		front=0;
		rear=-1;
		
		
	}
	
	
	@Override
	public boolean add(int element) {
		// TODO Auto-generated method stub
		
		if(isFull()) {
			return false;
		}
		

		rear= (rear +1 )%size;
		cQueue[rear] = element;
		count++;
		
		
		return true;
	}

	@Override
	public int remove() {
		
		if(isEmpty()) {
			return -1;
		}
		
		
		int data = cQueue[front];
		front = (front+1)%size;
		count--;
		
		return data;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		
		return count;
	}
	
	public boolean isEmpty() {
		
		if(count==0) {
			return true;
			
		}
		return false;
		
//		if(front == -1 && rear == -1) {
//			return true;
//		}
//		return false;
		
	}
	
	public boolean isFull() {
		if(count == size){
			return true;
		}
		return false;
//		if((front+1)%size == rear) {
//			return true;
//		}
//		return false;
	}
	public String toString() {
		if(isEmpty()) {
			return " ";
		}
		else {
			StringBuilder str = new StringBuilder();
			for(int i=front+1;i<=rear;i= (i+1)%size) {
				
				str = str.append(i + ",");
			}
			return str.toString();
		}
	}

}
