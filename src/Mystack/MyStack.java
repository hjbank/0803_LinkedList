package Mystack;

public class MyStack {
	public static void main(String[] args) {
		LinkedList stack = new LinkedList();
		
		stack.push("1");
		stack.printList();
		stack.push("2");
		stack.printList();
		stack.push("3");
		stack.printList();
		System.out.println("---");
		System.out.print(stack.pop());
		System.out.println();
		System.out.println("---");
		System.out.print(stack.pop());
		System.out.println();
		System.out.println("---");
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
	}
}
