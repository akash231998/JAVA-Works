package day1;

public class UpperFloyd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		char setOne='A',setTwo='c';int row=4,space=1,letter=0;
		while(row>=1)
		{
			space=1;
			while(space<row)
			{
				System.out.print(" ");space++;
	            if(row<3)
	            {
	            	setTwo+=row;
	            }
	            else
	            {
	            	setOne+=row;
	            }
			}
			letter=4;
			while(letter>=row&&letter>0)
			{
				if(row<3)
				{
					System.out.print(setTwo);
					setTwo+=row;
				}
				else
				{
					System.out.print(setOne);setOne+=row;
				}
				letter--;
			}
			System.out.println();
			row--;
		}
	}
	
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*char c='A';
          for(int i=1;i<=4;i++)
          {
        	  for(int j=3;j>=0;j--)
        	  {
        		  if((j+i)<4)
        		  {
        			  int a=(int)c+5-i;
        			  c=(char)a;
        			  System.out.print(" ");
        		  }
        	  }
        	  for(int k=1;k<=4;k++)
        	  {
        		  if(i+k>=5)
        		  {
        			  System.out.print(c);
        		  }
        		  
        	  }
        	  
        	  System.out.println(); 
          }*/
	
