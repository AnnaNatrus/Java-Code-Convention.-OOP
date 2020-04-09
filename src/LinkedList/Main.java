package test2;

import test2.LinkedList.Node;
import test2.LinkedList.SinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		{
			LinkedList myLinkedlist = new LinkedList();
			myLinkedlist.insertFirst(1);
			myLinkedlist.insertFirst(3);
			myLinkedlist.insertFirst(5);
			myLinkedlist.insertFirst(7);
			myLinkedlist.insertLast(7);
			// Linked list will be 
			// 2 -> 1 ->  7 -> 6 -> 5
			Node node=new Node();
			node.data=1;
			myLinkedlist.deleteAfter(node);
			// After deleting node after 1,Linked list will be 
			// 2 -> 1 -> 6 -> 5
			myLinkedlist.printLinkedList();
		}

	}

}
