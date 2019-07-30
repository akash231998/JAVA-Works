package day1;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void sort(byte[] oreo )
	{
		int n=oreo.length,pos=0,com=0;
        while(pos<n-1){
        	com=0;
            while(com<n-pos-1){
                if (oreo[com]>oreo[com+1])
                {
                    /*byte temp=oreo[com];
                    oreo[com]=oreo[com+1];
                    oreo[com+1]=temp;*/
                	
                	oreo[com]^=oreo[com+1];
                	oreo[com+1]^=oreo[com];
                	oreo[com]^=oreo[com+1];
	             }
                com++;
            }
            pos++;
	 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String desired="DataScience";
          byte[] b=desired.getBytes();
          BubbleSort.sort(b);
          for(byte yet:b)
          {
       	   System.out.print((char)yet);
          }
       		  
	}

}
