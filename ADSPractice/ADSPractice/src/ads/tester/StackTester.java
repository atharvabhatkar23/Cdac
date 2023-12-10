package ads.tester;

import ads.queue.QueueUsingStack;
import ads.queue.StackUsingQueue;

public class StackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*QueueUsingStack<Integer> myQueue = new QueueUsingStack<Integer>();
		myQueue.enqueue(10);
		myQueue.enqueue(7);
		myQueue.enqueue(1);
		myQueue.enqueue(15);
		myQueue.enqueue(77);
		myQueue.enqueue(11);
		myQueue.display();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.display();
		myQueue.enqueue(99);
		myQueue.display();
		myQueue.dequeue();
		myQueue.display();*/
		
		StackUsingQueue<Integer> myStack = new StackUsingQueue<Integer>();
		myStack.push(10);
		myStack.push(7);
		myStack.push(1);
		myStack.push(15);
		myStack.push(77);
		myStack.push(11);
		myStack.display();
		myStack.pop();
		myStack.pop();
		myStack.display();
		myStack.push(99);
		myStack.pop();
		myStack.display();
	}

}
