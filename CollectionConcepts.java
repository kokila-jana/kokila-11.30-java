package kokila;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionConcepts {

	public static void main(String[] args)
	{
//		LinkedList<Object> l=new LinkedList<Object>();
//		l.add(12);
//		l.add(12.36);
//		l.add("Hello");
//		l.add('e');
//		l.add("Hello");
//		l.add(false);
//		System.out.println(l);
//		l.addFirst(741);
//		l.addLast(123);
//		System.out.println(l);
//		System.out.println(l.getFirst());
//		System.out.println(l.getLast());
//		System.out.println(l.removeFirst());
//		System.out.println(l.removeLast());
//		System.out.println(l);
//		System.out.println(l.peek());
//		System.out.println(l.peekFirst());
//		System.out.println(l.peekLast());
//		System.out.println(l);
//		System.out.println(l.poll());
//		System.out.println(l);
//		l.pollFirst();
//		l.pollLast();
//		System.out.println(l);
//		System.out.println(l.element());
//		System.out.println(l.pop());
//		System.out.println(l);
//		System.out.println(l);
		
//		HashSet<Object> h=new HashSet<Object>();
//		h.add(12.35);
//		h.add("Hello");
//		h.add(false);
//		h.add(12);
//		h.add('t');
//		h.add(12);
//		System.out.println(h);
		
//		TreeSet<Character> h=new TreeSet<Character>();
//		h.add('a');
//		h.add('S');
//		h.add('3');
//		h.add('#');
//		h.add('t');
//		h.add('h');
//		System.out.println(h);// # 3 S a h t
//		System.out.println(h.ceiling('c'));
//		System.out.println(h.floor('1'));
//		System.out.println(h.higher('S'));
//		System.out.println(h.lower('t'));
//		System.out.println(h.first());
//		System.out.println(h.last());
//		System.out.println(h.headSet('h'));
//		System.out.println(h.tailSet('a'));
//		System.out.println(h.pollFirst());
//		System.out.println(h.pollLast());
//		System.out.println(h);
//		System.out.println();
//		Iterator<Character> it=h.descendingIterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//		System.out.println( );
//		for(Character i:h)
//		{
//			System.out.println(i);
//		}
		
		
//		LinkedHashSet<Object> l=new LinkedHashSet<Object>();
//		l.add(12);
//		l.add(12.36);
//		l.add("Hello");
//		l.add('e');
//		l.add("Hello");
//		l.add(false);
//		System.out.println(l);
//		System.out.println(l);
		
		
		HashMap<Integer, String> h=new HashMap<Integer, String>();
		h.put(14,"Java");
		h.put(45,"Python");
		h.put(78,"Fullstack");
		h.put(98,"Datascience");
		h.put(14,"JavaFS");
		h.put(23,"PowerBI");
		System.out.println(h);
		System.out.println(h.get(14));
		System.out.println(h.remove(98));
		System.out.println(h.replace(45, "Python", "PythonFS"));
		System.out.println(h.entrySet());
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.putIfAbsent(null, null));
		System.out.println(h);
		h.compute(78,(key,val)->val.toUpperCase());
		System.out.println(h);
		h.computeIfPresent(23,(key,val)->val.concat(" java"));
		System.out.println(h);
		h.computeIfAbsent(7,val->"kokila");
		System.out.println(h);
		
		
		
	}

}
