package edu.kis.vh.nursery.list;


public class IntLinkedList {
	/*
	 *Class for creating and managin linked list with funcionalities like:
	 *push - put at new last node
	 *isEmpty - checking if list is empty
	 *isFull - checking if list is Full
	 *top - returning the last element without deleting it
	 *pop - returning the last element and deleting it
	 */
    public static final int FALSE = -1;
    Node last;
    int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return FALSE;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return FALSE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
