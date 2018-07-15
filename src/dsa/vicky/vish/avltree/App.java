package dsa.vicky.vish.avltree;

public class App {
	public static void main(String agrs[]) {
		Tree<Integer> avl = new AVLTree<>();
		avl.insert(1);
		avl.insert(2);
		avl.insert(3);
		avl.traverse();
		
	}
}
