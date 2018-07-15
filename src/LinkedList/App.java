package LinkedList;

public class App {
	public static void main(String args[]) {
//		List<Integer> list = new LinkedList<>();
//		list.insert(12);
//		list.insert(13);
//		list.insert(14);
//		list.insert(15);
//		list.insert(16);
//		list.traverseLinkList();
//		list.remove(13);
//		System.out.println("Aftert removing an element");
//		list.traverseLinkList();
//		list.size();
		List<Person> list = new LinkedList<>();
		list.insert(new Person(12,"vicky"));
		list.insert(new Person(12,"vvv"));
		list.insert(new Person(12,"vick"));
		list.insert(new Person(12,"sam"));
		list.insert(new Person(12,"vish"));
		list.traverseLinkList();
		list.remove(new Person(12,"sam"));
		System.out.println("Aftert removing an element");
		list.traverseLinkList();
		list.size();
	}
}
