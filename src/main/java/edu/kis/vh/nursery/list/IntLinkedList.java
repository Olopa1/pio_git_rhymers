package edu.kis.vh.nursery.list;


public class IntLinkedList {
	/*
	 *Class for creating and managing linked list with functionalities like:
	 *push - put at new last node
	 *isEmpty - checking if list is empty
	 *isFull - checking if list is Full
	 *top - returning the last element without deleting it
	 *pop - returning the last element and deleting it
	 */
    private static final int FALSE = -1;
    private Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
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
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return FALSE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

	public static int getFalse() {
		return FALSE;
	}

}
