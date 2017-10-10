package lab7LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListOp {

	public static void main(String[] args) {
		LinkedList<String> a = new LinkedList<String>();
		LinkedList<String> b = new LinkedList<String>();
		
		//add stuff in A
		a.add("Tulsa");
		a.add("Ada");
		a.add("Broken Arrow");
		a.add("Owasso");
		
		System.out.println("list A: \n" + a);
		
		//add another
		a.add(1, "OKC");
		System.out.println("Add 2nd element: \n" + a);
		
		//add stuff in B
		b.add("74104");
		b.add("74135");
		b.add("foo");
		b.add("hello world");
		b.add("777");
		
		System.out.println("list B: \n" + b);
		
		//append B onto the end of A
		a.addAll(b);
		System.out.println("B added onto A: \n" + a);
		
		//delete every other element
		int j=2;
		for(int i = 1; i<a.size(); i++) {
			if(j%2==0) {
				if(i%2!=0){
					a.remove(i);
				}
			}
			else {
				if(i%2==0) {
					a.remove(i);
				}
			}
			j++;
		}
		
		System.out.println("Every other element removed:\n"+ a);
		
		LinkedList<String> c = new LinkedList<String>();
		ListIterator<String> iter = a.listIterator();
		
		//deep copy
		String f;
		for(int i = 0; i<a.size(); i++) {
			f = iter.next();
			c.add(f);
		}
		
		System.out.println("list C: \n" + c);
		
	}

}
