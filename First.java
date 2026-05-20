package morning;

public class First {

	public static void main(String[] args) {
		
//		System.out.println(10+5);
//		System.out.println(10-5);
//		System.out.println(10*3);
//		System.out.println(10+12);
		/*
		 * a=10
		 * a-->variable
		 * 10-->value
		 * Syntax
		 * 
		 * Datatype variable=value;
		 * 
		 */
//		int a=10;
//		a=20;
//		System.out.println(a);
//		int b=40;
//		b=a;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(a+" "+b);
//		System.out.println("value of a is..."+a);
//		
//		int $=12;
//		System.out.println($);
//		
//		int a1=45;
//		int A=78;
//		int AGe=45;
		
		/*
		 *   data type    size
		 *   
		 *   boolean      1 bit
		 *   char         2 byte(16 bit)
		 *   
		 *   byte         1 byte
		 *   short        2 byte
		 *   int          4 byte
		 *   long         8 byte
		 *   
		 *   float        4 byte
		 *   double       8 byte
		 *   
		 *   1 byte=8 bit
		 *   
		 *   To calculate range 
		 *   
		 *   n-->bit
		 *   -2^n-1 to (2^n-1)-1
		 *   
		 *   1)byte range
		 *   
		 *   -2^8-1 to(2^8-1)-1
		 *   -2^7 to (2^7)-1
		 *   -128 to (128)-1
		 *   -128 to 127
		 *   
		 *   2)short range
		 *   -2^16-1 to (2^16-1)-1
		 *   -2^15 to (2^15)-1
		 *   -32768 to (32768)-1
		 *   -32768 to 32767
		 *   
		 *   int a=10;
		 *   cout<<a<<"\n";
		 */
		
		//boolean a=true;
//		char b='r';
//		byte x=-128;
//		short s=-32768;
//		int i=1216655;
//		long l=9442207972l;
//		float d=3.14f;
//		double v=1000000.21656d;
		
//		byte b=127;
//		double d=b;
//		System.out.println(d);
		
		
//		double d=128.65654654654;
//		byte b=(byte)d;
//		System.out.println(b);
		/*
		 * -128 to 127 
		 *         128-->-128
		 *         129-->-127
		 *         130-->-126
		 *         
		 *         
		 */
		
		/*
		 * arithmetic operator
		 * 
		 *   +  -  *   /   %
		 *   
		 *   int a=10,b=6;
		 *   a+b-->16     b+a-->16
		 *   a-b-->4      b-a-->-4
		 *   a*b-->60     b*a-->60
		 *   a/b-->1      b/a-->0
		 *   a%b-->4      b%a-->6
		 *   
		 *   c=128;
		 * 
		 * 
		 */
		
//		int a=12855;
//		int b=a/100;//128
//		System.out.println((a/100)%10);
		
		/*int a=10,b=6;
		 * 
		 *   a+=b-->a=a+b-->a=10+6-->a=16
		 *   a-=b-->a=a-b-->a=16-6-->a=10
		 *   a*=b-->a=a*b-->a=10*6-->a=60
		 *   a/=b-->a=a/b-->a=60/6-->a=10
		 *   a%=b-->a=a%b-->a=10%6-->a=4
		 *   b+=4-->b=b+4-->b=6+4-->b=10
		 */
//		int a=10,b=6;
//		System.out.println(a+=b);
		
		/*
		 * int a=10,b=20,c=10,d=75;
		 * 
		 * a<b-->10<20->true
		 * b<c-->false
		 * b>a-->20>10-->t
		 * a>c-->f
		 * a==c-->t
		 * a==d-->f
		 * a!=d-->t
		 * a!=c-->f
		 * a<=c-->t
		 * d>=a-->t
		 * 
		 * d%2!=0
		 * 75%2!=0
		 * 1!=0-->true
		 * 
		 * b%4==0
		 * 20%4==0
		 * 0==0-->t
		 * 
		 * d%10==5
		 * 75%10==5
		 * 5==5-->t
		 * 
		 */
//		System.out.printf("hello");
		
		
//		int a=10,b=10;
//		System.out.println(a==b);
//		String s="Java";
//		String s1="Java";
//		String s2=new String ("Java");
//		System.out.println(s==s1);
//		System.out.println(s.equals(s2));
		
		
		/*
		 * unary operator
		 * ++(increment)
		 * --(decrement)
		 * a=10
		 * ++a (pre increment)
		 * a++(post increment)
		 * 
		 * a+=b  -->a=a+b
		 * a++   -->a=a+1
		 * ++a   -->a=1+a
		 * 
		 */
		
//		int a=10;
//		a++;
//		System.out.println(a);//11
//		++a;
//		System.out.println(a);//12
//		System.out.println(a++);//12,12+1=13
//		System.out.println(a);//13
//		System.out.println(++a);//14
//		System.out.println(a);//14
//		
//		int b=10;
//		int c=b++ + ++b;//10+11-->21
//		System.out.println(b);//12
//		System.out.println(c);//22
		
//		int c=b++ %2;
//		System.out.println(b);//11
//		System.out.println(c);//0
		
		/*
		 * number types
		 * 1.binary(0s 1s)-->base 2
		 * 2.decimal(0 to 9)-->base 10
		 * 3.octal (0 to 7)-->base 8
		 * 4.hexa decimal(0 to 9)-->base 16
		 * 10-a
		 * 11-b
		 * 12-c
		 * 13-d
		 * 14-e
		 * 15-f
		 * 
		 * 
			 * 128  64   32   16   8   4   2   1
			 * 
			 *  1    1   0     1   1   0   0   0  -->216
			 *  
			 *  1    0   1     1   1   1   0   1  -->189
		 *  
		 *&->   1    0   0     1   1   0   0   0  -->152
		 *
		 *|->   1    1   1     1   1   1   0   1  -->253 
		 *
		 *^->   0    1   1     0   0   1   0   1  --> 101                 
		 * 
		 * 
		 * 
		 *  2    1   bitwise AND(&)   OR(|)   XOR(^)
		 *  
		 *  0    0       0             0       0
		 *    
		 *  0    1       0             1       1
		 *  
		 *  1    0       0             1       1 
		 *  
		 *  1    1       1             1       0
		 */
//		int a=216,b=189;
//		System.out.println(a&b);
//		System.out.println(a|b);
//		System.out.println(a^b);
		
		
		/*
		 *  X    Y   Logical AND(&&)  OR(||)
		 *  
		 *  f    f      f              f
		 *  
		 *  f    t      f              t
		 *  
		 *  t    f      f              t
		 *  
		 *  t    t      t              t
		 *  
		 *  X   !X
		 *  
		 *  t    f
		 *  
		 *  f    t
		 */
		
//		int a=10,b=20,c=10,d=45;
//		System.out.println(a<b && a==c);
//		System.out.println(a>=d && b>c);
//		System.out.println(a>=d || b>c);
//		System.out.println(!(a>=d && b>c));
//		char x='e';
//		int s=17,v=14;
		
		/*
		 * s%10==7 ||  s%7==0
		 * d>a &&  d>b && d>c
		 * x=='a' ||  x=='e' ||  x=='i' ||  x=='o'||  x=='u'
		 */
		
//		int a=10,b=20,c=10;
//		int d=a<b?6565:5546;
//		System.out.println(d);
//		String s=a!=d?"hello":"Bye";
//		System.out.println(s);
		
		/*
		 * conditional statements
		 * 1.if
		 * 2.if-else
		 * 3.if else if
		 * 4.nested if
		 * if(condition)
		 * {
		 *    //block
		 *  }
		 *  else
		 *  {
		 *    //block
		 *  }
		 *
		 */
//		char a='f';
//		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
//		{
//			System.out.println("vowel");
//		}
//		else
//		{
//			System.out.println("Constant");
//		}
		
	}

}
