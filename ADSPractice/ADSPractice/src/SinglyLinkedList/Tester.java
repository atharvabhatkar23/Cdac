package SinglyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		
		
		LinkedList list = new LinkedList();
		
		list.addSorted(10);
		list.addSorted(5);
		list.addSorted(55);
		list.addSorted(59);
		list.addSorted(2);
		list.addSorted(12);
		list.display();
		
		Integer[] intArr = {1,6,3,5,22,8,44};
		List<Integer> intList=Arrays.asList(intArr);
		list.addAll(intList);
		list.display();
		list.remove(2);
		list.display();
		
		
		System.out.println(list);
	}

}
