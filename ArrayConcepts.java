package morning;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcepts {

	public static void main(String[] args)
	{
//		int a[]= {1,265,6,696,6,6326,326};
////		System.out.println(a[0]);
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		/*
		 * java Array syntax
		 * 
		 * data-type variable[]=new data-type[size];
		 */
		
//		int a[]=new int[5];
//		a[0]=12;
//		a[1]=45;
//		a[2]=78;
//		a[3]=96;
//		a[4]=123;
//		System.out.println(a.length);
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(a[i]);
//		}
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter array size...");
//		int size=sc.nextInt();
//		int a[]=new int[size];
//		System.out.println("enter array elements...");
//		for(int i=0;i<a.length;i++)
//		{
//			a[i]=sc.nextInt();
//		}
//		System.out.println("array elements...");
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
//		
//		System.out.println("Enter your key...");
//		int key=sc.nextInt();
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]==key)
//			{
//				System.out.println("Element found "+i+" index position");
//			}
//
//		}
		
//		Arrays.sort(a);
//		for(int i=0;i<a.length-1;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]<a[j])
//				{
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
		/*
		 *   45   32  22
		 *   0     1   2
		 * 1)i=0 i<2
		 *   j=0+1-->1  1<3
		 *   	if(a[i]>a[j])-->45>32-->t
		 *      temp=45
		 *      a[0]=32
		 *      a[1]=45
		 *      
		 *      32   45   22
		 *      0     1    2
		 *   
		 *   j=2   2<3
		 *   	if(a[i]>a[j])-->32>22-->t
		 *   	temp=32
		 *  	 a[0]=22
		 *       a[2]=32-->22   45   32
		 *   j=3  3<3(false)
		 *   
		 *2)i=1   1<2
		 *   j=i+1-->2  2<3
		 *     if(a[i]>a[j])-->45>32-->t
		 *     temp=45
		 *     a[1]=32
		 *     a[2]=45-->22  32  45
		 *   j=3  3<3(false)
		 *3)i=2  2<2(false)
		 *   
		 *   
		 *   
		 */	
//		System.out.println("Ascending array elements...");
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
//		Arrays
		
//		 Scanner scan = new Scanner(System.in);
//	        int i = scan.nextInt();
//	        double d=scan.nextDouble();
//	        scan.nextLine();
//	        String s=scan.nextLine();
//
//	        
//	        System.out.println("String: " + s);
//	        System.out.println("Double: " + d);
//	        System.out.println("Int: " + i);
		
		
		
		
		
		
		
		
//		int min=a[0];
//		for(int i=1;i<size;i++)
//		{
//			if(a[i]<min)
//			{
//				min=a[i];
//			}
//		}
//		System.out.println("minimum element is..."+min);
//		
//		int max=a[0];
//		for(int i=1;i<size;i++)
//		{
//			if(a[i]>max)
//			{
//				max=a[i];
//			}
//		}
//		System.out.println("maximum element is..."+max);
		
		
		
		/*    0 1 2
		 * 0->1,2,3
		 * 1->4,5,6
		 * 2->7,8,9
		 */
//		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
////		System.out.println(a[1][1]);
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		/*
		 * data-type variable[][]=new data-type[row][column];
		 */
		
//		int a[][]=new int[][] {{1,2,3},{5,6,7}};
//		for(int i=0;i<2;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter row and column size...");
//		int r=sc.nextInt();
//		int c=sc.nextInt();
//		int a[][]=new int[r][c];
//		int b[][]=new int[r][c];
//		System.out.println("Enter first Array elements...");
//		for(int i=0;i<r;i++)
//		{
//			for(int j=0;j<c;j++)
//			{
//				a[i][j]=sc.nextInt();
//			}
//		}
//		System.out.println("Enter second Array elements...");
//		for(int i=0;i<r;i++)
//		{
//			for(int j=0;j<c;j++)
//			{
//				b[i][j]=sc.nextInt();
//			}
//		}
//		System.out.println("The First Array elements...");
//		for(int i=0;i<r;i++)
//		{
//			for(int j=0;j<c;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("The Second Array elements...");
//		for(int i=0;i<r;i++)
//		{
//			for(int j=0;j<c;j++)
//			{
//				System.out.print(b[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		int result[][]=new int[r][c];
//		for(int i=0;i<r;i++)
//		{
//			for(int j=0;j<c;j++)
//			{
//				result[i][j]=a[i][j]+b[i][j];
//			}
//		}
//		System.out.println("The Result Array elements...");
//		for(int i=0;i<r;i++)
//		{
//			for(int j=0;j<c;j++)
//			{
//				System.out.print(result[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		/*      0    1
		 * 0--> 1    2
		 * 1--> 3    4
		 * r=2
		 * c=2
		 * 1)i=0  0<2
		 *   j=0  0<2
		 *   a[0][0]=1
		 *   j=1  1<2
		 *   a[0][1]=2
		 *   j=2  2<2(false)
		 * 2) i=1  1<2
		 *     j=0  0<2
		 *     a[1][0]-->3
		 *     j=1  1<2
		 *     a[1][1]=4
		 */
		
		
		
		
	}

}
