package day2;

import java.util.Scanner;

public class Control {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner s=new Scanner(System.in);
          String model=" ";float price;
          System.out.println("Please methion model");
          model=s.nextLine();
          System.out.println("Please model price");
          price=s.nextInt();
          double interest=10.00;
          
          double emi=(price+(price*0.1))/36;
          
	}

}
