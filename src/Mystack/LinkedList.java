package Mystack;

public class LinkedList {

	private Node head;
	
	public void push(String data) {
		Node newNode = new Node(data, head); // newNode는 입력받은 데이터와 head가 가리키고 있던 노드 가리키도록 설
		head = newNode; // newNode 가리키게 
	}
	
	// test 
	public void printList() {
		for ( Node currNode = head ; currNode != null ; currNode = currNode.node) {
			System.out.print(currNode.data+" ");
		}
		System.out.println();
	}
	
	public String pop() {
		String ans = head.data;
		Node cur = head; // 원래 첫 번쨰 노드의 주소 cul 에 저장 
		
		head = head.node; // 첫번째 노드가 가리키는 2번째 노드의 주소		
		cur = null;		// 첫번째 노드 지우기 
	
		return ans;
	}
	public String peek() {
		return head.data;
	}
	public boolean isEmpty()	{
		boolean ans = head == null ? true : false;
		return ans;
	}
	
}
