package homework;

import java.util.Scanner;

public class DuplicateDiv {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int mul=1,c=0;
        System.out.println("Enter the length of array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        System.out.print("Enter the array elements:");
        for(int i=0;i<n;i++)
        {a[i]=sc.nextInt();}
        System.out.println("Enter the num:");
        int num=sc.nextInt();
       for(int i=0;i<n;i++)
        {
    	   for(int j=i+1;j<n;j++)
    	   {
    		    if(a[i]==a[j])
    		     {
    		    	int f=0;
    		    	 for(int k=0;k<b.length;k++)
    	    		    {if(a[i]==b[k]){f=1;}}
    		    	 if(f==0){b[c]=a[i];c++;}
    		     }
    		   }
    	   }
       for(int i=0;i<c;i++)
       {  
    	   if(b[i]%num==0)
    	   {
    		   System.out.println("Output:"+b[i]);
    	   }
    	   }
	}

}
