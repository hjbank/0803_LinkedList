/*
 * A a = new A
 * A b = a ;
 * A객체는 1개 생성된 것이다.
 * b는 a객체의 레퍼런스를 가리키기 때문에 
 * 
 * */

public class SimpleLinkedList {
	private Node head;
	
	public void addFirstNode(String data)	{
		Node newNode = new Node(data, head);
		head = newNode;
	}
	
	public void printList() {
		for ( Node currNode = head ; currNode != null ; currNode = currNode.link) {
			System.out.println(currNode.data+" ");
		}
		System.out.println();
	}
}
