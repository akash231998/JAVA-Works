package day1;

public class Pattern1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int n=3;
             char ch='Z';
             for(int r=1;r<=n;r++)
             {
            	 for(int sp=1;sp<=n;sp++)
            	 {
            		 if(r+sp<4)
            		 {
            			 System.out.print(" "); 
            		 }
            	 }
            	 for(int c=1;c<=n+2;c++)
            	 {
            		 if(r+c>=4)
            		 {
            			 
            			 System.out.print(ch);
            			 ch-=r;
            		 }
            	 }
            	 System.out.println(); 
             }
	}

}
