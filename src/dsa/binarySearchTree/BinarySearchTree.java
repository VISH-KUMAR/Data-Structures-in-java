package dsa.binarySearchTree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {
	private Node<T> root;

	@Override
	public void insert(T data) {
		if (root == null) {
			root = new Node<T>(data);
		} else {
			insertNode(data, root);
		}
	}

	@Override
	public T getMinValue() {
		if (root == null) {
			return null;
		} else {
			return getMin(root);
		}
	}

	@Override
	public T getMaxValue() {
		if (root == null) {
			return null;
		} else {
			return getMax(root);
		}
	}

	@Override
	public void traverse() {
		if (root == null)
			return;
		inOrderTraversal(root);

	}

	private void inOrderTraversal(Node<T> root2) {
		if (root2.getLeftChild() != null)
			inOrderTraversal(root2.getLeftChild());
		System.out.println(root2.getData());
		if (root2.getRightChild() != null)
			inOrderTraversal(root2.getRightChild());
	}

	private void insertNode(T newdata, Node<T> node) {
		if (newdata.compareTo(node.getData()) < 0) { // if(newdata<node.getData()) will also work
			if (node.getLeftChild() == null) {
				Node<T> lnode = new Node<>(newdata);
				node.setLeftChild(lnode);
			} else {
				insertNode(newdata, node.getLeftChild());
			}
		} else {
			if (node.getRightChild() == null) {
				Node<T> rnode = new Node<>(newdata);
				node.setRightChild(rnode);
			} else {
				insertNode(newdata, node.getRightChild());
			}
		}
	}

	@Override
	public void delete(T data) {
		if(root == null)
			return ;
		root = deleteNode(root , data);
	}

	private Node<T> deleteNode(Node<T> root2, T data) {
		if(root2==null) return null;
		if(data.compareTo(root2.getData())<0)
				root2.setLeftChild(deleteNode(root2.getLeftChild() , data));
		else if(data.compareTo(root2.getData())>0)
				root2.setRightChild(deleteNode(root.getRightChild() , data));
		else {
			if(root2.getLeftChild()==null && root2.getRightChild() == null) {
				System.out.println("Removing a leaf node  ...");
				return null;
			}
			if(root2.getLeftChild() == null) {
				System.out.println("Removing the single right child");
				Node<T>  Temp = root2.getRightChild();
				Temp = null;
				return Temp;
			}
			else if(root2.getRightChild() == null) {
				System.out.println("Removing the single left child");
				Node<T>  Temp = root2.getLeftChild();
				Temp = null;
				return Temp;
			}
		}
		return root2;
	}

	private T getMax(Node<T> node) {
		if (node.getRightChild() != null) {
			return getMax(node.getRightChild());
		}
		return node.getData();

	}

	private T getMin(Node<T> node) {
		if (node.getLeftChild() != null) {
			return getMin(node.getLeftChild());
		}
		return node.getData();

	}

}
