package StackLinkedList;

public class Stack<T extends Comparable<T>> {
	private Node<T> root;
	private int count;

	public void push(T newdata) {
		this.count++;
		if (root == null) {
			this.root = new Node<T>(newdata);
			;
		} else {
			Node<T> oldroot = this.root;
			this.root = new Node<>(newdata);
			this.root.setNextNode(oldroot);
		}
	}

	public T peek() {
		return this.root.getData();
	}

	public T pop() {
		T itemToPop = this.root.getData();
		this.root = this.root.getNextNode();
		this.count--;
		return itemToPop;
	}

	public int size() {
		return this.count;
	}

	public boolean isEmpty() {
		return this.root == null;
	}

}
