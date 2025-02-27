package test2;

public class LinkedList {

		private class Node {
			int data;
			Node next;
		}

		private Node head;
		private Node tail;
		private int size;

		public int size() {
			return this.size;
		}

		public int getFirst() {

			if (this.size == 0) {
				System.out.println("Is Empty.");
			}

			return this.head.data;

		}

		public int getLast() {

			if (this.size == 0) {
				System.out.println("Is Empty.");
			}

			return this.tail.data;

		}

		public int getAt(int idx) {

			if (this.size == 0) {
				System.out.println("Is Empty.");
			}

			if (idx < 0 || idx >= this.size) {
				System.out.println("Invalid Index.");
			}

			Node temp = this.head;

			for (int i = 1; i <= idx; i++) {
				temp = temp.next;
			}

			return temp.data;

		}

		private Node getNodeAt(int idx) {

			if (this.size == 0) {
				System.out.println("Is Empty.");
			}

			if (idx < 0 || idx >= this.size) {
				System.out.println("Invalid Index.");
			}

			Node temp = this.head;

			for (int i = 1; i <= idx; i++) {
				temp = temp.next;
			}

			return temp;

		}

		public void addLast(int item) {

			// create
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			// attach
			if (this.size > 0)
				this.tail.next = nn;

			// dm update
			if (this.size == 0) {
				this.head = nn;
				this.tail = nn;
				this.size += 1;
			} else {
				this.tail = nn;
				this.size += 1;
			}

		}

		public void addFirst(int item) {

			// create
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			// attach
			nn.next = this.head;

			// dm update
			if (this.size == 0) {
				this.head = nn;
				this.tail = nn;
				this.size++;
			} else {
				this.head = nn;
				this.size++;
			}

		}

		public void addAt(int item, int idx) {

			if (idx < 0 || idx > this.size) {
				System.out.println("Invalid Index.");
			}

			if (idx == 0) {
				addFirst(item);
			} else if (idx == this.size) {
				addLast(item);
			} else {

				// create
				Node nn = new Node();
				nn.data = item;
				nn.next = null;

				// attach
				Node nm1 = getNodeAt(idx - 1);
				Node np1 = nm1.next;

				nm1.next = nn;
				nn.next = np1;

				// dm
				this.size++;
			}

		}

		public int removeFirst() {

			if (this.size == 0) {
				System.out.println("Is Empty.");
			}

			Node temp = this.head;

			if (this.size == 1) {
				this.head = null;
				this.tail = null;
				this.size = 0;
			} else {
				this.head = this.head.next;
				this.size--;
			}
			return temp.data;
		}

		public int removeLast() {

			if (this.size == 0) {
				System.out.println("Is Empty.");
			}

			Node temp = this.tail;

			if (this.size == 1) {
				this.head = null;
				this.tail = null;
				this.size = 0;
			} else {
				Node sm2 = getNodeAt(this.size - 2);
				sm2.next = null;
				this.tail = sm2;
				this.size--;
			}
			return temp.data;
		}

		public int removeAt(int idx) {

			if (this.size == 0) {
				System.out.println("Is Empty.");
			}

			if (idx < 0 || idx >= this.size) {
				System.out.println("Invalid Index.");
			}

			if (idx == 0) {
				return removeFirst();
			} else if (idx == this.size - 1) {
				return removeLast();

			} else {

				Node nm1 = getNodeAt(idx - 1);
				Node n = nm1.next;
				Node np1 = n.next;

				nm1.next = np1;
				this.size--;
				return n.data;

			}

		}

		public void display() {
			Node temp = this.head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}

		}
		
}	
		
