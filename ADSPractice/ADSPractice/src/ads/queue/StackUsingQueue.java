package ads.queue;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue<T> {
	Queue<T> myQueue = new LinkedList<>();
	
	public void push(T data) {
		myQueue.add(data);
		System.out.println(data + " entered in queue");
	}
	
	public T pop() {
		if(myQueue.isEmpty())
			throw new EmptyStackException();
		Queue<T> queue2 = new LinkedList<T>();
		for(int i = 0; i < myQueue.size() - 1; i++) {
			queue2.add(myQueue.remove());
		}
		T data = myQueue.remove();
		for(int i = 0; i < queue2.size(); i++) {
			myQueue.add(queue2.remove());
		}
		return data;
	}
	
	public void display() {
		if(myQueue.isEmpty())
			throw new EmptyStackException();
		Queue<T> queue2 = new LinkedList<T>();
		for(int i = 0; i < myQueue.size(); i++) {
			queue2.add(myQueue.remove());
		}
		for(int i = 0; i < queue2.size(); i++) {
			System.out.print(" " + queue2.peek());
			myQueue.add(queue2.remove());
		}
		System.out.println();
	}
}
