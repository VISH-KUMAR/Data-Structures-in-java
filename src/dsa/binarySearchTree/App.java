
package dsa.binarySearchTree;

import java.util.Scanner;

public class App {
	public static void main(String args[]) {
	Tree<Integer> bst = new BinarySearchTree<>();
	Scanner sc = new Scanner(System.in);
	bst.insert(10);
	bst.insert(12);
	bst.insert(45);
	bst.insert(1);
	bst.insert(130);
	bst.insert(-2);
	
	System.out.println(bst.getMaxValue());
	System.out.println(bst.getMinValue());
	bst.traverse();
	bst.delete(130);
	System.out.println(bst.getMaxValue());
	}
}
