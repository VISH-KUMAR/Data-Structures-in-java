package StackLinkedList;

public class App {
	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(11);
		stack.push(111);
		stack.push(1111);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());

		System.out.println(stack.pop());
		System.out.println(stack.peek());

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());

	}

}
