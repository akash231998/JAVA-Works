package homework;

import java.util.Scanner;

public class JoinSort {

	/**
	 * @param args
	 */
	public static void sort(int[] oreo )
	{
		int pos=0,com=0;int temp=0;
		while(pos<oreo.length)
		{
			com=pos+1;
			while(com<oreo.length)
			{
				if(oreo[pos]>oreo[com])
				{
					temp=oreo[pos];oreo[pos]=oreo[com];oreo[com]=temp;
				}
				com++;
			}
			pos++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    int s=0;
	        System.out.println("Enter the length of array:");
	        int n=sc.nextInt();
	        int[] a=new int[n];
	        int[] b=new int[n];
	        int[] c=new int[n];
	        System.out.print("Enter the array1 elements:");
	        for(int i=0;i<n;i++)
	        {a[i]=sc.nextInt();}
	        System.out.print("Enter the array2 elements:");
	        for(int i=0;i<n;i++)
	        {b[i]=sc.nextInt();}
	        for(int i=0;i<n;i++)
	        {
	        	s=a[i]*100+b[i];
	        	c[i]=s;
	        }
	        for(int i=0;i<n;i++)
	        {  System.out.println("Elements:"+c[i]);
	     	}
	        JoinSort.sort(c);
	        for(int i=0;i<n;i++)
	        {  System.out.println("Elements after sort:"+c[i]);
	     	}
	}

}
