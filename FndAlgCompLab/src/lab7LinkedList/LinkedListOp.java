package lab7LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListOp {

	public static void main(String[] args) {
		LinkedList<String> a = new LinkedList<String>();
		LinkedList<String> b = new LinkedList<String>();
		
		a.add("Tulsa");
		a.add("Ada");
		a.add("Broken Arrow");
		a.add("Owasso");
		
		System.out.println(a);
		
		a.add(1, "OKC");
		System.out.println(a);
		
		b.add("74104");
		b.add("74135");
		b.add("foo");
		b.add("hello world");
		b.add("777");
		
		System.out.println(b);
		
		a.addAll(b);
		System.out.println(a);
		
		for(int i = 1; i<a.size(); i++) {
			if(i%2!=0){
				a.remove(i);
			}
		}
		if(a.size()%2!=0) {
			a.removeLast();
		}
		
		System.out.println(a);
		
		LinkedList<String> c = new LinkedList<String>();
		ListIterator<String> iter = a.listIterator();
		
		//deep copy
		String f;
		for(int i = 0; i<a.size(); i++) {
			f = iter.next();
			c.add(f);
		}
		
		System.out.println("list c: " + c);
		
	}

}
