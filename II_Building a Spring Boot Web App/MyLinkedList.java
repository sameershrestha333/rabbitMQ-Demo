package datastructure.linkedlist;

public class MyLinkedList {
	Node head;

	class Node {

		Node next;
		int data;

		public Node(int data) {
			this.data = data;
		}

	}

	public void addAtEnd(int i) {
		Node newNode = new Node(i);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				if (current.next == null) {
					current.next = newNode;
					return;
				}
				current = current.next;
			}
			current.next = newNode;
		}

	}

	public Object getLength() {
		int count = 0;
		if (head == null) {
			return count;

		}
		Node current = head;
		while (current.next != null) {
			count++;
			current = current.next;
		}
		// adding last element as well
		return ++count;
	}

	public void print() {
		Node current = head;
		while (current.next != null) {
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println(current.data);

	}

	public boolean search(int i) {
		Node current = head;
		while (current.next != null) {
			if (current.data == i) {
				return true;
			}
			current = current.next;
		}

		if (current.data == i) {
			return true;
		}
		return false;
	}

	public Object getNthElement(int i) {
		int count = 0;
		Node current = head;
		while (current.next != null) {
			count++;
			if (count == i) {
				return current.data;
			}
			current = current.next;
		}
		if (++count == i) {
			return current.data;
		}
		return 0;
	}

	public Object getEndElement() {
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		return current.data;
	}

	public Object getMiddleElement() {
		Node frontCount = head;
		Node endCount = head;
		while (endCount != null && endCount.next != null) {
			frontCount = frontCount.next;
			endCount = endCount.next.next;
		}

		return frontCount.data;
	}

	public Object countGivenElement(int i) {
		int count = 0;
		Node current = head;
		while (current.next != null) {
			if (current.data == i) {
				count++;
			}
			current = current.next;
		}
		if (current.data == i) {
			count++;
		}
		return count;
	}
}
