package dsa.vicky.vish.avltree;

public class AVLTree<T extends Comparable<T>> implements Tree<T> {
	private Node<T> root;

	@Override
	public void insert(T data) {
		root = insertion(root, data);
	}

	private Node<T> insertion(Node<T> node, T data) {
		if (node == null)
			return new Node<T>(data);
		if (data.compareTo(node.getData()) < 0)
			node.setLeftNode(insertion(node.getLeftNode(), data));
		else
			node.setRightNode(insertion(node.getRightNode(), data));
		node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode())) + 1);
		return settlevoilation(data, node);
	}

	private Node<T> settlevoilation(T data, Node<T> node) {
		int balance = getBalanced(node);
		// case 1: left heavy subtree left-left
		if (balance > 1 && data.compareTo(node.getLeftNode().getData()) < 0) {
			System.out.println("Tree is left left heavy...");
			return rightRotation(node);
		}
		// case 2: right heavy tree right-right
		if (balance < -1 && data.compareTo(node.getRightNode().getData()) > 0) {
			System.out.println("Tree is right right heavy...");
			return leftRotation(node);
		}
		// case 3: left right heavy tree==> left right
		if (balance > 1 && data.compareTo(node.getLeftNode().getData()) > 0) {
			System.out.println("Tree is left right heavy...");
			node.setLeftNode(leftRotation(node.getLeftNode()));
			return rightRotation(node);
		}
		// case 4: right left heavy tree==> right left
		if (balance < -1 && data.compareTo(node.getRightNode().getData()) < 0) {
			System.out.println("Tree is right left heavy...");
			node.setRightNode(rightRotation(node.getRightNode()));
			return leftRotation(node);
		}

		return node;
	}

	private Node<T> rightRotation(Node<T> node) {
		System.out.println("rotating in right....node " + node);
		Node<T> tempLeftNode = node.getLeftNode();
		Node<T> temp = tempLeftNode.getRightNode();
		tempLeftNode.setRightNode(node);
		node.setLeftNode(temp);

		node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode())) + 1);
		tempLeftNode.setHeight(Math.max(height(tempLeftNode.getLeftNode()), height(tempLeftNode.getRightNode())) + 1);
		return tempLeftNode;

	}

	private Node<T> leftRotation(Node<T> node) {
		System.out.println("rotating in left....node " + node);
		Node<T> tempRightNode = node.getRightNode();
		Node<T> temp = tempRightNode.getLeftNode();
		tempRightNode.setLeftNode(node);
		node.setRightNode(temp);
		node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode())) + 1);
		tempRightNode.setHeight(Math.max(height(tempRightNode.getLeftNode()), height(tempRightNode.getRightNode())) + 1);
		return tempRightNode;
	}

	private int height(Node<T> node) {
		if (node == null)
			return -1;
		return node.getHeight();
	}

	private int getBalanced(Node<T> node) {
		if (node == null)
			return 0;
		return height(node.getLeftNode()) - height(node.getRightNode());
	}

	@Override
	public void traverse() {
		if (root == null) {
			System.out.println("Tree is empty");
			return;
		}
		inOrderTraversal(root);
	}

	private void inOrderTraversal(Node<T> node) {
		System.out.print(node+"=>");
		
		if (node.getLeftNode() != null)
			inOrderTraversal(node.getLeftNode());
		
		if (node.getRightNode() != null)
			inOrderTraversal(node.getRightNode());
	}

	@Override
	public void delete(T data) {

	}

}
