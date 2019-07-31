package homework;

import java.util.Scanner;

public class MaxArray {

	/**
	 * @param args
	 */
	/*public static int maxElement(int[] arr) 
    { 
        int i;  
        int max = arr[0];   
        for (i = 1; i < arr.length; i++) 
            if (arr[i] > max) 
                max = arr[i]; 
       
        return max; 
    } 
	public static int minElement(int[] arr) 
    { 
        int i;  
        int min = arr[0];   
        for (i = 1; i < arr.length; i++) 
            if (arr[i] < min) 
                min = arr[i]; 
       
        return min; 
    }*/ 
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
        System.out.println("Enter the length of array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        System.out.print("Enter the array1 elements:");
        for(int i=0;i<n;i++)
        {a[i]=sc.nextInt();}
        System.out.print("Enter the array2 elements:");
        for(int i=0;i<n;i++)
        {b[i]=sc.nextInt();}
        MaxArray.sort(a);
        MaxArray.sort(b);
        int max1=a[n-1];
        int max2=b[n-1];
        int min=a[0];
        int c=n-1,i=1,max=0;
        while(max1==max2)
        {
        	max1=a[c-i];
            max2=b[c-i];
            i++;
        }
        if(max1>max2){
        	max=max1;
        }
        else{
        	max=max2;
        }
        int num=max2<<min;
        System.out.println(num);
	}

}
