
public class Node {
	
	// 데이터 필드
	String data;
	// 링크 필드
	Node link;
	
	// 초기화
	public Node( String data, Node link) {
		
		this.data = data;
		this.link = link;
	}
	
	public Node (String data) {
		
		this.data = data;
	}
	
	
}
