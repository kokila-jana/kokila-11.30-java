package morning;

import java.util.Arrays;

public class StringConcepts {

	public static void main(String[] args) {
//		String s="Hello";
//		String s1=new String("Java");
//		System.out.println(s);
//		System.out.println(s.charAt(2));
//		System.out.println(s.codePointAt(0));
//		System.out.println(s1.codePointBefore(2));
//		System.out.println(s1.compareTo("JavA"));
//		System.out.println(s.compareToIgnoreCase("hello"));
//		System.out.println(s.concat(s1));
//		System.out.println(s.contains("lop"));
//		System.out.println(s.contentEquals("Hello"));
//		System.out.println(s.endsWith("lo"));
//		System.out.println(s.equals("Hello"));
//		System.out.println("YES".equalsIgnoreCase("yes"));
//		System.out.println(s.indent(5));
//		System.out.println(s.indexOf('l'));
//		System.out.println(s.lastIndexOf('l'));
//		System.out.println(s.length());
//		String s2=" ";
//		System.out.println(s2.isEmpty());
//		System.out.println(s2.isBlank());
//		System.out.println(s.replace('e', 'i'));
//		System.out.println(s.startsWith("He"));
//		System.out.println(s.toLowerCase());
//		System.out.println(s.toUpperCase());
//		String s3="      Python     ";
//		System.out.println(s3.strip());
//		System.out.println(s3.stripLeading());
//		System.out.println(s3.stripTrailing());
//		String s4="Hii I am Fullstack developer";
//		String ss[]=s4.split(" ");
//		for(int i=0;i<ss.length;i++)
//		{
//			System.out.println(ss[i]);
//		}
//		char a[]=s.toCharArray();
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
//		System.out.println(s.substring(3));
//		System.out.println(s.substring(0, 3));
//		System.out.println(s3.trim());
//		
		
//		String s="Java";
//		String s1="";
//		for(int i=0;i<s.length();i++)
//		{
//			s1=s.charAt(i)+s1;
//		}
//		System.out.println(s1);
		
//		String s="malayalam";
//		char c[]=s.toCharArray();// J  a  v  a
//		String s1="";
//		for(int i=0;i<c.length;i++)
//		{
//			s1=c[i]+s1;
//		}
//		System.out.println(s1);
//		if(s.equals(s1))
//		{
//			System.out.println("PAlindrome");
//		}
//		else
//		{
//			System.out.println("not palindrome");
//		}
		/*
		 * s1=J+""-->s1=J
		 * s1=a+J-->s1=aJ
		 * s1=v+aJ-->s1=vaJ
		 * s1=a+vaJ-->s1=avaJ
		 */
		
//		String s="race",s1="care";
//		char a[]=s.toCharArray();
//		char b[]=s1.toCharArray();
//		Arrays.sort(a);
//		Arrays.sort(b);
//		if(Arrays.equals(a, b))
//		{
//			System.out.println("Anagram");
//		}
//		else
//		{
//			System.out.println("not anagram");
//		}
		
		String s="race";
		char a[]=s.toCharArray();
		System.out.println();
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		String ss=new String(a);
		System.out.println(ss);
	}

}
