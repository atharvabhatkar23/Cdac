package ads.queue;

import java.util.EmptyStackException;
import java.util.Stack;

public class QueueUsingStack<T> {
	Stack<T> tStack1 = new Stack<>();
	Stack<T> tStack2 = new Stack<>();
	
	public void enqueue(T data) {
		tStack1.push(data);
		System.out.println(tStack1.peek() + " entered in queue");
	}
	
	public T dequeue() {
		if(tStack1.isEmpty())
			throw new EmptyStackException();
		while(!tStack1.isEmpty()) 
			tStack2.push(tStack1.pop());
		T data = tStack2.pop();
		while(!tStack2.isEmpty()) 
			tStack1.push(tStack2.pop());
		return data;
	}
	
	public void display() {
		if(tStack1.isEmpty())
			throw new EmptyStackException();
		while(!tStack1.isEmpty()) 
			tStack2.push(tStack1.pop());
		while(!tStack2.isEmpty()) {
			System.out.print(" " + tStack2.peek());
			tStack1.push(tStack2.pop());
		}
		System.out.println();
	}
}
