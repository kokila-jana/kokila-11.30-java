package morning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;

public class CollectionFramework {

	public static void main(String[] args)
	{
	ArrayList<Object> a=new ArrayList<Object>();
	a.add(12);
	a.add(12.36);
	a.add("hello");
	a.add('e');
	a.add(12);
	a.add(true);
	System.out.println(a);
	System.out.println(a.clone());
	System.out.println(a.contains(12));
	System.out.println(a.get(3));
	System.out.println(a.hashCode());
	System.out.println(a.indexOf(12));
	System.out.println(a.lastIndexOf(12));
	System.out.println(a.isEmpty());
	System.out.println(a.remove(1));
	System.out.println(a);
	System.out.println(a.set(2,"Java"));
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a);
	System.out.println();
	for(int i=0;i<a.size();i++)
	{
		System.out.println(a.get(i));
	}
	System.out.println();
	for(Object i:a)
	{
		System.out.println(i);
	}
	System.out.println();
	Iterator<Object> i=a.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	System.out.println();
	ListIterator<Object> li=a.listIterator();
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	System.out.println();
	Spliterator<Object> s=a.spliterator();
	s.forEachRemaining(n->System.out.println(n));
	
	
	
	
	}
/*
 * boxing
 * boolean-->Boolean
 * char-->Character
 * byte-->Byte
 * short-->Short
 * int-->Integer
 * long-->Long
 * float-->Float
 * double-->Double
 * 
 * 
 */
}
