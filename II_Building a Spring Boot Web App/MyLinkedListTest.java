package datastructure.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {
	MyLinkedList linkedList = new MyLinkedList();

	@Test
	public void lengthOfLinkedList() {
		linkedList.addAtEnd(5);
		linkedList.addAtEnd(4);
		linkedList.addAtEnd(3);
		linkedList.print();
		assertEquals(3, linkedList.getLength());
	}

	@Test
	public void getNthElement() {
		linkedList.addAtEnd(5);
		linkedList.addAtEnd(4);
		linkedList.addAtEnd(3);
		assertEquals(5, linkedList.getNthElement(1));
		assertEquals(4, linkedList.getNthElement(2));
		assertEquals(3, linkedList.getNthElement(3));
	}

	@Test
	public void getEndElement() {
		linkedList.addAtEnd(5);
		linkedList.addAtEnd(4);
		linkedList.addAtEnd(3);
		assertEquals(3, linkedList.getEndElement());
		linkedList.addAtEnd(2);
		assertEquals(2, linkedList.getEndElement());
	}

	@Test
	public void searchElement() {
		linkedList.addAtEnd(5);
		linkedList.addAtEnd(4);
		linkedList.addAtEnd(3);
		assertTrue(linkedList.search(5));
		assertTrue(linkedList.search(4));
		assertTrue(linkedList.search(3));
		assertFalse(linkedList.search(2));
		assertFalse(linkedList.search(1));
	}

	@Test
	public void searchMiddleElement() {
		linkedList.addAtEnd(5);
		linkedList.addAtEnd(4);
		linkedList.addAtEnd(3);
		linkedList.addAtEnd(2);
		assertEquals(3, linkedList.getMiddleElement());

	}

	@Test
	public void searchMiddleElementI() {
		linkedList.addAtEnd(5);
		linkedList.addAtEnd(4);
		linkedList.addAtEnd(3);
		assertEquals(4, linkedList.getMiddleElement());

	}
	
	@Test
	public void countGivenElement() {
		linkedList.addAtEnd(5);
		linkedList.addAtEnd(4);
		linkedList.addAtEnd(4);
		assertEquals(2, linkedList.countGivenElement(4));

	}

}
