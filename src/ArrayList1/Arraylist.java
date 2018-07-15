package ArrayList1;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("vicky");
		list.add("vish");
		list.add("golu");              //Adding elements in list
		list.add("vkey");
		for(String e : list)
				System.out.println(e);
		list.remove(3);
		System.out.println("After removing the element");
		for(String e : list)
			System.out.println(e);
		System.out.println(list.get(0));     //random accesssing
		System.out.println(list.size()+" "+list.toString()+" "+ list.isEmpty());
		Object[] array = list.toArray();
		for(Object e : array)
			System.out.println(e);
		 	
	}
}
