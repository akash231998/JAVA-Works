package day2;

import java.util.Scanner;

public class Bikes {

	/**
	 * @param args
	 */
	static Scanner s=new Scanner(System.in);
	static int ind;
	static int ind1;
	public static void add(int[] week)
	{
		int index=0;
		while(index<week.length)
		{
			System.out.println("Enter milage:");
			week[index]=s.nextInt();index++;
		}
	}
	public static void traverse(int[] kitkat)
	{
	 if(ind>=kitkat.length){
		 return;
	 }
	 else{
		 System.out.println("Elements:"+kitkat[ind]);ind++;
		 traverse(kitkat);
		 //replace(kitkat);
	 }
	}
	public static void replace(int[] values)
	{
		
		if(ind1>=values.length){
			 return;
		}
		else if(values[ind1]>=30 && values[ind1]<=50)
			{
				values[ind1]=25;
				ind1++;
			}
		replace(values);		
	}
		//traverse(values);
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int[] milage=new int[5];
            Bikes.add(milage);//static fun need not want object to call
            //Bikes.traverse(milage);
            Bikes.replace(milage);
            Bikes.traverse(milage);
	}

}
