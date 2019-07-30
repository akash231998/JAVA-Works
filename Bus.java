package day2;

import java.util.Scanner;

public class Bus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int bus=0,busFare=0,seats=0,passenger=0,busCollect=0,total=0;
		bus=1;
		while(bus<=4)
		{
			System.out.println("Set the fare amount for bus:"+bus);
			busFare=s.nextInt();
			seats=1;busCollect=0;
			while(seats<=7)
			{
				System.out.println("Enter the amount:");
				passenger=s.nextInt();
				if(passenger>=busFare)
				{
					System.out.println("You can travel");
					busCollect+=busFare;
				}
				else
				{
					System.out.println("You cannot trtavel");
				}
				seats++;
			}
			System.out.println("Bus collection:"+busCollect);
			total+=busCollect;bus++;	
		}
		System.out.println("Total collection for corportion:"+total);
		s.close();
		
		
	}

}
