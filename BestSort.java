package day2;

public class BestSort {

	/**
	 * @param args
	 */
	public static void sort(double[] source,int start,int mid,int end)
	{
		int leftSize=mid-start+1;
		int rightSize=end-mid);
		double[] left=new double[leftSize];
		double[] right=new double[rightSize];
		int a,b,c;
		for(a=0;a<leftSize;a++)
		{
			left[a]=source[a+start];
		}
		for(b=0;b<leftSize;b++)
		{
			right[b]=source[b+mid+1];
		}
		c=start;
		for(a=0,b=0;a<leftSize&&b<rightSize;)
		{
			if(left[a]>right[b])
			{
				source[c]=right[b];c++;b++;
			}
			else
			{
				source[c]=left[a];a++;
			}
		}
		
	}
	public static void perform(double[] alpha,int start,int end)
	{
	int mid=0;
	if(start<end)
	{
	 mid=start+(end-start)/2;
	 perform(alpha,start,mid);
	 perform(alpha,mid+1,end);
	 sort();
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         double[] mobile={13450,3,7890,7,89000,217000,6};
         BestSort.perform()


  }
}