package LinkedList;

public class LinkedList<T extends Comparable<T>> implements List<T> {
	private Node<T>  root;
	private int sizeOfList;
	@Override
	public void insert(T data) {
		++this.sizeOfList;
		if(root == null) {
			this.root=new Node<T>(data);    ///making the new node as root node
		}else {
			insertAtStart(data);
		}
	}

	private void insertAtStart(T data) {
		Node<T> newNode = new Node<T>(data);//creating a new node
		newNode.setNextNode(root);     //pointing this new node to root node
		this.root = newNode;           //Updating the root node
	}
	private void insertAtEnd(T data, Node<T> node) {
		if(node.getNextNode()!= null) {
			insertAtEnd( data, node.getNextNode());
		}else {
			Node<T> newNode = new Node<T>(data);
			node.setNextNode(newNode);
		}
	}

	@Override
	public void remove(T data) {
		if(this.root == null )  return;
			--this.sizeOfList;
		if(this.root.getData().compareTo(data)==0) {
			this.root = this.root.getNextNode();
		}else {
			remove(data , root, root.getNextNode());
		}
		
	}
	private void remove(T dataToRemove , Node<T> previousNode,Node<T> actualNode) {
		while(actualNode!=null) {
			if(actualNode.getData().compareTo(dataToRemove)==0) {    //finding the correct data to remove
				previousNode.setNextNode(actualNode.getNextNode());
				actualNode =null;
				return ;
			}
			previousNode = actualNode;
			actualNode = actualNode.getNextNode();
		}
	}

	@Override
	public void traverseLinkList() {
		if(this.root == null) return;
		Node<T> actualNode = root;
		while(actualNode!=null) {
			System.out.print(actualNode.getData()+"->");
			actualNode = actualNode.getNextNode();
		}
		
	}

	@Override
	public int size() {
		return this.sizeOfList;
		}

}
